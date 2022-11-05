// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;
	/* don't check for reservations */

@Name("struct shminfo") @Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class shminfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public shminfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public shminfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public shminfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public shminfo position(long position) {
        return (shminfo)super.position(position);
    }
    @Override public shminfo getPointer(long i) {
        return new shminfo((Pointer)this).offsetAddress(i);
    }

    public native @Cast("__syscall_ulong_t") long shmmax(); public native shminfo shmmax(long setter);
    public native @Cast("__syscall_ulong_t") long shmmin(); public native shminfo shmmin(long setter);
    public native @Cast("__syscall_ulong_t") long shmmni(); public native shminfo shmmni(long setter);
    public native @Cast("__syscall_ulong_t") long shmseg(); public native shminfo shmseg(long setter);
    public native @Cast("__syscall_ulong_t") long shmall(); public native shminfo shmall(long setter);
    public native @Cast("__syscall_ulong_t") long __unused1(); public native shminfo __unused1(long setter);
    public native @Cast("__syscall_ulong_t") long __unused2(); public native shminfo __unused2(long setter);
    public native @Cast("__syscall_ulong_t") long __unused3(); public native shminfo __unused3(long setter);
    public native @Cast("__syscall_ulong_t") long __unused4(); public native shminfo __unused4(long setter);
  }