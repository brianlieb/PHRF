package org.seasailing.core;

import io.vavr.Function2;
import org.seasailing.db.util.Validator;
import org.seasailing.db.util.Validator.ValidationItem;
import org.seasailing.protobuf.BoatDTO;
import org.seasailing.protobuf.Msg;
import org.seasailing.protobuf.PersonDTO;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Business {

    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    private static final Pattern VALID_PHONE_REGEX =
            Pattern.compile("^(?:(?:\\\\+?1\\\\s*(?:[.-]\\\\s*)?)?(?:\\\\(\\\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\\\s*\\\\)|([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\\\s*(?:[.-]\\\\s*)?)?([2-9]1[02-9]|[2-9][02-9]1|[2-9][02-9]{2})\\\\s*(?:[.-]\\\\s*)?([0-9]{4})(?:\\\\s*(?:#|x\\\\.?|ext\\\\.?|extension)\\\\s*(\\\\d+))?$");


    static final Function2<Msg.Severity, String, Msg> makeMessage =
            (sev, msg) -> Msg.newBuilder().setSeverity(sev).setMessage(msg).build();

    static final Function<String, Msg> makeError =
            s -> makeMessage.apply(Msg.Severity.ERROR, s);

    static final Function<String, Msg> makeWarning =
            s -> makeMessage.apply(Msg.Severity.WARNING, s);

    static final Function<String, Msg> makeException =
            s -> makeMessage.apply(Msg.Severity.EXCEPTION, s);

    static final Function<String, Msg> makeInfo =
            s -> makeMessage.apply(Msg.Severity.INFO, s);

    private static final Predicate<BoatDTO> VALID_RATING = boatDTO -> boatDTO.hasRating()&&
                                                                            500>=boatDTO.getRating().getValue()&&
                                                                            -100<=boatDTO.getRating().getValue();

    private static final Predicate<BoatDTO> HAS_MAKE = BoatDTO::hasMake;
    private static final Predicate<BoatDTO> HAS_NAME =
            b -> b.hasName()&&b.getName().hasName()
                &&b.getName().getName().getValue().length()>1;

    private static final Predicate<BoatDTO> VALID_LENGTH = boatDTO -> boatDTO.hasLength()&&
                                                                           100 >= boatDTO.getLength().getValue()&&
                                                                            20 <= boatDTO.getLength().getValue();


    private static final Predicate<String> VALID_EMAIL = s -> VALID_EMAIL_ADDRESS_REGEX.matcher(s).find();
    private static final Predicate<String> VALID_PHONE = s -> VALID_PHONE_REGEX.matcher(s).find();

    private static final Predicate<PersonDTO> VALID_PERSON_EMAIL =
            s -> s.hasEmail()&&VALID_EMAIL.test(s.getEmail().getValue());

    private static final Predicate<PersonDTO> VALID_PERSON_NAME =
            s -> s.hasName()&&s.getName().getValue().length() > 5;

    private static final Predicate<PersonDTO> VALID_PERSON_PHONE =
            s -> s.hasPhone()&&VALID_PHONE.test(s.getPhone().getValue());

    private static final Predicate<BoatDTO> VALID_SKIPPER_EMAIL =
            b -> b.hasSkipper()&&VALID_PERSON_EMAIL.test(b.getSkipper());

    private static final Predicate<BoatDTO> VALID_SKIPPER_PHONE =
            b -> b.hasSkipper()&&VALID_PERSON_PHONE.test(b.getSkipper());

    private static final Predicate<BoatDTO> VALID_SKIPPER_NAME =
            b -> b.hasSkipper()&&VALID_PERSON_NAME.test(b.getSkipper());

    private static final Predicate<BoatDTO> HAS_CLUB = BoatDTO::hasClub;

    private static final ValidationItem SAILBOAT_VALID_RATING = ValidationItem.test(VALID_RATING, makeError.apply("The boat must have a rating between -150 and 500."));
    private static final ValidationItem SAILBOAT_HAS_MAKE = ValidationItem.test(HAS_MAKE, makeError.apply("What is the make of the boat?"));
    private static final ValidationItem SAILBOAT_HAS_NAME = ValidationItem.test(HAS_NAME, makeError.apply("The boat must have a name."));
    private static final ValidationItem SAILBOAT_VALID_LENGTH = ValidationItem.test(VALID_LENGTH, makeError.apply("The boat must be between 20 and 100 feet LOA."));
    private static final ValidationItem SAILBOAT_VALID_SKIPPER_NAME = ValidationItem.test(VALID_SKIPPER_NAME, makeError.apply("That is not a valid skipper name."));
    private static final ValidationItem SAILBOAT_VALID_SKIPPER_PHONE = ValidationItem.test(VALID_SKIPPER_PHONE, makeError.apply("That is not a valid phone number."));
    private static final ValidationItem SAILBOAT_VALID_SKIPPER_EMAIL = ValidationItem.test(VALID_SKIPPER_EMAIL, makeError.apply("That is not a valid email."));
    private static final ValidationItem SAILBOAT_HAS_CLUB = ValidationItem.test(HAS_CLUB, makeError.apply("The boat should be rated by a member club."));

    public static final Validator<BoatDTO> VALIDATE_BOAT_FOR_SAVE = Validator.<BoatDTO>newBuilder()
                            .addValidation(SAILBOAT_VALID_RATING)
                            .addValidation(SAILBOAT_HAS_MAKE)
                            .addValidation(SAILBOAT_HAS_NAME)
                            .addValidation(SAILBOAT_VALID_LENGTH)
                            .addValidation(SAILBOAT_VALID_SKIPPER_EMAIL)
                            .addValidation(SAILBOAT_VALID_SKIPPER_PHONE)
                            .addValidation(SAILBOAT_VALID_SKIPPER_NAME)
                            .addValidation(SAILBOAT_HAS_CLUB)
                            .build();



}
