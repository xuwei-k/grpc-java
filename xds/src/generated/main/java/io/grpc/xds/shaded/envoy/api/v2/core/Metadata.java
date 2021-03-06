// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/base.proto

package io.grpc.xds.shaded.envoy.api.v2.core;

/**
 * <pre>
 * Metadata provides additional inputs to filters based on matched listeners,
 * filter chains, routes and endpoints. It is structured as a map, usually from
 * filter name (in reverse DNS format) to metadata specific to the filter. Metadata
 * key-values for a filter are merged as connection and request handling occurs,
 * with later values for the same key overriding earlier values.
 * An example use of metadata is providing additional values to
 * http_connection_manager in the envoy.http_connection_manager.access_log
 * namespace.
 * Another example use of metadata is to per service config info in cluster metadata, which may get
 * consumed by multiple filters.
 * For load balancing, Metadata provides a means to subset cluster endpoints.
 * Endpoints have a Metadata object associated and routes contain a Metadata
 * object to match against. There are some well defined metadata used today for
 * this purpose:
 * * ``{"envoy.lb": {"canary": &lt;bool&gt; }}`` This indicates the canary status of an
 *   endpoint and is also used during header processing
 *   (x-envoy-upstream-canary) and for stats purposes.
 * </pre>
 *
 * Protobuf type {@code envoy.api.v2.core.Metadata}
 */
public  final class Metadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.api.v2.core.Metadata)
    MetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Metadata.newBuilder() to construct.
  private Metadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Metadata() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Metadata(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              filterMetadata_ = com.google.protobuf.MapField.newMapField(
                  FilterMetadataDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Struct>
            filterMetadata__ = input.readMessage(
                FilterMetadataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            filterMetadata_.getMutableMap().put(
                filterMetadata__.getKey(), filterMetadata__.getValue());
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_Metadata_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetFilterMetadata();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_Metadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.xds.shaded.envoy.api.v2.core.Metadata.class, io.grpc.xds.shaded.envoy.api.v2.core.Metadata.Builder.class);
  }

  public static final int FILTER_METADATA_FIELD_NUMBER = 1;
  private static final class FilterMetadataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.protobuf.Struct> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.protobuf.Struct>newDefaultInstance(
                io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_Metadata_FilterMetadataEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.google.protobuf.Struct.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.google.protobuf.Struct> filterMetadata_;
  private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Struct>
  internalGetFilterMetadata() {
    if (filterMetadata_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          FilterMetadataDefaultEntryHolder.defaultEntry);
    }
    return filterMetadata_;
  }

  public int getFilterMetadataCount() {
    return internalGetFilterMetadata().getMap().size();
  }
  /**
   * <pre>
   * Key is the reverse DNS filter name, e.g. com.acme.widget. The envoy.*
   * namespace is reserved for Envoy's built-in filters.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Struct&gt; filter_metadata = 1;</code>
   */

  public boolean containsFilterMetadata(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetFilterMetadata().getMap().containsKey(key);
  }
  /**
   * Use {@link #getFilterMetadataMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.protobuf.Struct> getFilterMetadata() {
    return getFilterMetadataMap();
  }
  /**
   * <pre>
   * Key is the reverse DNS filter name, e.g. com.acme.widget. The envoy.*
   * namespace is reserved for Envoy's built-in filters.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Struct&gt; filter_metadata = 1;</code>
   */

  public java.util.Map<java.lang.String, com.google.protobuf.Struct> getFilterMetadataMap() {
    return internalGetFilterMetadata().getMap();
  }
  /**
   * <pre>
   * Key is the reverse DNS filter name, e.g. com.acme.widget. The envoy.*
   * namespace is reserved for Envoy's built-in filters.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Struct&gt; filter_metadata = 1;</code>
   */

  public com.google.protobuf.Struct getFilterMetadataOrDefault(
      java.lang.String key,
      com.google.protobuf.Struct defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.google.protobuf.Struct> map =
        internalGetFilterMetadata().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Key is the reverse DNS filter name, e.g. com.acme.widget. The envoy.*
   * namespace is reserved for Envoy's built-in filters.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Struct&gt; filter_metadata = 1;</code>
   */

  public com.google.protobuf.Struct getFilterMetadataOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.google.protobuf.Struct> map =
        internalGetFilterMetadata().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetFilterMetadata(),
        FilterMetadataDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.google.protobuf.Struct> entry
         : internalGetFilterMetadata().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Struct>
      filterMetadata__ = FilterMetadataDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, filterMetadata__);
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
    if (!(obj instanceof io.grpc.xds.shaded.envoy.api.v2.core.Metadata)) {
      return super.equals(obj);
    }
    io.grpc.xds.shaded.envoy.api.v2.core.Metadata other = (io.grpc.xds.shaded.envoy.api.v2.core.Metadata) obj;

    boolean result = true;
    result = result && internalGetFilterMetadata().equals(
        other.internalGetFilterMetadata());
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
    if (!internalGetFilterMetadata().getMap().isEmpty()) {
      hash = (37 * hash) + FILTER_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetFilterMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.xds.shaded.envoy.api.v2.core.Metadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Metadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Metadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Metadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Metadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Metadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Metadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Metadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Metadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Metadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Metadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Metadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.xds.shaded.envoy.api.v2.core.Metadata prototype) {
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
   * <pre>
   * Metadata provides additional inputs to filters based on matched listeners,
   * filter chains, routes and endpoints. It is structured as a map, usually from
   * filter name (in reverse DNS format) to metadata specific to the filter. Metadata
   * key-values for a filter are merged as connection and request handling occurs,
   * with later values for the same key overriding earlier values.
   * An example use of metadata is providing additional values to
   * http_connection_manager in the envoy.http_connection_manager.access_log
   * namespace.
   * Another example use of metadata is to per service config info in cluster metadata, which may get
   * consumed by multiple filters.
   * For load balancing, Metadata provides a means to subset cluster endpoints.
   * Endpoints have a Metadata object associated and routes contain a Metadata
   * object to match against. There are some well defined metadata used today for
   * this purpose:
   * * ``{"envoy.lb": {"canary": &lt;bool&gt; }}`` This indicates the canary status of an
   *   endpoint and is also used during header processing
   *   (x-envoy-upstream-canary) and for stats purposes.
   * </pre>
   *
   * Protobuf type {@code envoy.api.v2.core.Metadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.api.v2.core.Metadata)
      io.grpc.xds.shaded.envoy.api.v2.core.MetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_Metadata_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetFilterMetadata();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableFilterMetadata();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_Metadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.xds.shaded.envoy.api.v2.core.Metadata.class, io.grpc.xds.shaded.envoy.api.v2.core.Metadata.Builder.class);
    }

    // Construct using io.grpc.xds.shaded.envoy.api.v2.core.Metadata.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableFilterMetadata().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_Metadata_descriptor;
    }

    @java.lang.Override
    public io.grpc.xds.shaded.envoy.api.v2.core.Metadata getDefaultInstanceForType() {
      return io.grpc.xds.shaded.envoy.api.v2.core.Metadata.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.xds.shaded.envoy.api.v2.core.Metadata build() {
      io.grpc.xds.shaded.envoy.api.v2.core.Metadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.xds.shaded.envoy.api.v2.core.Metadata buildPartial() {
      io.grpc.xds.shaded.envoy.api.v2.core.Metadata result = new io.grpc.xds.shaded.envoy.api.v2.core.Metadata(this);
      int from_bitField0_ = bitField0_;
      result.filterMetadata_ = internalGetFilterMetadata();
      result.filterMetadata_.makeImmutable();
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
      if (other instanceof io.grpc.xds.shaded.envoy.api.v2.core.Metadata) {
        return mergeFrom((io.grpc.xds.shaded.envoy.api.v2.core.Metadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.xds.shaded.envoy.api.v2.core.Metadata other) {
      if (other == io.grpc.xds.shaded.envoy.api.v2.core.Metadata.getDefaultInstance()) return this;
      internalGetMutableFilterMetadata().mergeFrom(
          other.internalGetFilterMetadata());
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
      io.grpc.xds.shaded.envoy.api.v2.core.Metadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.xds.shaded.envoy.api.v2.core.Metadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, com.google.protobuf.Struct> filterMetadata_;
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Struct>
    internalGetFilterMetadata() {
      if (filterMetadata_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            FilterMetadataDefaultEntryHolder.defaultEntry);
      }
      return filterMetadata_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Struct>
    internalGetMutableFilterMetadata() {
      onChanged();;
      if (filterMetadata_ == null) {
        filterMetadata_ = com.google.protobuf.MapField.newMapField(
            FilterMetadataDefaultEntryHolder.defaultEntry);
      }
      if (!filterMetadata_.isMutable()) {
        filterMetadata_ = filterMetadata_.copy();
      }
      return filterMetadata_;
    }

    public int getFilterMetadataCount() {
      return internalGetFilterMetadata().getMap().size();
    }
    /**
     * <pre>
     * Key is the reverse DNS filter name, e.g. com.acme.widget. The envoy.*
     * namespace is reserved for Envoy's built-in filters.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Struct&gt; filter_metadata = 1;</code>
     */

    public boolean containsFilterMetadata(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetFilterMetadata().getMap().containsKey(key);
    }
    /**
     * Use {@link #getFilterMetadataMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.Struct> getFilterMetadata() {
      return getFilterMetadataMap();
    }
    /**
     * <pre>
     * Key is the reverse DNS filter name, e.g. com.acme.widget. The envoy.*
     * namespace is reserved for Envoy's built-in filters.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Struct&gt; filter_metadata = 1;</code>
     */

    public java.util.Map<java.lang.String, com.google.protobuf.Struct> getFilterMetadataMap() {
      return internalGetFilterMetadata().getMap();
    }
    /**
     * <pre>
     * Key is the reverse DNS filter name, e.g. com.acme.widget. The envoy.*
     * namespace is reserved for Envoy's built-in filters.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Struct&gt; filter_metadata = 1;</code>
     */

    public com.google.protobuf.Struct getFilterMetadataOrDefault(
        java.lang.String key,
        com.google.protobuf.Struct defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.google.protobuf.Struct> map =
          internalGetFilterMetadata().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Key is the reverse DNS filter name, e.g. com.acme.widget. The envoy.*
     * namespace is reserved for Envoy's built-in filters.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Struct&gt; filter_metadata = 1;</code>
     */

    public com.google.protobuf.Struct getFilterMetadataOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.google.protobuf.Struct> map =
          internalGetFilterMetadata().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearFilterMetadata() {
      internalGetMutableFilterMetadata().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Key is the reverse DNS filter name, e.g. com.acme.widget. The envoy.*
     * namespace is reserved for Envoy's built-in filters.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Struct&gt; filter_metadata = 1;</code>
     */

    public Builder removeFilterMetadata(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableFilterMetadata().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.Struct>
    getMutableFilterMetadata() {
      return internalGetMutableFilterMetadata().getMutableMap();
    }
    /**
     * <pre>
     * Key is the reverse DNS filter name, e.g. com.acme.widget. The envoy.*
     * namespace is reserved for Envoy's built-in filters.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Struct&gt; filter_metadata = 1;</code>
     */
    public Builder putFilterMetadata(
        java.lang.String key,
        com.google.protobuf.Struct value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableFilterMetadata().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Key is the reverse DNS filter name, e.g. com.acme.widget. The envoy.*
     * namespace is reserved for Envoy's built-in filters.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Struct&gt; filter_metadata = 1;</code>
     */

    public Builder putAllFilterMetadata(
        java.util.Map<java.lang.String, com.google.protobuf.Struct> values) {
      internalGetMutableFilterMetadata().getMutableMap()
          .putAll(values);
      return this;
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


    // @@protoc_insertion_point(builder_scope:envoy.api.v2.core.Metadata)
  }

  // @@protoc_insertion_point(class_scope:envoy.api.v2.core.Metadata)
  private static final io.grpc.xds.shaded.envoy.api.v2.core.Metadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.xds.shaded.envoy.api.v2.core.Metadata();
  }

  public static io.grpc.xds.shaded.envoy.api.v2.core.Metadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Metadata>
      PARSER = new com.google.protobuf.AbstractParser<Metadata>() {
    @java.lang.Override
    public Metadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Metadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Metadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Metadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.xds.shaded.envoy.api.v2.core.Metadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

