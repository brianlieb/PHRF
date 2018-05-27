package org.seasailing.db;

import com.google.protobuf.*;
 import io.vavr.Function2;
import io.vavr.Function3;
import org.seasailing.db.hibernate.*;
import org.seasailing.protobuf.*;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Mapper {

    static final Function3<String, String, String, PersonDTO> MAKE_PERSON_DTO =
            (name, phone, email) -> {
                PersonDTO.Builder builder = PersonDTO.newBuilder();
                if (name!=null) builder.setName(StringValue.of(name));
                if (phone!=null) builder.setPhone(StringValue.of(phone));
                if (email!=null) builder.setEmail(StringValue.of(email));
                return builder.build();
            };

    static final Function<String, HandicapDTO.Method> MAKE_METHOD =
            method -> method.toUpperCase().equals("TIME ON TIME")?HandicapDTO.Method.TIME_ON_TIME:HandicapDTO.Method.TIME_ON_DISTANCE;

    static final Function2<Integer, String, HandicapDTO> MAKE_HANDICAP_DTO =
            (den, type) -> {
                HandicapDTO.Builder builder = HandicapDTO.newBuilder();
                if (den!=null) builder.setDenominator(Int32Value.of(den));
                if (type!=null) builder.setMethod(MAKE_METHOD.apply(type));
                return builder.build();
            };

    static final Function<ClubDTO, Club> MAKE_CLUB =
            dto -> {
                Club club = new Club(
                        dto.hasName()?dto.getName().getValue():null,
                        dto.hasEmail()?dto.getEmail().getValue():null,
                        dto.hasHandicapper()&&dto.getHandicapper().hasName()?dto.getHandicapper().getName().getValue():null,
                        dto.hasHandicapper()&&dto.getHandicapper().hasEmail()?dto.getHandicapper().getEmail().getValue():null,
                        dto.hasHandicapper()&&dto.getHandicapper().hasPhone()?dto.getHandicapper().getPhone().getValue():null,
                        dto.hasDefaultHandicap()&&dto.getDefaultHandicap().hasDenominator()?dto.getDefaultHandicap().getDenominator().getValue():null,
                        dto.hasDefaultHandicap()?dto.getDefaultHandicap().getMethod().name():null,
                        null,
                        null,
                        null
                );
                if (dto.hasId()) club.setClubId(dto.getId().getValue());
                return club;
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

    static final Function<BoatDTO, Sailboat> MAKE_BOAT =
            dto -> {
                    Sailboat sailboat = new Sailboat(
                        dto.hasClub()?MAKE_CLUB.apply(dto.getClub()):null,
                        dto.hasName()&&dto.getName().hasName()?dto.getName().getName().getValue():null,
                        dto.hasRating()?dto.getRating().getValue():null,
                        dto.hasSkipper()&&dto.getSkipper().hasName()?dto.getSkipper().getName().getValue():null,
                        dto.hasMake()?dto.getMake().getValue():null,
                        dto.hasLength()?BigDecimal.valueOf(dto.getLength().getValue()):null,
                        dto.hasSkipper()&&dto.getSkipper().hasEmail()?dto.getSkipper().getEmail().getValue():null,
                        dto.hasSkipper()&&dto.getSkipper().hasPhone()?dto.getSkipper().getPhone().getValue():null,
                        dto.hasActive()?dto.getActive().getValue():null);

                    if (dto.hasName()&&dto.getName().hasId())  sailboat.setSailboatId(dto.getName().getId().getValue());
                    return sailboat;
            };

    static final Function<ClubDTO, Optional<Integer>> GET_ID_FROM_CLUB =
            club -> club.hasId()?Optional.of(club.getId().getValue()):Optional.empty();

    static final Function<BoatDTO.BoatNameDTO, Optional<Integer>> GET_ID_FROM_BOAT_NAME =
            name -> name.hasId()?Optional.of(name.getId().getValue()):Optional.empty();

    static final Function<BoatDTO.BoatNameDTO, Optional<String>> GET_NAME_FROM_BOAT_NAME =
            name -> name.hasName()?Optional.of(name.getName().getValue()):Optional.empty();

    static final Function<Sailboat, BoatDTO.BoatNameDTO> MAKE_BOAT_NAME_DTO =
            sb -> {
                BoatDTO.BoatNameDTO.Builder builder = BoatDTO.BoatNameDTO.newBuilder();
                if (sb.getSailboatId()!=null) builder.setId(Int32Value.of(sb.getSailboatId()));
                if (sb.getName()!=null) builder.setName(StringValue.of(sb.getName()));
                return builder.build();
            };

    static final Function<Sailboat, BoatDTO> MAKE_BOAT_DTO =
            sb -> {
                BoatDTO.Builder builder = BoatDTO.newBuilder();
                if (sb.getName()!=null) builder.setName(MAKE_BOAT_NAME_DTO.apply(sb));
                if (sb.getMake()!=null) builder.setMake(StringValue.of(sb.getMake()));
                if (sb.getLength()!=null) builder.setLength(DoubleValue.of(sb.getLength().doubleValue()));
                if (sb.getRating()!=null) builder.setRating(Int32Value.of(sb.getRating()));
                if (sb.getOwner()!=null || sb.getPhone() != null || sb.getEmail() != null )
                    builder.setSkipper(MAKE_PERSON_DTO.apply(sb.getOwner(), sb.getPhone(), sb.getEmail()));
                if (sb.getActive()!=null) builder.setActive(BoolValue.of(sb.getActive()));
                if (sb.getClub()!=null) builder.setClub(MAKE_CLUB_DTO.apply(sb.getClub()));
                return builder.build();
            };

    static final Function<SeriesDTO, Series> MAKE_SERIES =
            dto -> {
                    Series series = new Series(
                        dto.hasClub()?MAKE_CLUB.apply(dto.getClub()):null,
                        dto.hasName()?dto.getName().getValue():null,
                        dto.hasSponsor()?dto.getSponsor().getValue():null,
                        dto.hasDefaultMultiplier()?dto.getDefaultMultiplier().getValue():null,
                        dto.hasDescription()?dto.getDescription().getValue():null,
                        null);
                    if (dto.hasId()) series.setSeriesId(dto.getId().getValue());
                    return series;
            };


    static final Function<Series, SeriesDTO> MAKE_SERIES_DTO =
            series -> {
                SeriesDTO.Builder builder = SeriesDTO.newBuilder();
                if (series.getSeriesId()!=null) builder.setId(Int32Value.of(series.getSeriesId()));
                if (series.getName()!=null) builder.setName(StringValue.of(series.getName()));
                if (series.getDescription()!=null) builder.setDescription(StringValue.of(series.getDescription()));
                if (series.getSponsor()!=null) builder.setSponsor(StringValue.of(series.getSponsor()));
                if (series.getSeasonmultiplier()!=null) builder.setDefaultMultiplier(Int32Value.of(series.getSeasonmultiplier()));
                if (series.getClub()!=null) builder.setClub(MAKE_CLUB_DTO.apply(series.getClub()));
                return builder.build();
            };


    static final Function<CourseDTO, Course> MAKE_COURSE =
            dto -> {
                    Course course = new Course(
                        dto.hasClub()?MAKE_CLUB.apply(dto.getClub()):null,
                        dto.hasDistance()?BigDecimal.valueOf(dto.getDistance().getValue()):null,
                        dto.hasDescription()? dto.getDescription().getValue():null,
                        dto.hasName()?dto.getName().getValue():null,
                        null);

                    if (dto.hasId()) course.setCourseId(dto.getId().getValue());
                    return course;
            };

    static final Function<Course, CourseDTO> MAKE_COURSE_DTO =
            course -> {
                CourseDTO.Builder builder = CourseDTO.newBuilder();
                if (course.getCourseId()!=null) builder.setId(Int32Value.of(course.getCourseId()));
                if (course.getName()!=null) builder.setName(StringValue.of(course.getName()));
                if (course.getDescription()!=null) builder.setDescription(StringValue.of(course.getDescription()));
                if (course.getDistance()!=null) builder.setDistance(DoubleValue.of(course.getDistance().doubleValue()));
                if (course.getClub()!=null) builder.setClub(MAKE_CLUB_DTO.apply(course.getClub()));
                return builder.build();
            };

    private static final Function<String, BoatDTO.BoatNameDTO> MAKE_BOAT_NAME_DTO_FROM_RESULT =
            name -> BoatDTO.BoatNameDTO.newBuilder().setName(StringValue.of(name)).build();

    static final Function<Result, BoatDTO> MAKE_BOAT_DTO_FROM_RESULT =
            result -> {
                BoatDTO.Builder builder = BoatDTO.newBuilder();
                if (result.getBoatname()!=null) builder.setName(MAKE_BOAT_NAME_DTO_FROM_RESULT.apply(result.getBoatname()));
                if (result.getRating()!=null) builder.setRating(Int32Value.of(result.getRating()));
                return builder.build();
            };


    static final Function2<RaceDTO, Result,  ResultDTO> MAKE_RESULT_DTO =
            (race, result) -> {
                ResultDTO.Builder builder = ResultDTO.newBuilder();
                if (result.getStatus()!=null) builder.setStatus(Status.valueOf(result.getStatus()));
                if (result.getCorrectedTime()!=null) builder.setCorrectedTime(Int64Value.of(result.getCorrectedTime()));
                if (result.getElapsedTime()!=null) builder.setElapsedTime(Int64Value.of(result.getElapsedTime()));
                if (result.getBoatname()!=null) builder.setBoat(StringValue.of(result.getBoatname()));
                if (race!=null) builder.setRace(race);
                return builder.build();
            };


    static final Function<String, RaceDTO.Option> MAKE_OPTION_DTO =
            option -> option!=null?RaceDTO.Option.valueOf(option):RaceDTO.Option.DEFAULT;


    static final Function<Complete, RaceDTO> MAKE_RACE_DTO =
            complete -> {
                RaceDTO.Builder builder = RaceDTO.newBuilder();
                if (complete.getStartTime()!=null) builder.setStartTime(Int64Value.of(complete.getStartTime().getTime()));
                if (complete.getSeries()!=null) builder.setSeries(MAKE_SERIES_DTO.apply(complete.getSeries()));
                if (complete.getCourse()!=null) builder.setCourse(MAKE_COURSE_DTO.apply(complete.getCourse()));
                if (complete.getSeriesmultiplier()!=null) builder.setMultiplier(Int32Value.of(complete.getSeriesmultiplier()));
                builder.setOption(MAKE_OPTION_DTO.apply(complete.getOptions()));

                if (complete.getDenominator()!=null&&complete.getType()!=null)
                    builder.setHandicap(MAKE_HANDICAP_DTO.apply(complete.getDenominator(), complete.getType()));

                if (complete.getResults()!=null)
                    builder.addAllResults(
                            complete.getResults()
                                    .stream()
                                    .map(MAKE_RESULT_DTO.apply(builder.build()))
                                    .collect(Collectors.toList()));
                return builder.build();
            };




}
