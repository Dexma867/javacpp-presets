// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;


/* Data structure describing a shared memory segment.  */
@Name("struct shmid_ds") @Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class shmid_ds extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public shmid_ds() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public shmid_ds(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public shmid_ds(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public shmid_ds position(long position) {
        return (shmid_ds)super.position(position);
    }
    @Override public shmid_ds getPointer(long i) {
        return new shmid_ds((Pointer)this).offsetAddress(i);
    }

    public native @ByRef ipc_perm shm_perm(); public native shmid_ds shm_perm(ipc_perm setter);		/* operation permission struct */
    public native @Cast("size_t") long shm_segsz(); public native shmid_ds shm_segsz(long setter);			/* size of segment in bytes */
    public native @Cast("__time_t") long shm_atime(); public native shmid_ds shm_atime(long setter);			/* time of last shmat() */
// #ifndef __x86_64__
// #endif
    public native @Cast("__time_t") long shm_dtime(); public native shmid_ds shm_dtime(long setter);			/* time of last shmdt() */
// #ifndef __x86_64__
// #endif
    public native @Cast("__time_t") long shm_ctime(); public native shmid_ds shm_ctime(long setter);			/* time of last change by shmctl() */
// #ifndef __x86_64__
// #endif
    public native @Cast("__pid_t") int shm_cpid(); public native shmid_ds shm_cpid(int setter);			/* pid of creator */
    public native @Cast("__pid_t") int shm_lpid(); public native shmid_ds shm_lpid(int setter);			/* pid of last shmop */
    public native @Cast("shmatt_t") long shm_nattch(); public native shmid_ds shm_nattch(long setter);		/* number of current attaches */
    public native @Cast("__syscall_ulong_t") long __unused4(); public native shmid_ds __unused4(long setter);
    public native @Cast("__syscall_ulong_t") long __unused5(); public native shmid_ds __unused5(long setter);
  }