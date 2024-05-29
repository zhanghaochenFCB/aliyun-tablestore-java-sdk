// automatically generated by the FlatBuffers compiler, do not modify

package com.alicloud.openservices.tablestore.core.protocol.timeseries.flatbuffer;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FlatBufferRowInGroup extends Table {
  public static FlatBufferRowInGroup getRootAsFlatBufferRowInGroup(ByteBuffer _bb) { return getRootAsFlatBufferRowInGroup(_bb, new FlatBufferRowInGroup()); }
  public static FlatBufferRowInGroup getRootAsFlatBufferRowInGroup(ByteBuffer _bb, FlatBufferRowInGroup obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public FlatBufferRowInGroup __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String dataSource() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer dataSourceAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer dataSourceInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String tags() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer tagsAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer tagsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public long time() { int o = __offset(8); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public FieldValues fieldValues() { return fieldValues(new FieldValues()); }
  public FieldValues fieldValues(FieldValues obj) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public long metaCacheUpdateTime() { int o = __offset(12); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public Tag tagList(int j) { return tagList(new Tag(), j); }
  public Tag tagList(Tag obj, int j) { int o = __offset(14); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int tagListLength() { int o = __offset(14); return o != 0 ? __vector_len(o) : 0; }

  public static int createFlatBufferRowInGroup(FlatBufferBuilder builder,
      int data_sourceOffset,
      int tagsOffset,
      long time,
      int field_valuesOffset,
      long meta_cache_update_time,
      int tag_listOffset) {
    builder.startObject(6);
    FlatBufferRowInGroup.addTime(builder, time);
    FlatBufferRowInGroup.addTagList(builder, tag_listOffset);
    FlatBufferRowInGroup.addMetaCacheUpdateTime(builder, meta_cache_update_time);
    FlatBufferRowInGroup.addFieldValues(builder, field_valuesOffset);
    FlatBufferRowInGroup.addTags(builder, tagsOffset);
    FlatBufferRowInGroup.addDataSource(builder, data_sourceOffset);
    return FlatBufferRowInGroup.endFlatBufferRowInGroup(builder);
  }

  public static void startFlatBufferRowInGroup(FlatBufferBuilder builder) { builder.startObject(6); }
  public static void addDataSource(FlatBufferBuilder builder, int dataSourceOffset) { builder.addOffset(0, dataSourceOffset, 0); }
  public static void addTags(FlatBufferBuilder builder, int tagsOffset) { builder.addOffset(1, tagsOffset, 0); }
  public static void addTime(FlatBufferBuilder builder, long time) { builder.addLong(2, time, 0L); }
  public static void addFieldValues(FlatBufferBuilder builder, int fieldValuesOffset) { builder.addOffset(3, fieldValuesOffset, 0); }
  public static void addMetaCacheUpdateTime(FlatBufferBuilder builder, long metaCacheUpdateTime) { builder.addInt(4, (int)metaCacheUpdateTime, (int)0L); }
  public static void addTagList(FlatBufferBuilder builder, int tagListOffset) { builder.addOffset(5, tagListOffset, 0); }
  public static int createTagListVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startTagListVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endFlatBufferRowInGroup(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

