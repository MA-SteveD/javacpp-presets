// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * MessageGroup message. Carries multiple messages in one.
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class MessageGroup extends Buffer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MessageGroup(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MessageGroup(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MessageGroup position(long position) {
        return (MessageGroup)super.position(position);
    }
    @Override public MessageGroup getPointer(long i) {
        return new MessageGroup((Pointer)this).offsetAddress(i);
    }

    /** Construct MessageGroup message */
    public MessageGroup() { super((Pointer)null); allocate(); }
    private native void allocate();
    public MessageGroup(@SharedPtr RawMessageGroup ptr) { super((Pointer)null); allocate(ptr); }
    private native void allocate(@SharedPtr RawMessageGroup ptr);

    /** Group */
    public native @SharedPtr @ByVal @Name("operator []") ADatatype get(@StdString BytePointer name);
    public native @SharedPtr @ByVal @Name("operator []") ADatatype get(@StdString ByteBuffer name);
    public native @SharedPtr @ByVal @Name("operator []") ADatatype get(@StdString String name);
    
    

    // Iterators
    public native @ByVal @Cast("std::unordered_map<std::string,std::shared_ptr<dai::ADatatype> >::iterator*") Pointer begin();
    public native @ByVal @Cast("std::unordered_map<std::string,std::shared_ptr<dai::ADatatype> >::iterator*") Pointer end();

    /**
     * True if all messages in the group are in the interval
     * @param thresholdNs Maximal interval between messages
     */
    public native @Cast("bool") boolean isSynced(@Cast("int64_t") long thresholdNs);

    /**
     * Retrieves interval between the first and the last message in the group.
     */
    public native @Cast("int64_t") long getIntervalNs();

    public native @Cast("int64_t") long getNumMessages();

    /**
     * Gets the names of messages in the group
     */
    public native @ByVal StringVector getMessageNames();

    /**
     * Sets image timestamp related to dai::Clock::now()
     */
    public native @ByRef MessageGroup setTimestamp(@ByVal @Cast("std::chrono::time_point<std::chrono::steady_clock,std::chrono::steady_clock::duration>*") Pointer timestamp);

    /**
     * Sets image timestamp related to dai::Clock::now()
     */
    public native @ByRef MessageGroup setTimestampDevice(@ByVal @Cast("std::chrono::time_point<std::chrono::steady_clock,std::chrono::steady_clock::duration>*") Pointer timestamp);

    /**
     * Retrieves image sequence number
     */
    public native @ByRef MessageGroup setSequenceNum(@Cast("int64_t") long sequenceNum);
}
