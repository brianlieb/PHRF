package org.seasailing.db;

import com.google.protobuf.BoolValue;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import io.vavr.Function2;
import io.vavr.Function3;
import org.seasailing.db.hibernate.Club;
import org.seasailing.db.hibernate.Course;
import org.seasailing.db.hibernate.Sailboat;
import org.seasailing.db.hibernate.Series;
import org.seasailing.protobuf.*;

import java.util.function.Function;

public class Mapper {

    static final Function3<String, String, String, PersonDTO> MAKE_PERSON_DTO =
            (name, phone, email) -> {
                PersonDTO.Builder builder = PersonDTO.newBuilder();
                if (name!=null) builder.setName(StringValue.of(name));
                if (phone!=null) builder.setPhone(StringValue.of(phone));
                if (email!=null) builder.setEmail(StringValue.of(email));
                return builder.build();
            };

    static final Function2<Integer, String, HandicapDTO> MAKE_HANDICAP_DTO =
            (den, type) -> {
                HandicapDTO.Builder builder = HandicapDTO.newBuilder();
                if (den!=null) builder.setDenominator(Int32Value.of(den));
                if (type!=null) builder.setMethod(HandicapDTO.Method.valueOf(type));
                return builder.build();
            };


    static final Function<Club, ClubDTO> MAKE_CLUB_DTO =
            club -> {
                ClubDTO.Builder builder = ClubDTO.newBuilder();
                if (club.getClubId()!=null) builder.setId(Int32Value.of(club.getClubId()));
                if (club.getClub()!=null) builder.setName(StringValue.of(club.getClub()));
                if (club.getClubEmail()!=null) builder.setEmail(StringValue.of(club.getClubEmail()));
                if (club.getHandicapper()!=null || club.getHandicapperEmail() != null || club.getHandicapperPhone() != null )
                    builder.setHandicapper(MAKE_PERSON_DTO.apply(club.getHandicapper(), club.getHandicapperPhone(), club.getHandicapperEmail()));
                if (club.getDenominator()!=null||club.getType()!=null)
                    builder.setDefaultHandicap(MAKE_HANDICAP_DTO.apply(club.getDenominator(), club.getType()));
                return builder.build();
            };

    static final Function<Sailboat, BoatDTO> MAKE_BOAT_DTO =
            sb -> {
                BoatDTO.Builder builder = BoatDTO.newBuilder();
                if (sb.getSailboatId()!=null) builder.setId(Int32Value.of(sb.getSailboatId()));
                if (sb.getName()!=null) builder.setName(StringValue.of(sb.getName()));
                if (sb.getMake()!=null) builder.setMake(StringValue.of(sb.getMake()));
                if (sb.getLength()!=null) builder.setLength(DoubleValue.of(sb.getLength()));
                if (sb.getRating()!=null) builder.setRating(Int32Value.of(sb.getRating()));
                if (sb.getOwner()!=null || sb.getPhone() != null || sb.getEmail() != null )
                    builder.setSkipper(MAKE_PERSON_DTO.apply(sb.getOwner(), sb.getPhone(), sb.getEmail()));
                if (sb.getActive()!=null) builder.setActive(BoolValue.of(sb.getActive()));
                if (sb.getClub()!=null) builder.setClub(MAKE_CLUB_DTO.apply(sb.getClub()));
                return builder.build();
            };

    static final Function<Series, SeriesDTO> MAKE_SERIES_DTO =
            series -> {
                SeriesDTO.Builder builder = SeriesDTO.newBuilder();
                if (series.getSeriesId()!=null) builder.setId(Int32Value.of(series.getSeriesId()));
                if (series.getName()!=null) builder.setName(StringValue.of(series.getName()));
                if (series.getDescription()!=null) builder.setDescription(StringValue.of(series.getDescription()));
                if (series.getSponsor()!=null) builder.setSponsor(StringValue.of(series.getSponsor()));
                if (series.getSeasonMultiplier()!=null) builder.setDefaultMultiplier(Int32Value.of(series.getSeasonMultiplier()));
                if (series.getClub()!=null) builder.setClub(MAKE_CLUB_DTO.apply(series.getClub()));
                return builder.build();
            };

    static final Function<Course, CourseDTO> MAKE_COURSE_DTO =
            course -> {
                CourseDTO.Builder builder = CourseDTO.newBuilder();
                if (course.getCourseId()!=null) builder.setId(Int32Value.of(course.getCourseId()));
                if (course.getName()!=null) builder.setName(StringValue.of(course.getName()));
                if (course.getDescription()!=null) builder.setDescription(StringValue.of(course.getDescription()));
                if (course.getDistance()!=null) builder.setDistance(DoubleValue.of(course.getDistance()));
                if (course.getClub()!=null) builder.setClub(MAKE_CLUB_DTO.apply(course.getClub()));
                return builder.build();
            };


}
