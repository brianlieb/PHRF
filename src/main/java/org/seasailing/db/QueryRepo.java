package org.seasailing.db;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.seasailing.db.hibernate.Sailboat;
import org.seasailing.db.util.BaseRepository;
import org.seasailing.db.util.HibernateSessionFactory.DataSource;
import org.seasailing.db.util.Qry;
import org.seasailing.db.util.SessionUtility;
import org.seasailing.db.util.Transaction;
import org.seasailing.protobuf.BoatDTO;
import org.seasailing.protobuf.ClubDTO;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import static org.seasailing.db.Mapper.*;

public class QueryRepo extends BaseRepository {

    private static final SessionUtility.CritQuery boatQuery =
            session -> session.createCriteria(Sailboat.class, "sailboat");

    /*
    @SuppressWarnings("unchecked")
    private static final Function<Optional<Integer>, Qry<Collection<Sailboat>>> qryAllSailboatsForClub =
            clubId ->
                    session -> clubId.map(id -> boatQuery.apply(session)
                                    .add(Restrictions.eq("club.clubId", id))
                                    .list());


    @SuppressWarnings("unchecked")
    private static final Function<Integer, Qry<Collection<Sailboat>>> qryAllActiveSailboatsForClub =
            clubId ->
                    session -> clubId.map(c -> boatQuery.apply(session)
                                    .add(Restrictions.eq("active", true))
                                    .add(Restrictions.eq("club.clubId", c))
                                    .list());
*/

    private static final Function<Integer, Qry<Sailboat>> qryBoatById =
            id ->
                    session -> id!=null?
                                    Optional.ofNullable((Sailboat) boatQuery.apply(session)
                                    .add(Restrictions.eq("sailboatId", id))
                                    .uniqueResult()):
                                    Optional.empty();


    @SuppressWarnings("unchecked")
    private static final Function<Integer, Qry<Collection<Sailboat>>> qryAllActiveSailboatsForClub =
            clubId ->
                    session -> clubId!=null?
                            Optional.ofNullable(boatQuery.apply(session)
                            .add(Restrictions.eq("active", true))
                            .add(Restrictions.eq("club.clubId", clubId))
                            .list()):
                            Optional.empty();


    protected static final <W,X,Y,Z> Function<W, Qry<Z>> prepareQry(Function<W,X> prepMap, Function<X, Qry<Y>> results, Function<Y,Z> mapper) {
        return input ->
                session ->
                Optional.ofNullable(input)
                    .map(prepMap)
                    .map(x -> results.apply(x).execute(session).orElse(null))
                    .map(mapper);
    }

    static final Function<ClubDTO, Optional<Collection<BoatDTO.BoatNameDTO>>> getAllActiveBoatsFromClub =
            club -> prepareQry(GET_ID_FROM_CLUB, qryAllActiveSailboatsForClub, collectionMapper(MAKE_BOAT_NAME_DTO))
                    .apply(club)
                    .run(DataSource.DEFAULT);

    static final Function<BoatDTO.BoatNameDTO, Optional<BoatDTO>> getBoatById =
            name -> prepareQry(GET_ID_FROM_BOAT_NAME, qryBoatById, MAKE_BOAT_DTO)
                        .apply(name)
                        .run(DataSource.DEFAULT);

    public static final Function<BoatDTO, Optional<BoatDTO>> SAVE_BOAT =
        boat -> prepareQry(MAKE_BOAT, BaseRepository::saveOrUpdate, MAKE_BOAT_DTO).apply(boat)
                    .run(DataSource.DEFAULT);





}
