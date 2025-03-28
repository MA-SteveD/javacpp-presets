// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

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


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btSliderConstraint extends btTypedConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSliderConstraint(Pointer p) { super(p); }


	// constructors
	public btSliderConstraint(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btTransform frameInA, @Const @ByRef btTransform frameInB, @Cast("bool") boolean useLinearReferenceFrameA) { super((Pointer)null); allocate(rbA, rbB, frameInA, frameInB, useLinearReferenceFrameA); }
	private native void allocate(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btTransform frameInA, @Const @ByRef btTransform frameInB, @Cast("bool") boolean useLinearReferenceFrameA);
	public btSliderConstraint(@ByRef btRigidBody rbB, @Const @ByRef btTransform frameInB, @Cast("bool") boolean useLinearReferenceFrameA) { super((Pointer)null); allocate(rbB, frameInB, useLinearReferenceFrameA); }
	private native void allocate(@ByRef btRigidBody rbB, @Const @ByRef btTransform frameInB, @Cast("bool") boolean useLinearReferenceFrameA);

	// overrides

	public native void getInfo1(btConstraintInfo1 info);

	public native void getInfo1NonVirtual(btConstraintInfo1 info);

	public native void getInfo2(btConstraintInfo2 info);

	public native void getInfo2NonVirtual(btConstraintInfo2 info, @Const @ByRef btTransform transA, @Const @ByRef btTransform transB, @Const @ByRef btVector3 linVelA, @Const @ByRef btVector3 linVelB, @Cast("btScalar") double rbAinvMass, @Cast("btScalar") double rbBinvMass);

	// access
	public native @Const @ByRef btRigidBody getRigidBodyA();
	public native @Const @ByRef btRigidBody getRigidBodyB();
	public native @Const @ByRef btTransform getCalculatedTransformA();
	public native @Const @ByRef btTransform getCalculatedTransformB();
	public native @ByRef btTransform getFrameOffsetA();
	public native @ByRef btTransform getFrameOffsetB();
	public native @Cast("btScalar") double getLowerLinLimit();
	public native void setLowerLinLimit(@Cast("btScalar") double lowerLimit);
	public native @Cast("btScalar") double getUpperLinLimit();
	public native void setUpperLinLimit(@Cast("btScalar") double upperLimit);
	public native @Cast("btScalar") double getLowerAngLimit();
	public native void setLowerAngLimit(@Cast("btScalar") double lowerLimit);
	public native @Cast("btScalar") double getUpperAngLimit();
	public native void setUpperAngLimit(@Cast("btScalar") double upperLimit);
	public native @Cast("bool") boolean getUseLinearReferenceFrameA();
	public native @Cast("btScalar") double getSoftnessDirLin();
	public native @Cast("btScalar") double getRestitutionDirLin();
	public native @Cast("btScalar") double getDampingDirLin();
	public native @Cast("btScalar") double getSoftnessDirAng();
	public native @Cast("btScalar") double getRestitutionDirAng();
	public native @Cast("btScalar") double getDampingDirAng();
	public native @Cast("btScalar") double getSoftnessLimLin();
	public native @Cast("btScalar") double getRestitutionLimLin();
	public native @Cast("btScalar") double getDampingLimLin();
	public native @Cast("btScalar") double getSoftnessLimAng();
	public native @Cast("btScalar") double getRestitutionLimAng();
	public native @Cast("btScalar") double getDampingLimAng();
	public native @Cast("btScalar") double getSoftnessOrthoLin();
	public native @Cast("btScalar") double getRestitutionOrthoLin();
	public native @Cast("btScalar") double getDampingOrthoLin();
	public native @Cast("btScalar") double getSoftnessOrthoAng();
	public native @Cast("btScalar") double getRestitutionOrthoAng();
	public native @Cast("btScalar") double getDampingOrthoAng();
	public native void setSoftnessDirLin(@Cast("btScalar") double softnessDirLin);
	public native void setRestitutionDirLin(@Cast("btScalar") double restitutionDirLin);
	public native void setDampingDirLin(@Cast("btScalar") double dampingDirLin);
	public native void setSoftnessDirAng(@Cast("btScalar") double softnessDirAng);
	public native void setRestitutionDirAng(@Cast("btScalar") double restitutionDirAng);
	public native void setDampingDirAng(@Cast("btScalar") double dampingDirAng);
	public native void setSoftnessLimLin(@Cast("btScalar") double softnessLimLin);
	public native void setRestitutionLimLin(@Cast("btScalar") double restitutionLimLin);
	public native void setDampingLimLin(@Cast("btScalar") double dampingLimLin);
	public native void setSoftnessLimAng(@Cast("btScalar") double softnessLimAng);
	public native void setRestitutionLimAng(@Cast("btScalar") double restitutionLimAng);
	public native void setDampingLimAng(@Cast("btScalar") double dampingLimAng);
	public native void setSoftnessOrthoLin(@Cast("btScalar") double softnessOrthoLin);
	public native void setRestitutionOrthoLin(@Cast("btScalar") double restitutionOrthoLin);
	public native void setDampingOrthoLin(@Cast("btScalar") double dampingOrthoLin);
	public native void setSoftnessOrthoAng(@Cast("btScalar") double softnessOrthoAng);
	public native void setRestitutionOrthoAng(@Cast("btScalar") double restitutionOrthoAng);
	public native void setDampingOrthoAng(@Cast("btScalar") double dampingOrthoAng);
	public native void setPoweredLinMotor(@Cast("bool") boolean onOff);
	public native @Cast("bool") boolean getPoweredLinMotor();
	public native void setTargetLinMotorVelocity(@Cast("btScalar") double targetLinMotorVelocity);
	public native @Cast("btScalar") double getTargetLinMotorVelocity();
	public native void setMaxLinMotorForce(@Cast("btScalar") double maxLinMotorForce);
	public native @Cast("btScalar") double getMaxLinMotorForce();
	public native void setPoweredAngMotor(@Cast("bool") boolean onOff);
	public native @Cast("bool") boolean getPoweredAngMotor();
	public native void setTargetAngMotorVelocity(@Cast("btScalar") double targetAngMotorVelocity);
	public native @Cast("btScalar") double getTargetAngMotorVelocity();
	public native void setMaxAngMotorForce(@Cast("btScalar") double maxAngMotorForce);
	public native @Cast("btScalar") double getMaxAngMotorForce();

	public native @Cast("btScalar") double getLinearPos();
	public native @Cast("btScalar") double getAngularPos();

	// access for ODE solver
	public native @Cast("bool") boolean getSolveLinLimit();
	public native @Cast("btScalar") double getLinDepth();
	public native @Cast("bool") boolean getSolveAngLimit();
	public native @Cast("btScalar") double getAngDepth();
	// shared code used by ODE solver
	public native void calculateTransforms(@Const @ByRef btTransform transA, @Const @ByRef btTransform transB);
	public native void testLinLimits();
	public native void testAngLimits();
	// access for PE Solver
	public native @ByVal btVector3 getAncorInA();
	public native @ByVal btVector3 getAncorInB();
	// access for UseFrameOffset
	public native @Cast("bool") boolean getUseFrameOffset();
	public native void setUseFrameOffset(@Cast("bool") boolean frameOffsetOnOff);

	public native void setFrames(@Const @ByRef btTransform frameA, @Const @ByRef btTransform frameB);

	/**override the default global value of a parameter (such as ERP or CFM), optionally provide the axis (0..5).
	 * If no axis is provided, it uses the default axis for this constraint. */
	public native void setParam(int num, @Cast("btScalar") double value, int axis/*=-1*/);
	public native void setParam(int num, @Cast("btScalar") double value);
	/**return the local value of parameter */
	public native @Cast("btScalar") double getParam(int num, int axis/*=-1*/);
	public native @Cast("btScalar") double getParam(int num);

	public native int getFlags();

	public native int calculateSerializeBufferSize();

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);
}
