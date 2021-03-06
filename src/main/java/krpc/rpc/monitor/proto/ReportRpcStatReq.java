// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: krpcmonitor.proto

package krpc.rpc.monitor.proto;

/**
 * Protobuf type {@code ReportRpcStatReq}
 */
public final class ReportRpcStatReq extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:ReportRpcStatReq)
        ReportRpcStatReqOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use ReportRpcStatReq.newBuilder() to construct.
    private ReportRpcStatReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ReportRpcStatReq() {
        timestamp_ = 0L;
        host_ = "";
        app_ = "";
        stats_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    private ReportRpcStatReq(
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
                    case 8: {

                        timestamp_ = input.readInt64();
                        break;
                    }
                    case 18: {
                        java.lang.String s = input.readStringRequireUtf8();

                        host_ = s;
                        break;
                    }
                    case 26: {
                        java.lang.String s = input.readStringRequireUtf8();

                        app_ = s;
                        break;
                    }
                    case 34: {
                        if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                            stats_ = new java.util.ArrayList<krpc.rpc.monitor.proto.RpcStat>();
                            mutable_bitField0_ |= 0x00000008;
                        }
                        stats_.add(
                                input.readMessage(krpc.rpc.monitor.proto.RpcStat.parser(), extensionRegistry));
                        break;
                    }
                    default: {
                        if (!parseUnknownFieldProto3(
                                input, unknownFields, extensionRegistry, tag)) {
                            done = true;
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
            if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                stats_ = java.util.Collections.unmodifiableList(stats_);
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return krpc.rpc.monitor.proto.MonitorProtos.internal_static_ReportRpcStatReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return krpc.rpc.monitor.proto.MonitorProtos.internal_static_ReportRpcStatReq_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        krpc.rpc.monitor.proto.ReportRpcStatReq.class, krpc.rpc.monitor.proto.ReportRpcStatReq.Builder.class);
    }

    private int bitField0_;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private long timestamp_;

    /**
     * <pre>
     * timestamp to generate the stats
     * </pre>
     *
     * <code>int64 timestamp = 1;</code>
     */
    public long getTimestamp() {
        return timestamp_;
    }

    public static final int HOST_FIELD_NUMBER = 2;
    private volatile java.lang.Object host_;

    /**
     * <pre>
     * machine
     * </pre>
     *
     * <code>string host = 2;</code>
     */
    public java.lang.String getHost() {
        java.lang.Object ref = host_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            host_ = s;
            return s;
        }
    }

    /**
     * <pre>
     * machine
     * </pre>
     *
     * <code>string host = 2;</code>
     */
    public com.google.protobuf.ByteString
    getHostBytes() {
        java.lang.Object ref = host_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            host_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int APP_FIELD_NUMBER = 3;
    private volatile java.lang.Object app_;

    /**
     * <code>string app = 3;</code>
     */
    public java.lang.String getApp() {
        java.lang.Object ref = app_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            app_ = s;
            return s;
        }
    }

    /**
     * <code>string app = 3;</code>
     */
    public com.google.protobuf.ByteString
    getAppBytes() {
        java.lang.Object ref = app_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            app_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int STATS_FIELD_NUMBER = 4;
    private java.util.List<krpc.rpc.monitor.proto.RpcStat> stats_;

    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public java.util.List<krpc.rpc.monitor.proto.RpcStat> getStatsList() {
        return stats_;
    }

    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public java.util.List<? extends krpc.rpc.monitor.proto.RpcStatOrBuilder>
    getStatsOrBuilderList() {
        return stats_;
    }

    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public int getStatsCount() {
        return stats_.size();
    }

    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public krpc.rpc.monitor.proto.RpcStat getStats(int index) {
        return stats_.get(index);
    }

    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public krpc.rpc.monitor.proto.RpcStatOrBuilder getStatsOrBuilder(
            int index) {
        return stats_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        if (timestamp_ != 0L) {
            output.writeInt64(1, timestamp_);
        }
        if (!getHostBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, host_);
        }
        if (!getAppBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 3, app_);
        }
        for (int i = 0; i < stats_.size(); i++) {
            output.writeMessage(4, stats_.get(i));
        }
        unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (timestamp_ != 0L) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt64Size(1, timestamp_);
        }
        if (!getHostBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, host_);
        }
        if (!getAppBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, app_);
        }
        for (int i = 0; i < stats_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(4, stats_.get(i));
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
        if (!(obj instanceof krpc.rpc.monitor.proto.ReportRpcStatReq)) {
            return super.equals(obj);
        }
        krpc.rpc.monitor.proto.ReportRpcStatReq other = (krpc.rpc.monitor.proto.ReportRpcStatReq) obj;

        boolean result = true;
        result = result && (getTimestamp()
                == other.getTimestamp());
        result = result && getHost()
                .equals(other.getHost());
        result = result && getApp()
                .equals(other.getApp());
        result = result && getStatsList()
                .equals(other.getStatsList());
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
        hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                getTimestamp());
        hash = (37 * hash) + HOST_FIELD_NUMBER;
        hash = (53 * hash) + getHost().hashCode();
        hash = (37 * hash) + APP_FIELD_NUMBER;
        hash = (53 * hash) + getApp().hashCode();
        if (getStatsCount() > 0) {
            hash = (37 * hash) + STATS_FIELD_NUMBER;
            hash = (53 * hash) + getStatsList().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static krpc.rpc.monitor.proto.ReportRpcStatReq parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static krpc.rpc.monitor.proto.ReportRpcStatReq parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static krpc.rpc.monitor.proto.ReportRpcStatReq parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static krpc.rpc.monitor.proto.ReportRpcStatReq parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static krpc.rpc.monitor.proto.ReportRpcStatReq parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static krpc.rpc.monitor.proto.ReportRpcStatReq parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static krpc.rpc.monitor.proto.ReportRpcStatReq parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static krpc.rpc.monitor.proto.ReportRpcStatReq parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static krpc.rpc.monitor.proto.ReportRpcStatReq parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static krpc.rpc.monitor.proto.ReportRpcStatReq parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static krpc.rpc.monitor.proto.ReportRpcStatReq parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static krpc.rpc.monitor.proto.ReportRpcStatReq parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(krpc.rpc.monitor.proto.ReportRpcStatReq prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
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
     * Protobuf type {@code ReportRpcStatReq}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:ReportRpcStatReq)
            krpc.rpc.monitor.proto.ReportRpcStatReqOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return krpc.rpc.monitor.proto.MonitorProtos.internal_static_ReportRpcStatReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return krpc.rpc.monitor.proto.MonitorProtos.internal_static_ReportRpcStatReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            krpc.rpc.monitor.proto.ReportRpcStatReq.class, krpc.rpc.monitor.proto.ReportRpcStatReq.Builder.class);
        }

        // Construct using krpc.rpc.monitor.proto.ReportRpcStatReq.newBuilder()
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
                getStatsFieldBuilder();
            }
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            timestamp_ = 0L;

            host_ = "";

            app_ = "";

            if (statsBuilder_ == null) {
                stats_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000008);
            } else {
                statsBuilder_.clear();
            }
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return krpc.rpc.monitor.proto.MonitorProtos.internal_static_ReportRpcStatReq_descriptor;
        }

        @java.lang.Override
        public krpc.rpc.monitor.proto.ReportRpcStatReq getDefaultInstanceForType() {
            return krpc.rpc.monitor.proto.ReportRpcStatReq.getDefaultInstance();
        }

        @java.lang.Override
        public krpc.rpc.monitor.proto.ReportRpcStatReq build() {
            krpc.rpc.monitor.proto.ReportRpcStatReq result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public krpc.rpc.monitor.proto.ReportRpcStatReq buildPartial() {
            krpc.rpc.monitor.proto.ReportRpcStatReq result = new krpc.rpc.monitor.proto.ReportRpcStatReq(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            result.timestamp_ = timestamp_;
            result.host_ = host_;
            result.app_ = app_;
            if (statsBuilder_ == null) {
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                    stats_ = java.util.Collections.unmodifiableList(stats_);
                    bitField0_ = (bitField0_ & ~0x00000008);
                }
                result.stats_ = stats_;
            } else {
                result.stats_ = statsBuilder_.build();
            }
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }

        @java.lang.Override
        public Builder clone() {
            return (Builder) super.clone();
        }

        @java.lang.Override
        public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
            return (Builder) super.setField(field, value);
        }

        @java.lang.Override
        public Builder clearField(
                com.google.protobuf.Descriptors.FieldDescriptor field) {
            return (Builder) super.clearField(field);
        }

        @java.lang.Override
        public Builder clearOneof(
                com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return (Builder) super.clearOneof(oneof);
        }

        @java.lang.Override
        public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                int index, java.lang.Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
        }

        @java.lang.Override
        public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
            return (Builder) super.addRepeatedField(field, value);
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof krpc.rpc.monitor.proto.ReportRpcStatReq) {
                return mergeFrom((krpc.rpc.monitor.proto.ReportRpcStatReq) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(krpc.rpc.monitor.proto.ReportRpcStatReq other) {
            if (other == krpc.rpc.monitor.proto.ReportRpcStatReq.getDefaultInstance()) return this;
            if (other.getTimestamp() != 0L) {
                setTimestamp(other.getTimestamp());
            }
            if (!other.getHost().isEmpty()) {
                host_ = other.host_;
                onChanged();
            }
            if (!other.getApp().isEmpty()) {
                app_ = other.app_;
                onChanged();
            }
            if (statsBuilder_ == null) {
                if (!other.stats_.isEmpty()) {
                    if (stats_.isEmpty()) {
                        stats_ = other.stats_;
                        bitField0_ = (bitField0_ & ~0x00000008);
                    } else {
                        ensureStatsIsMutable();
                        stats_.addAll(other.stats_);
                    }
                    onChanged();
                }
            } else {
                if (!other.stats_.isEmpty()) {
                    if (statsBuilder_.isEmpty()) {
                        statsBuilder_.dispose();
                        statsBuilder_ = null;
                        stats_ = other.stats_;
                        bitField0_ = (bitField0_ & ~0x00000008);
                        statsBuilder_ =
                                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                        getStatsFieldBuilder() : null;
                    } else {
                        statsBuilder_.addAllMessages(other.stats_);
                    }
                }
            }
            this.mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
            return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            krpc.rpc.monitor.proto.ReportRpcStatReq parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (krpc.rpc.monitor.proto.ReportRpcStatReq) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int bitField0_;

        private long timestamp_;

        /**
         * <pre>
         * timestamp to generate the stats
         * </pre>
         *
         * <code>int64 timestamp = 1;</code>
         */
        public long getTimestamp() {
            return timestamp_;
        }

        /**
         * <pre>
         * timestamp to generate the stats
         * </pre>
         *
         * <code>int64 timestamp = 1;</code>
         */
        public Builder setTimestamp(long value) {

            timestamp_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * timestamp to generate the stats
         * </pre>
         *
         * <code>int64 timestamp = 1;</code>
         */
        public Builder clearTimestamp() {

            timestamp_ = 0L;
            onChanged();
            return this;
        }

        private java.lang.Object host_ = "";

        /**
         * <pre>
         * machine
         * </pre>
         *
         * <code>string host = 2;</code>
         */
        public java.lang.String getHost() {
            java.lang.Object ref = host_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                host_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <pre>
         * machine
         * </pre>
         *
         * <code>string host = 2;</code>
         */
        public com.google.protobuf.ByteString
        getHostBytes() {
            java.lang.Object ref = host_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                host_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <pre>
         * machine
         * </pre>
         *
         * <code>string host = 2;</code>
         */
        public Builder setHost(
                java.lang.String value) {
            if (value == null) value = "";

            host_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * machine
         * </pre>
         *
         * <code>string host = 2;</code>
         */
        public Builder clearHost() {

            host_ = getDefaultInstance().getHost();
            onChanged();
            return this;
        }

        /**
         * <pre>
         * machine
         * </pre>
         *
         * <code>string host = 2;</code>
         */
        public Builder setHostBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            host_ = value;
            onChanged();
            return this;
        }

        private java.lang.Object app_ = "";

        /**
         * <code>string app = 3;</code>
         */
        public java.lang.String getApp() {
            java.lang.Object ref = app_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                app_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string app = 3;</code>
         */
        public com.google.protobuf.ByteString
        getAppBytes() {
            java.lang.Object ref = app_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                app_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string app = 3;</code>
         */
        public Builder setApp(
                java.lang.String value) {
            if (value == null) value = "";

            app_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string app = 3;</code>
         */
        public Builder clearApp() {

            app_ = getDefaultInstance().getApp();
            onChanged();
            return this;
        }

        /**
         * <code>string app = 3;</code>
         */
        public Builder setAppBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            app_ = value;
            onChanged();
            return this;
        }

        private java.util.List<krpc.rpc.monitor.proto.RpcStat> stats_ =
                java.util.Collections.emptyList();

        private void ensureStatsIsMutable() {
            if (!((bitField0_ & 0x00000008) == 0x00000008)) {
                stats_ = new java.util.ArrayList<krpc.rpc.monitor.proto.RpcStat>(stats_);
                bitField0_ |= 0x00000008;
            }
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<
                krpc.rpc.monitor.proto.RpcStat, krpc.rpc.monitor.proto.RpcStat.Builder, krpc.rpc.monitor.proto.RpcStatOrBuilder> statsBuilder_;

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public java.util.List<krpc.rpc.monitor.proto.RpcStat> getStatsList() {
            if (statsBuilder_ == null) {
                return java.util.Collections.unmodifiableList(stats_);
            } else {
                return statsBuilder_.getMessageList();
            }
        }

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public int getStatsCount() {
            if (statsBuilder_ == null) {
                return stats_.size();
            } else {
                return statsBuilder_.getCount();
            }
        }

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public krpc.rpc.monitor.proto.RpcStat getStats(int index) {
            if (statsBuilder_ == null) {
                return stats_.get(index);
            } else {
                return statsBuilder_.getMessage(index);
            }
        }

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public Builder setStats(
                int index, krpc.rpc.monitor.proto.RpcStat value) {
            if (statsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureStatsIsMutable();
                stats_.set(index, value);
                onChanged();
            } else {
                statsBuilder_.setMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public Builder setStats(
                int index, krpc.rpc.monitor.proto.RpcStat.Builder builderForValue) {
            if (statsBuilder_ == null) {
                ensureStatsIsMutable();
                stats_.set(index, builderForValue.build());
                onChanged();
            } else {
                statsBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public Builder addStats(krpc.rpc.monitor.proto.RpcStat value) {
            if (statsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureStatsIsMutable();
                stats_.add(value);
                onChanged();
            } else {
                statsBuilder_.addMessage(value);
            }
            return this;
        }

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public Builder addStats(
                int index, krpc.rpc.monitor.proto.RpcStat value) {
            if (statsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureStatsIsMutable();
                stats_.add(index, value);
                onChanged();
            } else {
                statsBuilder_.addMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public Builder addStats(
                krpc.rpc.monitor.proto.RpcStat.Builder builderForValue) {
            if (statsBuilder_ == null) {
                ensureStatsIsMutable();
                stats_.add(builderForValue.build());
                onChanged();
            } else {
                statsBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public Builder addStats(
                int index, krpc.rpc.monitor.proto.RpcStat.Builder builderForValue) {
            if (statsBuilder_ == null) {
                ensureStatsIsMutable();
                stats_.add(index, builderForValue.build());
                onChanged();
            } else {
                statsBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public Builder addAllStats(
                java.lang.Iterable<? extends krpc.rpc.monitor.proto.RpcStat> values) {
            if (statsBuilder_ == null) {
                ensureStatsIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                        values, stats_);
                onChanged();
            } else {
                statsBuilder_.addAllMessages(values);
            }
            return this;
        }

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public Builder clearStats() {
            if (statsBuilder_ == null) {
                stats_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000008);
                onChanged();
            } else {
                statsBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public Builder removeStats(int index) {
            if (statsBuilder_ == null) {
                ensureStatsIsMutable();
                stats_.remove(index);
                onChanged();
            } else {
                statsBuilder_.remove(index);
            }
            return this;
        }

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public krpc.rpc.monitor.proto.RpcStat.Builder getStatsBuilder(
                int index) {
            return getStatsFieldBuilder().getBuilder(index);
        }

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public krpc.rpc.monitor.proto.RpcStatOrBuilder getStatsOrBuilder(
                int index) {
            if (statsBuilder_ == null) {
                return stats_.get(index);
            } else {
                return statsBuilder_.getMessageOrBuilder(index);
            }
        }

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public java.util.List<? extends krpc.rpc.monitor.proto.RpcStatOrBuilder>
        getStatsOrBuilderList() {
            if (statsBuilder_ != null) {
                return statsBuilder_.getMessageOrBuilderList();
            } else {
                return java.util.Collections.unmodifiableList(stats_);
            }
        }

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public krpc.rpc.monitor.proto.RpcStat.Builder addStatsBuilder() {
            return getStatsFieldBuilder().addBuilder(
                    krpc.rpc.monitor.proto.RpcStat.getDefaultInstance());
        }

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public krpc.rpc.monitor.proto.RpcStat.Builder addStatsBuilder(
                int index) {
            return getStatsFieldBuilder().addBuilder(
                    index, krpc.rpc.monitor.proto.RpcStat.getDefaultInstance());
        }

        /**
         * <code>repeated .RpcStat stats = 4;</code>
         */
        public java.util.List<krpc.rpc.monitor.proto.RpcStat.Builder>
        getStatsBuilderList() {
            return getStatsFieldBuilder().getBuilderList();
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<
                krpc.rpc.monitor.proto.RpcStat, krpc.rpc.monitor.proto.RpcStat.Builder, krpc.rpc.monitor.proto.RpcStatOrBuilder>
        getStatsFieldBuilder() {
            if (statsBuilder_ == null) {
                statsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                        krpc.rpc.monitor.proto.RpcStat, krpc.rpc.monitor.proto.RpcStat.Builder, krpc.rpc.monitor.proto.RpcStatOrBuilder>(
                        stats_,
                        ((bitField0_ & 0x00000008) == 0x00000008),
                        getParentForChildren(),
                        isClean());
                stats_ = null;
            }
            return statsBuilder_;
        }

        @java.lang.Override
        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFieldsProto3(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:ReportRpcStatReq)
    }

    // @@protoc_insertion_point(class_scope:ReportRpcStatReq)
    private static final krpc.rpc.monitor.proto.ReportRpcStatReq DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new krpc.rpc.monitor.proto.ReportRpcStatReq();
    }

    public static krpc.rpc.monitor.proto.ReportRpcStatReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReportRpcStatReq>
            PARSER = new com.google.protobuf.AbstractParser<ReportRpcStatReq>() {
        @java.lang.Override
        public ReportRpcStatReq parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new ReportRpcStatReq(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<ReportRpcStatReq> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReportRpcStatReq> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public krpc.rpc.monitor.proto.ReportRpcStatReq getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

