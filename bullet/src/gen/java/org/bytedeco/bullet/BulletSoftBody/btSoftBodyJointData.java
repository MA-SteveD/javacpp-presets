// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

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
public class btSoftBodyJointData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btSoftBodyJointData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSoftBodyJointData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSoftBodyJointData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btSoftBodyJointData position(long position) {
        return (btSoftBodyJointData)super.position(position);
    }
    @Override public btSoftBodyJointData getPointer(long i) {
        return new btSoftBodyJointData((Pointer)this).offsetAddress(i);
    }

	public native Pointer m_bodyA(); public native btSoftBodyJointData m_bodyA(Pointer setter);
	public native Pointer m_bodyB(); public native btSoftBodyJointData m_bodyB(Pointer setter);
	public native @ByRef btVector3FloatData m_refs(int i); public native btSoftBodyJointData m_refs(int i, btVector3FloatData setter);
	@MemberGetter public native btVector3FloatData m_refs();
	public native float m_cfm(); public native btSoftBodyJointData m_cfm(float setter);
	public native float m_erp(); public native btSoftBodyJointData m_erp(float setter);
	public native float m_split(); public native btSoftBodyJointData m_split(float setter);
	public native int m_delete(); public native btSoftBodyJointData m_delete(int setter);
	public native @ByRef btVector3FloatData m_relPosition(int i); public native btSoftBodyJointData m_relPosition(int i, btVector3FloatData setter);
	@MemberGetter public native btVector3FloatData m_relPosition();  //linear
	public native int m_bodyAtype(); public native btSoftBodyJointData m_bodyAtype(int setter);
	public native int m_bodyBtype(); public native btSoftBodyJointData m_bodyBtype(int setter);
	public native int m_jointType(); public native btSoftBodyJointData m_jointType(int setter);
	public native int m_pad(); public native btSoftBodyJointData m_pad(int setter);
}
