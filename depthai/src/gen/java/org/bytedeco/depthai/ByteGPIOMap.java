// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

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

@Name("std::unordered_map<std::int8_t,dai::BoardConfig::GPIO>") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class ByteGPIOMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ByteGPIOMap(Pointer p) { super(p); }
    public ByteGPIOMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef ByteGPIOMap put(@ByRef ByteGPIOMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @ByRef BoardConfig.GPIO get(byte i);
    public native ByteGPIOMap put(byte i, BoardConfig.GPIO value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter byte first();
        public native @Name("operator *().second") @MemberGetter @ByRef @Const BoardConfig.GPIO second();
    }
}
