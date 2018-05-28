package org.seasailing.db;

import com.google.protobuf.BoolValue;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import io.vavr.collection.Seq;
import io.vavr.control.Either;
import io.vavr.control.Validation;
import org.junit.Test;
import org.seasailing.core.Business;
import org.seasailing.protobuf.BoatDTO;
import org.seasailing.protobuf.ClubDTO;
import org.seasailing.protobuf.Msg;
import org.seasailing.protobuf.PersonDTO;

import java.util.Collection;
import java.util.Optional;

import static junit.framework.TestCase.assertTrue;

public class QueryRepoTest {

    static ClubDTO club = ClubDTO.newBuilder()
            .setId(Int32Value.of(1))
            .build();

    static BoatDTO.BoatNameDTO boatNameDTO =
            BoatDTO.BoatNameDTO.newBuilder()
                    .setName(StringValue.of("Boat too"))
                    .build();


    static PersonDTO personDTO = PersonDTO.newBuilder()
                                    .setEmail(StringValue.of("email@email.com"))
                                    .setName(StringValue.of("Bob Jones"))
                                    .setPhone(StringValue.of("901-201-1234"))
                                    .build();

    static BoatDTO boatDTO = BoatDTO.newBuilder()
            .setName(boatNameDTO)
            .setRating(Int32Value.of(143))
            .setActive(BoolValue.of(true))
            .setClub(club)
            .setLength(DoubleValue.of(34.5D))
            .setMake(StringValue.of("J-34"))
            .setSkipper(personDTO)
            .build();



    @Test
    public void getAllActiveBoatsFromClubTest() {
        Optional<Collection<BoatDTO.BoatNameDTO>> boats = QueryRepo.getAllActiveBoatsFromClub.apply(club);
        assertTrue(boats.isPresent());
        assertTrue(boats.get().size()>0);
    }

    @Test
    public void saveBoatTest() {
        Optional<BoatDTO> boat = QueryRepo.saveBoat.apply(boatDTO);
        assertTrue(boat.isPresent());
        assertTrue(boat.get().hasName());
        assertTrue(boat.get().getName().hasId());
    }

    @Test
    public void validateBoatTest() {
        Either<Collection<Msg>, BoatDTO> validation = Business.CanSaveBoat.validate(boatDTO);
        assertTrue(validation.isRight());
    }
}
