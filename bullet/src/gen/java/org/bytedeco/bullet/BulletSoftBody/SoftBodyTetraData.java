// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;


@Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class SoftBodyTetraData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SoftBodyTetraData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SoftBodyTetraData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftBodyTetraData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SoftBodyTetraData position(long position) {
        return (SoftBodyTetraData)super.position(position);
    }
    @Override public SoftBodyTetraData getPointer(long i) {
        return new SoftBodyTetraData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btVector3FloatData m_c0(int i); public native SoftBodyTetraData m_c0(int i, btVector3FloatData setter);
	@MemberGetter public native btVector3FloatData m_c0();  // gradients
	public native SoftBodyMaterialData m_material(); public native SoftBodyTetraData m_material(SoftBodyMaterialData setter);
	public native int m_nodeIndices(int i); public native SoftBodyTetraData m_nodeIndices(int i, int setter);
	@MemberGetter public native IntPointer m_nodeIndices();  // Node pointers
	public native float m_restVolume(); public native SoftBodyTetraData m_restVolume(float setter);    // Rest volume
	public native float m_c1(); public native SoftBodyTetraData m_c1(float setter);            // (4*kVST)/(im0+im1+im2+im3)
	public native float m_c2(); public native SoftBodyTetraData m_c2(float setter);            // m_c1/sum(|g0..3|^2)
	public native int m_pad(); public native SoftBodyTetraData m_pad(int setter);
}