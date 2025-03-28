// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class Tensor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Tensor(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Tensor(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Tensor position(long position) {
        return (Tensor)super.position(position);
    }
    @Override public Tensor getPointer(long i) {
        return new Tensor((Pointer)this).offsetAddress(i);
    }

  public Tensor() { super((Pointer)null); allocate(); }
  private native void allocate();

  public Tensor(@Const @ByRef Tensor other) { super((Pointer)null); allocate(other); }
  private native void allocate(@Const @ByRef Tensor other);

  

  public native @ByRef @Name("operator =") @NoException(true) Tensor put(@ByVal Tensor other);
  public native @ByRef LongVector sizes();
  /** if tensor is a scalar, the sizes is empty, but the element number is actually 1.
   *  size_from_dim() cannot handle this case, while elem_num() handles it correctly */
  public native @Cast("int64_t") long elem_num();
  public native @Cast("int64_t") long size_from_dim(int dim);

  public native @ByRef IntPointer elem_type();

  public native @ByRef StringVector strings();

  public native @ByRef FloatVector floats();

  public native @StdVector DoublePointer doubles();

  public native @StdVector IntPointer int32s();

  public native @ByRef LongVector int64s();

  public native @Cast("uint64_t*") @StdVector LongPointer uint64s();

  public native @StdString BytePointer raw();

  public native void set_raw_data(@StdString BytePointer raw_data);
  public native void set_raw_data(@StdString String raw_data);

  public native @Cast("bool") boolean is_segment();

  public native @Cast("int64_t") long segment_begin();

  public native @Cast("int64_t") long segment_end();

  public native void set_segment_begin_and_end(@Cast("int64_t") long begin, @Cast("int64_t") long end);

  public native @Cast("bool") boolean hasName();

  public native @StdString BytePointer name();

  public native void setName(@StdString BytePointer name);
  public native void setName(@StdString String name);

  public native @Cast("bool") boolean is_raw_data();
}
