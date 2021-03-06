// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Protocols.proto

package com.drakeet.purewriter.protocol;

public final class PureWriterProtocol {
  private PureWriterProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface MessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.Message)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>int32 version = 2;</code>
     */
    int getVersion();

    /**
     * <code>string contentType = 3;</code>
     */
    java.lang.String getContentType();
    /**
     * <code>string contentType = 3;</code>
     */
    com.google.protobuf.ByteString
        getContentTypeBytes();

    /**
     * <code>string messageType = 4;</code>
     */
    java.lang.String getMessageType();
    /**
     * <code>string messageType = 4;</code>
     */
    com.google.protobuf.ByteString
        getMessageTypeBytes();

    /**
     * <code>string content = 5;</code>
     */
    java.lang.String getContent();
    /**
     * <code>string content = 5;</code>
     */
    com.google.protobuf.ByteString
        getContentBytes();

    /**
     * <code>bytes data = 6;</code>
     */
    com.google.protobuf.ByteString getData();

    /**
     * <code>uint64 time = 7;</code>
     */
    long getTime();
  }
  /**
   * Protobuf type {@code protocol.Message}
   */
  public  static final class Message extends
      com.google.protobuf.GeneratedMessageLite<
          Message, Message.Builder> implements
      // @@protoc_insertion_point(message_implements:protocol.Message)
      MessageOrBuilder {
    private Message() {
      contentType_ = "";
      messageType_ = "";
      content_ = "";
      data_ = com.google.protobuf.ByteString.EMPTY;
    }
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>int32 id = 1;</code>
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    private void setId(int value) {
      
      id_ = value;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    private void clearId() {
      
      id_ = 0;
    }

    public static final int VERSION_FIELD_NUMBER = 2;
    private int version_;
    /**
     * <code>int32 version = 2;</code>
     */
    @java.lang.Override
    public int getVersion() {
      return version_;
    }
    /**
     * <code>int32 version = 2;</code>
     */
    private void setVersion(int value) {
      
      version_ = value;
    }
    /**
     * <code>int32 version = 2;</code>
     */
    private void clearVersion() {
      
      version_ = 0;
    }

    public static final int CONTENTTYPE_FIELD_NUMBER = 3;
    private java.lang.String contentType_;
    /**
     * <code>string contentType = 3;</code>
     */
    @java.lang.Override
    public java.lang.String getContentType() {
      return contentType_;
    }
    /**
     * <code>string contentType = 3;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getContentTypeBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(contentType_);
    }
    /**
     * <code>string contentType = 3;</code>
     */
    private void setContentType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      contentType_ = value;
    }
    /**
     * <code>string contentType = 3;</code>
     */
    private void clearContentType() {
      
      contentType_ = getDefaultInstance().getContentType();
    }
    /**
     * <code>string contentType = 3;</code>
     */
    private void setContentTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      contentType_ = value.toStringUtf8();
    }

    public static final int MESSAGETYPE_FIELD_NUMBER = 4;
    private java.lang.String messageType_;
    /**
     * <code>string messageType = 4;</code>
     */
    @java.lang.Override
    public java.lang.String getMessageType() {
      return messageType_;
    }
    /**
     * <code>string messageType = 4;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMessageTypeBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(messageType_);
    }
    /**
     * <code>string messageType = 4;</code>
     */
    private void setMessageType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      messageType_ = value;
    }
    /**
     * <code>string messageType = 4;</code>
     */
    private void clearMessageType() {
      
      messageType_ = getDefaultInstance().getMessageType();
    }
    /**
     * <code>string messageType = 4;</code>
     */
    private void setMessageTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      messageType_ = value.toStringUtf8();
    }

    public static final int CONTENT_FIELD_NUMBER = 5;
    private java.lang.String content_;
    /**
     * <code>string content = 5;</code>
     */
    @java.lang.Override
    public java.lang.String getContent() {
      return content_;
    }
    /**
     * <code>string content = 5;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getContentBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(content_);
    }
    /**
     * <code>string content = 5;</code>
     */
    private void setContent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      content_ = value;
    }
    /**
     * <code>string content = 5;</code>
     */
    private void clearContent() {
      
      content_ = getDefaultInstance().getContent();
    }
    /**
     * <code>string content = 5;</code>
     */
    private void setContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      content_ = value.toStringUtf8();
    }

    public static final int DATA_FIELD_NUMBER = 6;
    private com.google.protobuf.ByteString data_;
    /**
     * <code>bytes data = 6;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <code>bytes data = 6;</code>
     */
    private void setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
    }
    /**
     * <code>bytes data = 6;</code>
     */
    private void clearData() {
      
      data_ = getDefaultInstance().getData();
    }

    public static final int TIME_FIELD_NUMBER = 7;
    private long time_;
    /**
     * <code>uint64 time = 7;</code>
     */
    @java.lang.Override
    public long getTime() {
      return time_;
    }
    /**
     * <code>uint64 time = 7;</code>
     */
    private void setTime(long value) {
      
      time_ = value;
    }
    /**
     * <code>uint64 time = 7;</code>
     */
    private void clearTime() {
      
      time_ = 0L;
    }

    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.drakeet.purewriter.protocol.PureWriterProtocol.Message prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code protocol.Message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.drakeet.purewriter.protocol.PureWriterProtocol.Message, Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.Message)
        com.drakeet.purewriter.protocol.PureWriterProtocol.MessageOrBuilder {
      // Construct using com.drakeet.purewriter.protocol.PureWriterProtocol.Message.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>int32 id = 1;</code>
       */
      @java.lang.Override
      public int getId() {
        return instance.getId();
      }
      /**
       * <code>int32 id = 1;</code>
       */
      public Builder setId(int value) {
        copyOnWrite();
        instance.setId(value);
        return this;
      }
      /**
       * <code>int32 id = 1;</code>
       */
      public Builder clearId() {
        copyOnWrite();
        instance.clearId();
        return this;
      }

      /**
       * <code>int32 version = 2;</code>
       */
      @java.lang.Override
      public int getVersion() {
        return instance.getVersion();
      }
      /**
       * <code>int32 version = 2;</code>
       */
      public Builder setVersion(int value) {
        copyOnWrite();
        instance.setVersion(value);
        return this;
      }
      /**
       * <code>int32 version = 2;</code>
       */
      public Builder clearVersion() {
        copyOnWrite();
        instance.clearVersion();
        return this;
      }

      /**
       * <code>string contentType = 3;</code>
       */
      @java.lang.Override
      public java.lang.String getContentType() {
        return instance.getContentType();
      }
      /**
       * <code>string contentType = 3;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getContentTypeBytes() {
        return instance.getContentTypeBytes();
      }
      /**
       * <code>string contentType = 3;</code>
       */
      public Builder setContentType(
          java.lang.String value) {
        copyOnWrite();
        instance.setContentType(value);
        return this;
      }
      /**
       * <code>string contentType = 3;</code>
       */
      public Builder clearContentType() {
        copyOnWrite();
        instance.clearContentType();
        return this;
      }
      /**
       * <code>string contentType = 3;</code>
       */
      public Builder setContentTypeBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setContentTypeBytes(value);
        return this;
      }

      /**
       * <code>string messageType = 4;</code>
       */
      @java.lang.Override
      public java.lang.String getMessageType() {
        return instance.getMessageType();
      }
      /**
       * <code>string messageType = 4;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getMessageTypeBytes() {
        return instance.getMessageTypeBytes();
      }
      /**
       * <code>string messageType = 4;</code>
       */
      public Builder setMessageType(
          java.lang.String value) {
        copyOnWrite();
        instance.setMessageType(value);
        return this;
      }
      /**
       * <code>string messageType = 4;</code>
       */
      public Builder clearMessageType() {
        copyOnWrite();
        instance.clearMessageType();
        return this;
      }
      /**
       * <code>string messageType = 4;</code>
       */
      public Builder setMessageTypeBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setMessageTypeBytes(value);
        return this;
      }

      /**
       * <code>string content = 5;</code>
       */
      @java.lang.Override
      public java.lang.String getContent() {
        return instance.getContent();
      }
      /**
       * <code>string content = 5;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getContentBytes() {
        return instance.getContentBytes();
      }
      /**
       * <code>string content = 5;</code>
       */
      public Builder setContent(
          java.lang.String value) {
        copyOnWrite();
        instance.setContent(value);
        return this;
      }
      /**
       * <code>string content = 5;</code>
       */
      public Builder clearContent() {
        copyOnWrite();
        instance.clearContent();
        return this;
      }
      /**
       * <code>string content = 5;</code>
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setContentBytes(value);
        return this;
      }

      /**
       * <code>bytes data = 6;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getData() {
        return instance.getData();
      }
      /**
       * <code>bytes data = 6;</code>
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setData(value);
        return this;
      }
      /**
       * <code>bytes data = 6;</code>
       */
      public Builder clearData() {
        copyOnWrite();
        instance.clearData();
        return this;
      }

      /**
       * <code>uint64 time = 7;</code>
       */
      @java.lang.Override
      public long getTime() {
        return instance.getTime();
      }
      /**
       * <code>uint64 time = 7;</code>
       */
      public Builder setTime(long value) {
        copyOnWrite();
        instance.setTime(value);
        return this;
      }
      /**
       * <code>uint64 time = 7;</code>
       */
      public Builder clearTime() {
        copyOnWrite();
        instance.clearTime();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protocol.Message)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.drakeet.purewriter.protocol.PureWriterProtocol.Message();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "id_",
              "version_",
              "contentType_",
              "messageType_",
              "content_",
              "data_",
              "time_",
            };
            java.lang.String info =
                "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0004" +
                "\u0003\u0208\u0004\u0208\u0005\u0208\u0006\n\u0007\u0003";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.drakeet.purewriter.protocol.PureWriterProtocol.Message> parser = PARSER;
          if (parser == null) {
            synchronized (com.drakeet.purewriter.protocol.PureWriterProtocol.Message.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<com.drakeet.purewriter.protocol.PureWriterProtocol.Message>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:protocol.Message)
    private static final com.drakeet.purewriter.protocol.PureWriterProtocol.Message DEFAULT_INSTANCE;
    static {
      Message defaultInstance = new Message();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Message.class, defaultInstance);
    }

    public static com.drakeet.purewriter.protocol.PureWriterProtocol.Message getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Message> PARSER;

    public static com.google.protobuf.Parser<Message> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
