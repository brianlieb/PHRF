// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Seas.proto

package org.seasailing.protobuf;

/**
 * Protobuf type {@code org.seasailing.protobuf.PersonDTO}
 */
public  final class PersonDTO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.seasailing.protobuf.PersonDTO)
    PersonDTOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PersonDTO.newBuilder() to construct.
  private PersonDTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PersonDTO() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PersonDTO(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (name_ != null) {
              subBuilder = name_.toBuilder();
            }
            name_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(name_);
              name_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (email_ != null) {
              subBuilder = email_.toBuilder();
            }
            email_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(email_);
              email_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (phone_ != null) {
              subBuilder = phone_.toBuilder();
            }
            phone_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(phone_);
              phone_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.seasailing.protobuf.Seas.internal_static_org_seasailing_protobuf_PersonDTO_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.seasailing.protobuf.Seas.internal_static_org_seasailing_protobuf_PersonDTO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.seasailing.protobuf.PersonDTO.class, org.seasailing.protobuf.PersonDTO.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue name_;
  /**
   * <code>.google.protobuf.StringValue name = 1;</code>
   */
  public boolean hasName() {
    return name_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue name = 1;</code>
   */
  public com.google.protobuf.StringValue getName() {
    return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
  }
  /**
   * <code>.google.protobuf.StringValue name = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
    return getName();
  }

  public static final int EMAIL_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue email_;
  /**
   * <code>.google.protobuf.StringValue email = 2;</code>
   */
  public boolean hasEmail() {
    return email_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue email = 2;</code>
   */
  public com.google.protobuf.StringValue getEmail() {
    return email_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : email_;
  }
  /**
   * <code>.google.protobuf.StringValue email = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getEmailOrBuilder() {
    return getEmail();
  }

  public static final int PHONE_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue phone_;
  /**
   * <code>.google.protobuf.StringValue phone = 3;</code>
   */
  public boolean hasPhone() {
    return phone_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue phone = 3;</code>
   */
  public com.google.protobuf.StringValue getPhone() {
    return phone_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : phone_;
  }
  /**
   * <code>.google.protobuf.StringValue phone = 3;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getPhoneOrBuilder() {
    return getPhone();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (name_ != null) {
      output.writeMessage(1, getName());
    }
    if (email_ != null) {
      output.writeMessage(2, getEmail());
    }
    if (phone_ != null) {
      output.writeMessage(3, getPhone());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (name_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getName());
    }
    if (email_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEmail());
    }
    if (phone_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPhone());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.seasailing.protobuf.PersonDTO)) {
      return super.equals(obj);
    }
    org.seasailing.protobuf.PersonDTO other = (org.seasailing.protobuf.PersonDTO) obj;

    boolean result = true;
    result = result && (hasName() == other.hasName());
    if (hasName()) {
      result = result && getName()
          .equals(other.getName());
    }
    result = result && (hasEmail() == other.hasEmail());
    if (hasEmail()) {
      result = result && getEmail()
          .equals(other.getEmail());
    }
    result = result && (hasPhone() == other.hasPhone());
    if (hasPhone()) {
      result = result && getPhone()
          .equals(other.getPhone());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (hasEmail()) {
      hash = (37 * hash) + EMAIL_FIELD_NUMBER;
      hash = (53 * hash) + getEmail().hashCode();
    }
    if (hasPhone()) {
      hash = (37 * hash) + PHONE_FIELD_NUMBER;
      hash = (53 * hash) + getPhone().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.seasailing.protobuf.PersonDTO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.seasailing.protobuf.PersonDTO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.seasailing.protobuf.PersonDTO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.seasailing.protobuf.PersonDTO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.seasailing.protobuf.PersonDTO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.seasailing.protobuf.PersonDTO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.seasailing.protobuf.PersonDTO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.seasailing.protobuf.PersonDTO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.seasailing.protobuf.PersonDTO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.seasailing.protobuf.PersonDTO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.seasailing.protobuf.PersonDTO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.seasailing.protobuf.PersonDTO parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.seasailing.protobuf.PersonDTO prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.seasailing.protobuf.PersonDTO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.seasailing.protobuf.PersonDTO)
      org.seasailing.protobuf.PersonDTOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.seasailing.protobuf.Seas.internal_static_org_seasailing_protobuf_PersonDTO_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.seasailing.protobuf.Seas.internal_static_org_seasailing_protobuf_PersonDTO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.seasailing.protobuf.PersonDTO.class, org.seasailing.protobuf.PersonDTO.Builder.class);
    }

    // Construct using org.seasailing.protobuf.PersonDTO.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (nameBuilder_ == null) {
        name_ = null;
      } else {
        name_ = null;
        nameBuilder_ = null;
      }
      if (emailBuilder_ == null) {
        email_ = null;
      } else {
        email_ = null;
        emailBuilder_ = null;
      }
      if (phoneBuilder_ == null) {
        phone_ = null;
      } else {
        phone_ = null;
        phoneBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.seasailing.protobuf.Seas.internal_static_org_seasailing_protobuf_PersonDTO_descriptor;
    }

    public org.seasailing.protobuf.PersonDTO getDefaultInstanceForType() {
      return org.seasailing.protobuf.PersonDTO.getDefaultInstance();
    }

    public org.seasailing.protobuf.PersonDTO build() {
      org.seasailing.protobuf.PersonDTO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.seasailing.protobuf.PersonDTO buildPartial() {
      org.seasailing.protobuf.PersonDTO result = new org.seasailing.protobuf.PersonDTO(this);
      if (nameBuilder_ == null) {
        result.name_ = name_;
      } else {
        result.name_ = nameBuilder_.build();
      }
      if (emailBuilder_ == null) {
        result.email_ = email_;
      } else {
        result.email_ = emailBuilder_.build();
      }
      if (phoneBuilder_ == null) {
        result.phone_ = phone_;
      } else {
        result.phone_ = phoneBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.seasailing.protobuf.PersonDTO) {
        return mergeFrom((org.seasailing.protobuf.PersonDTO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.seasailing.protobuf.PersonDTO other) {
      if (other == org.seasailing.protobuf.PersonDTO.getDefaultInstance()) return this;
      if (other.hasName()) {
        mergeName(other.getName());
      }
      if (other.hasEmail()) {
        mergeEmail(other.getEmail());
      }
      if (other.hasPhone()) {
        mergePhone(other.getPhone());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.seasailing.protobuf.PersonDTO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.seasailing.protobuf.PersonDTO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue name_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> nameBuilder_;
    /**
     * <code>.google.protobuf.StringValue name = 1;</code>
     */
    public boolean hasName() {
      return nameBuilder_ != null || name_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue name = 1;</code>
     */
    public com.google.protobuf.StringValue getName() {
      if (nameBuilder_ == null) {
        return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
      } else {
        return nameBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue name = 1;</code>
     */
    public Builder setName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        name_ = value;
        onChanged();
      } else {
        nameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 1;</code>
     */
    public Builder setName(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (nameBuilder_ == null) {
        name_ = builderForValue.build();
        onChanged();
      } else {
        nameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 1;</code>
     */
    public Builder mergeName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (name_ != null) {
          name_ =
            com.google.protobuf.StringValue.newBuilder(name_).mergeFrom(value).buildPartial();
        } else {
          name_ = value;
        }
        onChanged();
      } else {
        nameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 1;</code>
     */
    public Builder clearName() {
      if (nameBuilder_ == null) {
        name_ = null;
        onChanged();
      } else {
        name_ = null;
        nameBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getNameBuilder() {
      
      onChanged();
      return getNameFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue name = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
      if (nameBuilder_ != null) {
        return nameBuilder_.getMessageOrBuilder();
      } else {
        return name_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : name_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue name = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getNameFieldBuilder() {
      if (nameBuilder_ == null) {
        nameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getName(),
                getParentForChildren(),
                isClean());
        name_ = null;
      }
      return nameBuilder_;
    }

    private com.google.protobuf.StringValue email_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> emailBuilder_;
    /**
     * <code>.google.protobuf.StringValue email = 2;</code>
     */
    public boolean hasEmail() {
      return emailBuilder_ != null || email_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue email = 2;</code>
     */
    public com.google.protobuf.StringValue getEmail() {
      if (emailBuilder_ == null) {
        return email_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : email_;
      } else {
        return emailBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue email = 2;</code>
     */
    public Builder setEmail(com.google.protobuf.StringValue value) {
      if (emailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        email_ = value;
        onChanged();
      } else {
        emailBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue email = 2;</code>
     */
    public Builder setEmail(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (emailBuilder_ == null) {
        email_ = builderForValue.build();
        onChanged();
      } else {
        emailBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue email = 2;</code>
     */
    public Builder mergeEmail(com.google.protobuf.StringValue value) {
      if (emailBuilder_ == null) {
        if (email_ != null) {
          email_ =
            com.google.protobuf.StringValue.newBuilder(email_).mergeFrom(value).buildPartial();
        } else {
          email_ = value;
        }
        onChanged();
      } else {
        emailBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue email = 2;</code>
     */
    public Builder clearEmail() {
      if (emailBuilder_ == null) {
        email_ = null;
        onChanged();
      } else {
        email_ = null;
        emailBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue email = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getEmailBuilder() {
      
      onChanged();
      return getEmailFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue email = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getEmailOrBuilder() {
      if (emailBuilder_ != null) {
        return emailBuilder_.getMessageOrBuilder();
      } else {
        return email_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : email_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue email = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getEmailFieldBuilder() {
      if (emailBuilder_ == null) {
        emailBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getEmail(),
                getParentForChildren(),
                isClean());
        email_ = null;
      }
      return emailBuilder_;
    }

    private com.google.protobuf.StringValue phone_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> phoneBuilder_;
    /**
     * <code>.google.protobuf.StringValue phone = 3;</code>
     */
    public boolean hasPhone() {
      return phoneBuilder_ != null || phone_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue phone = 3;</code>
     */
    public com.google.protobuf.StringValue getPhone() {
      if (phoneBuilder_ == null) {
        return phone_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : phone_;
      } else {
        return phoneBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue phone = 3;</code>
     */
    public Builder setPhone(com.google.protobuf.StringValue value) {
      if (phoneBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        phone_ = value;
        onChanged();
      } else {
        phoneBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue phone = 3;</code>
     */
    public Builder setPhone(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (phoneBuilder_ == null) {
        phone_ = builderForValue.build();
        onChanged();
      } else {
        phoneBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue phone = 3;</code>
     */
    public Builder mergePhone(com.google.protobuf.StringValue value) {
      if (phoneBuilder_ == null) {
        if (phone_ != null) {
          phone_ =
            com.google.protobuf.StringValue.newBuilder(phone_).mergeFrom(value).buildPartial();
        } else {
          phone_ = value;
        }
        onChanged();
      } else {
        phoneBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue phone = 3;</code>
     */
    public Builder clearPhone() {
      if (phoneBuilder_ == null) {
        phone_ = null;
        onChanged();
      } else {
        phone_ = null;
        phoneBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue phone = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getPhoneBuilder() {
      
      onChanged();
      return getPhoneFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue phone = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getPhoneOrBuilder() {
      if (phoneBuilder_ != null) {
        return phoneBuilder_.getMessageOrBuilder();
      } else {
        return phone_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : phone_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue phone = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getPhoneFieldBuilder() {
      if (phoneBuilder_ == null) {
        phoneBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getPhone(),
                getParentForChildren(),
                isClean());
        phone_ = null;
      }
      return phoneBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.seasailing.protobuf.PersonDTO)
  }

  // @@protoc_insertion_point(class_scope:org.seasailing.protobuf.PersonDTO)
  private static final org.seasailing.protobuf.PersonDTO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.seasailing.protobuf.PersonDTO();
  }

  public static org.seasailing.protobuf.PersonDTO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonDTO>
      PARSER = new com.google.protobuf.AbstractParser<PersonDTO>() {
    public PersonDTO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PersonDTO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PersonDTO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersonDTO> getParserForType() {
    return PARSER;
  }

  public org.seasailing.protobuf.PersonDTO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

