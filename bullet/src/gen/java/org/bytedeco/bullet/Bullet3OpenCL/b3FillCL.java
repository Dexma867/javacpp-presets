// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3OpenCL;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;
import org.bytedeco.bullet.Bullet3Dynamics.*;
import static org.bytedeco.bullet.global.Bullet3Dynamics.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.Bullet3OpenCL.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3FillCL extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3FillCL(Pointer p) { super(p); }

	public static class b3ConstData extends Pointer {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public b3ConstData() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public b3ConstData(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public b3ConstData(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public b3ConstData position(long position) {
	        return (b3ConstData)super.position(position);
	    }
	    @Override public b3ConstData getPointer(long i) {
	        return new b3ConstData((Pointer)this).offsetAddress(i);
	    }
	
			public native @ByRef b3Int4 m_data(); public native b3ConstData m_data(b3Int4 setter);
			public native @ByRef b3UnsignedInt4 m_UnsignedData(); public native b3ConstData m_UnsignedData(b3UnsignedInt4 setter);
		public native int m_offset(); public native b3ConstData m_offset(int setter);
		public native int m_n(); public native b3ConstData m_n(int setter);
		public native int m_padding(int i); public native b3ConstData m_padding(int i, int setter);
		@MemberGetter public native IntPointer m_padding();
	}
	public b3FillCL(@Cast("cl_context") Pointer ctx, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer queue) { super((Pointer)null); allocate(ctx, device, queue); }
	private native void allocate(@Cast("cl_context") Pointer ctx, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer queue);

	public native void execute(@ByRef b3UnsignedIntOCLArray src, @Cast("const unsigned int") int value, int n, int offset/*=0*/);
	public native void execute(@ByRef b3UnsignedIntOCLArray src, @Cast("const unsigned int") int value, int n);

	public native void execute(@ByRef b3IntOCLArray src, int value, int n, int offset/*=0*/);
	public native void execute(@ByRef b3IntOCLArray src, int value, int n);

	public native void execute(@ByRef b3FloatOCLArray src, float value, int n, int offset/*=0*/);
	public native void execute(@ByRef b3FloatOCLArray src, float value, int n);

	public native void execute(@ByRef b3Int2OCLArray src, @Const @ByRef b3Int2 value, int n, int offset/*=0*/);
	public native void execute(@ByRef b3Int2OCLArray src, @Const @ByRef b3Int2 value, int n);

	public native void executeHost(@ByRef b3Int2Array src, @Const @ByRef b3Int2 value, int n, int offset);

	public native void executeHost(@ByRef b3IntArray src, int value, int n, int offset);

	//	void execute(b3OpenCLArray<b3Int4>& src, const b3Int4& value, int n, int offset = 0);
}