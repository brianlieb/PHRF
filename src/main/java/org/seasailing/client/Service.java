package org.seasailing.client;

import org.seasailing.core.util.ServicePackage;
import org.seasailing.protobuf.BoatDTO;

import java.util.function.Function;

import static org.seasailing.core.Business.VALIDATE_BOAT_FOR_SAVE;
import static org.seasailing.db.QueryRepo.SAVE_BOAT;


public class Service {


    public static final Function<BoatDTO, ServicePackage<BoatDTO>> saveBoat =
            boatDTO ->  ServicePackage.ofOptional(
                        VALIDATE_BOAT_FOR_SAVE
                                .validate(boatDTO)
                                .map(SAVE_BOAT)
                                , boatDTO);


}
