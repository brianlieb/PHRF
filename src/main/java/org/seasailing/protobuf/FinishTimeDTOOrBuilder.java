// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Seas.proto

package org.seasailing.protobuf;

public interface FinishTimeDTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.seasailing.protobuf.FinishTimeDTO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.org.seasailing.protobuf.BoatDTO boat = 1;</code>
   */
  boolean hasBoat();
  /**
   * <code>.org.seasailing.protobuf.BoatDTO boat = 1;</code>
   */
  org.seasailing.protobuf.BoatDTO getBoat();
  /**
   * <code>.org.seasailing.protobuf.BoatDTO boat = 1;</code>
   */
  org.seasailing.protobuf.BoatDTOOrBuilder getBoatOrBuilder();

  /**
   * <code>.org.seasailing.protobuf.Status status = 2;</code>
   */
  int getStatusValue();
  /**
   * <code>.org.seasailing.protobuf.Status status = 2;</code>
   */
  org.seasailing.protobuf.Status getStatus();

  /**
   * <code>.google.protobuf.Int64Value finishTime = 3;</code>
   */
  boolean hasFinishTime();
  /**
   * <code>.google.protobuf.Int64Value finishTime = 3;</code>
   */
  com.google.protobuf.Int64Value getFinishTime();
  /**
   * <code>.google.protobuf.Int64Value finishTime = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getFinishTimeOrBuilder();

  /**
   * <code>.org.seasailing.protobuf.RaceDTO race = 4;</code>
   */
  boolean hasRace();
  /**
   * <code>.org.seasailing.protobuf.RaceDTO race = 4;</code>
   */
  org.seasailing.protobuf.RaceDTO getRace();
  /**
   * <code>.org.seasailing.protobuf.RaceDTO race = 4;</code>
   */
  org.seasailing.protobuf.RaceDTOOrBuilder getRaceOrBuilder();
}
