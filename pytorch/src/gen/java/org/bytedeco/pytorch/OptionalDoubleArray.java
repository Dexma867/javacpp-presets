// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("c10::OptionalArray<double>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OptionalDoubleArray extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptionalDoubleArray(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OptionalDoubleArray(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OptionalDoubleArray position(long position) {
        return (OptionalDoubleArray)super.position(position);
    }
    @Override public OptionalDoubleArray getPointer(long i) {
        return new OptionalDoubleArray((Pointer)this).offsetAddress(i);
    }

  public native @ByRef DoubleVectorOptional list(); public native OptionalDoubleArray list(DoubleVectorOptional setter);

  public OptionalDoubleArray() { super((Pointer)null); allocate(); }
  private native void allocate();
  public OptionalDoubleArray(@ByVal @Cast("std::vector<double>*") DoubleVector val) { super((Pointer)null); allocate(val); }
  private native void allocate(@ByVal @Cast("std::vector<double>*") DoubleVector val);

  // Used when saving an argument for the backwards pass.
  public native @ByRef @Name("operator =") OptionalDoubleArray put(@ByVal DoubleArrayRefOptional ref);

  // Used when saving an argument for the backwards pass.
  public native @ByRef @Name("operator =") OptionalDoubleArray put(@ByVal OptionalDoubleArrayRef ref);

  public native @ByVal @Name("operator c10::optional<c10::ArrayRef<double> >") DoubleArrayRefOptional asDoubleArrayRefOptional();

  public native @ByVal @Name("operator c10::OptionalArrayRef<double>") OptionalDoubleArrayRef asOptionalDoubleArrayRef();
}
