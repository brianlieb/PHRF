// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Seas.proto

package org.seasailing.protobuf;

public interface FinishRaceDTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.seasailing.protobuf.FinishRaceDTO)
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
   * <code>.google.protobuf.Int64Value startTime = 2;</code>
   */
  boolean hasStartTime();
  /**
   * <code>.google.protobuf.Int64Value startTime = 2;</code>
   */
  com.google.protobuf.Int64Value getStartTime();
  /**
   * <code>.google.protobuf.Int64Value startTime = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getStartTimeOrBuilder();

  /**
   * <code>.org.seasailing.protobuf.SeriesDTO series = 3;</code>
   */
  boolean hasSeries();
  /**
   * <code>.org.seasailing.protobuf.SeriesDTO series = 3;</code>
   */
  org.seasailing.protobuf.SeriesDTO getSeries();
  /**
   * <code>.org.seasailing.protobuf.SeriesDTO series = 3;</code>
   */
  org.seasailing.protobuf.SeriesDTOOrBuilder getSeriesOrBuilder();

  /**
   * <code>.org.seasailing.protobuf.CourseDTO course = 4;</code>
   */
  boolean hasCourse();
  /**
   * <code>.org.seasailing.protobuf.CourseDTO course = 4;</code>
   */
  org.seasailing.protobuf.CourseDTO getCourse();
  /**
   * <code>.org.seasailing.protobuf.CourseDTO course = 4;</code>
   */
  org.seasailing.protobuf.CourseDTOOrBuilder getCourseOrBuilder();

  /**
   * <code>.google.protobuf.Int32Value multiplier = 5;</code>
   */
  boolean hasMultiplier();
  /**
   * <code>.google.protobuf.Int32Value multiplier = 5;</code>
   */
  com.google.protobuf.Int32Value getMultiplier();
  /**
   * <code>.google.protobuf.Int32Value multiplier = 5;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getMultiplierOrBuilder();

  /**
   * <code>.org.seasailing.protobuf.FinishRaceDTO.Option option = 6;</code>
   */
  int getOptionValue();
  /**
   * <code>.org.seasailing.protobuf.FinishRaceDTO.Option option = 6;</code>
   */
  org.seasailing.protobuf.FinishRaceDTO.Option getOption();

  /**
   * <code>.org.seasailing.protobuf.HandicapDTO handicap = 7;</code>
   */
  boolean hasHandicap();
  /**
   * <code>.org.seasailing.protobuf.HandicapDTO handicap = 7;</code>
   */
  org.seasailing.protobuf.HandicapDTO getHandicap();
  /**
   * <code>.org.seasailing.protobuf.HandicapDTO handicap = 7;</code>
   */
  org.seasailing.protobuf.HandicapDTOOrBuilder getHandicapOrBuilder();

  /**
   * <code>repeated .org.seasailing.protobuf.FinishTimeDTO time = 8;</code>
   */
  java.util.List<org.seasailing.protobuf.FinishTimeDTO> 
      getTimeList();
  /**
   * <code>repeated .org.seasailing.protobuf.FinishTimeDTO time = 8;</code>
   */
  org.seasailing.protobuf.FinishTimeDTO getTime(int index);
  /**
   * <code>repeated .org.seasailing.protobuf.FinishTimeDTO time = 8;</code>
   */
  int getTimeCount();
  /**
   * <code>repeated .org.seasailing.protobuf.FinishTimeDTO time = 8;</code>
   */
  java.util.List<? extends org.seasailing.protobuf.FinishTimeDTOOrBuilder> 
      getTimeOrBuilderList();
  /**
   * <code>repeated .org.seasailing.protobuf.FinishTimeDTO time = 8;</code>
   */
  org.seasailing.protobuf.FinishTimeDTOOrBuilder getTimeOrBuilder(
      int index);
}