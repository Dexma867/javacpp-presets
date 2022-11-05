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
public class SoftBodyNodeData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SoftBodyNodeData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SoftBodyNodeData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftBodyNodeData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SoftBodyNodeData position(long position) {
        return (SoftBodyNodeData)super.position(position);
    }
    @Override public SoftBodyNodeData getPointer(long i) {
        return new SoftBodyNodeData((Pointer)this).offsetAddress(i);
    }

	public native SoftBodyMaterialData m_material(); public native SoftBodyNodeData m_material(SoftBodyMaterialData setter);
	public native @ByRef btVector3FloatData m_position(); public native SoftBodyNodeData m_position(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_previousPosition(); public native SoftBodyNodeData m_previousPosition(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_velocity(); public native SoftBodyNodeData m_velocity(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_accumulatedForce(); public native SoftBodyNodeData m_accumulatedForce(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_normal(); public native SoftBodyNodeData m_normal(btVector3FloatData setter);
	public native float m_inverseMass(); public native SoftBodyNodeData m_inverseMass(float setter);
	public native float m_area(); public native SoftBodyNodeData m_area(float setter);
	public native int m_attach(); public native SoftBodyNodeData m_attach(int setter);
	public native int m_pad(); public native SoftBodyNodeData m_pad(int setter);
}