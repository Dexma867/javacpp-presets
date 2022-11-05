// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletDynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;

import static org.bytedeco.bullet.global.BulletDynamics.*;


// #ifdef BT_BACKWARDS_COMPATIBLE_SERIALIZATION
/**this structure is not used, except for loading pre-2.82 .bullet files */
@Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btConeTwistConstraintData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btConeTwistConstraintData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btConeTwistConstraintData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConeTwistConstraintData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btConeTwistConstraintData position(long position) {
        return (btConeTwistConstraintData)super.position(position);
    }
    @Override public btConeTwistConstraintData getPointer(long i) {
        return new btConeTwistConstraintData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btTypedConstraintData m_typeConstraintData(); public native btConeTwistConstraintData m_typeConstraintData(btTypedConstraintData setter);
	public native @ByRef btTransformFloatData m_rbAFrame(); public native btConeTwistConstraintData m_rbAFrame(btTransformFloatData setter);
	public native @ByRef btTransformFloatData m_rbBFrame(); public native btConeTwistConstraintData m_rbBFrame(btTransformFloatData setter);

	//limits
	public native float m_swingSpan1(); public native btConeTwistConstraintData m_swingSpan1(float setter);
	public native float m_swingSpan2(); public native btConeTwistConstraintData m_swingSpan2(float setter);
	public native float m_twistSpan(); public native btConeTwistConstraintData m_twistSpan(float setter);
	public native float m_limitSoftness(); public native btConeTwistConstraintData m_limitSoftness(float setter);
	public native float m_biasFactor(); public native btConeTwistConstraintData m_biasFactor(float setter);
	public native float m_relaxationFactor(); public native btConeTwistConstraintData m_relaxationFactor(float setter);

	public native float m_damping(); public native btConeTwistConstraintData m_damping(float setter);

	public native @Cast("char") byte m_pad(int i); public native btConeTwistConstraintData m_pad(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_pad();
}