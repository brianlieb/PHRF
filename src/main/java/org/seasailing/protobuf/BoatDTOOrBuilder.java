// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Seas.proto

package org.seasailing.protobuf;

public interface BoatDTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.seasailing.protobuf.BoatDTO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.org.seasailing.protobuf.BoatDTO.BoatNameDTO name = 1;</code>
   */
  boolean hasName();
  /**
   * <code>.org.seasailing.protobuf.BoatDTO.BoatNameDTO name = 1;</code>
   */
  org.seasailing.protobuf.BoatDTO.BoatNameDTO getName();
  /**
   * <code>.org.seasailing.protobuf.BoatDTO.BoatNameDTO name = 1;</code>
   */
  org.seasailing.protobuf.BoatDTO.BoatNameDTOOrBuilder getNameOrBuilder();

  /**
   * <code>.google.protobuf.StringValue make = 2;</code>
   */
  boolean hasMake();
  /**
   * <code>.google.protobuf.StringValue make = 2;</code>
   */
  com.google.protobuf.StringValue getMake();
  /**
   * <code>.google.protobuf.StringValue make = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getMakeOrBuilder();

  /**
   * <code>.google.protobuf.DoubleValue length = 3;</code>
   */
  boolean hasLength();
  /**
   * <code>.google.protobuf.DoubleValue length = 3;</code>
   */
  com.google.protobuf.DoubleValue getLength();
  /**
   * <code>.google.protobuf.DoubleValue length = 3;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getLengthOrBuilder();

  /**
   * <code>.google.protobuf.Int32Value rating = 4;</code>
   */
  boolean hasRating();
  /**
   * <code>.google.protobuf.Int32Value rating = 4;</code>
   */
  com.google.protobuf.Int32Value getRating();
  /**
   * <code>.google.protobuf.Int32Value rating = 4;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getRatingOrBuilder();

  /**
   * <code>.org.seasailing.protobuf.PersonDTO skipper = 5;</code>
   */
  boolean hasSkipper();
  /**
   * <code>.org.seasailing.protobuf.PersonDTO skipper = 5;</code>
   */
  org.seasailing.protobuf.PersonDTO getSkipper();
  /**
   * <code>.org.seasailing.protobuf.PersonDTO skipper = 5;</code>
   */
  org.seasailing.protobuf.PersonDTOOrBuilder getSkipperOrBuilder();

  /**
   * <code>.google.protobuf.BoolValue active = 6;</code>
   */
  boolean hasActive();
  /**
   * <code>.google.protobuf.BoolValue active = 6;</code>
   */
  com.google.protobuf.BoolValue getActive();
  /**
   * <code>.google.protobuf.BoolValue active = 6;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getActiveOrBuilder();

  /**
   * <code>.org.seasailing.protobuf.ClubDTO club = 7;</code>
   */
  boolean hasClub();
  /**
   * <code>.org.seasailing.protobuf.ClubDTO club = 7;</code>
   */
  org.seasailing.protobuf.ClubDTO getClub();
  /**
   * <code>.org.seasailing.protobuf.ClubDTO club = 7;</code>
   */
  org.seasailing.protobuf.ClubDTOOrBuilder getClubOrBuilder();
}
