package org.seasailing.db;

import org.hibernate.criterion.Restrictions;
import org.seasailing.db.hibernate.Sailboat;
import org.seasailing.db.util.BaseRepository;
import org.seasailing.db.util.HibernateSessionFactory.DataSource;
import org.seasailing.db.util.Qry;
import org.seasailing.db.util.SessionUtility;
import org.seasailing.protobuf.BoatDTO;
import org.seasailing.protobuf.ClubDTO;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Function;
import static org.seasailing.db.Mapper.*;

public class QueryRepo extends BaseRepository {

    private static final SessionUtility.CritQuery boatQuery =
            session -> session.createCriteria(Sailboat.class, "sailboat");

    @SuppressWarnings("unchecked")
    private static final Function<Optional<Integer>, Qry<Collection<Sailboat>>> qryAllSailboatsForClub =
            clubId ->
                    session -> clubId.map(id -> boatQuery.apply(session)
                                    .add(Restrictions.eq("club.clubId", id))
                                    .list());


    @SuppressWarnings("unchecked")
    private static final Function<Optional<Integer>, Qry<Collection<Sailboat>>> qryAllActiveSailboatsForClub =
            clubId ->
                    session -> clubId.map(c -> boatQuery.apply(session)
                                    .add(Restrictions.eq("active", true))
                                    .add(Restrictions.eq("club.clubId", c))
                                    .list());

    private static final Function<Optional<Integer>, Qry<Sailboat>> qryBoatById =
            id ->
                    session -> id.map(i ->
                                    (Sailboat) boatQuery.apply(session)
                                    .add(Restrictions.eq("sailboatId", i))
                                    .uniqueResult());

    @SuppressWarnings("unchecked")
    private static final Function<Optional<String>, Qry<Collection<Sailboat>>> qryBoatsByName =
            name ->
                    session -> name.map(n -> boatQuery.apply(session)
                                    .add(Restrictions.eq("name", n))
                                    .list());


    static final Function<ClubDTO, Optional<Collection<BoatDTO.BoatNameDTO>>> qryAllBoatsFromClub =
            club -> prepareQry(qryAllSailboatsForClub.compose(GET_ID_FROM_CLUB).apply(club), collectionMapper(MAKE_BOAT_NAME_DTO))
                        .run(DataSource.DEFAULT);

    static final Function<BoatDTO.BoatNameDTO, Optional<BoatDTO>> getBoatById =
            name -> prepareQry(qryBoatById.compose(GET_ID_FROM_BOAT_NAME).apply(name), MAKE_BOAT_DTO).run(DataSource.DEFAULT);

    static final Function<BoatDTO.BoatNameDTO, Optional<Collection<BoatDTO>>> getBoatsByName =
            name -> prepareQry(qryBoatsByName.compose(GET_NAME_FROM_BOAT_NAME).apply(name), collectionMapper(MAKE_BOAT_DTO)).run(DataSource.DEFAULT);

}
