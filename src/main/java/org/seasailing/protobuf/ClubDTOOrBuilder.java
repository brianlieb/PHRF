// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Seas.proto

package org.seasailing.protobuf;

public interface ClubDTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.seasailing.protobuf.ClubDTO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Int32Value id = 1;</code>
   */
  boolean hasId();
  /**
   * <code>.google.protobuf.Int32Value id = 1;</code>
   */
  com.google.protobuf.Int32Value getId();
  /**
   * <code>.google.protobuf.Int32Value id = 1;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getIdOrBuilder();

  /**
   * <code>.google.protobuf.StringValue name = 2;</code>
   */
  boolean hasName();
  /**
   * <code>.google.protobuf.StringValue name = 2;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <code>.google.protobuf.StringValue name = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <code>.google.protobuf.StringValue email = 3;</code>
   */
  boolean hasEmail();
  /**
   * <code>.google.protobuf.StringValue email = 3;</code>
   */
  com.google.protobuf.StringValue getEmail();
  /**
   * <code>.google.protobuf.StringValue email = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getEmailOrBuilder();

  /**
   * <code>.org.seasailing.protobuf.PersonDTO handicapper = 4;</code>
   */
  boolean hasHandicapper();
  /**
   * <code>.org.seasailing.protobuf.PersonDTO handicapper = 4;</code>
   */
  org.seasailing.protobuf.PersonDTO getHandicapper();
  /**
   * <code>.org.seasailing.protobuf.PersonDTO handicapper = 4;</code>
   */
  org.seasailing.protobuf.PersonDTOOrBuilder getHandicapperOrBuilder();

  /**
   * <code>.org.seasailing.protobuf.HandicapDTO defaultHandicap = 5;</code>
   */
  boolean hasDefaultHandicap();
  /**
   * <code>.org.seasailing.protobuf.HandicapDTO defaultHandicap = 5;</code>
   */
  org.seasailing.protobuf.HandicapDTO getDefaultHandicap();
  /**
   * <code>.org.seasailing.protobuf.HandicapDTO defaultHandicap = 5;</code>
   */
  org.seasailing.protobuf.HandicapDTOOrBuilder getDefaultHandicapOrBuilder();
}
