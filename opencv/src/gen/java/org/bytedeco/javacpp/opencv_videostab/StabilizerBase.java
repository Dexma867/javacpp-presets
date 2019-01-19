// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_videostab;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;
import org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc.*;
import org.bytedeco.javacpp.opencv_imgcodecs.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.opencv_imgcodecs.*;
import org.bytedeco.javacpp.opencv_videoio.*;
import static org.bytedeco.javacpp.opencv_videoio.opencv_videoio.*;
import org.bytedeco.javacpp.opencv_highgui.*;
import static org.bytedeco.javacpp.opencv_highgui.opencv_highgui.*;
import org.bytedeco.javacpp.opencv_flann.*;
import static org.bytedeco.javacpp.opencv_flann.opencv_flann.*;
import org.bytedeco.javacpp.opencv_features2d.*;
import static org.bytedeco.javacpp.opencv_features2d.opencv_features2d.*;
import org.bytedeco.javacpp.opencv_calib3d.*;
import static org.bytedeco.javacpp.opencv_calib3d.opencv_calib3d.*;
import org.bytedeco.javacpp.opencv_objdetect.*;
import static org.bytedeco.javacpp.opencv_objdetect.opencv_objdetect.*;
import org.bytedeco.javacpp.opencv_ximgproc.*;
import static org.bytedeco.javacpp.opencv_ximgproc.opencv_ximgproc.*;
import org.bytedeco.javacpp.opencv_video.*;
import static org.bytedeco.javacpp.opencv_video.opencv_video.*;
import org.bytedeco.javacpp.opencv_optflow.*;
import static org.bytedeco.javacpp.opencv_optflow.opencv_optflow.*;
import org.bytedeco.javacpp.opencv_photo.*;
import static org.bytedeco.javacpp.opencv_photo.opencv_photo.*;

import static org.bytedeco.javacpp.opencv_videostab.opencv_videostab.*;


/** \addtogroup videostab
 *  \{ */

@Namespace("cv::videostab") @NoOffset @Properties(inherit = org.bytedeco.javacpp.opencv_videostab.opencv_videostab_presets.class)
public class StabilizerBase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StabilizerBase(Pointer p) { super(p); }


    public native void setLog(@Ptr ILog ilog);
    public native @Ptr ILog log();

    public native void setRadius(int val);
    public native int radius();

    public native void setFrameSource(@Ptr IFrameSource val);
    public native @Ptr IFrameSource frameSource();

    public native void setMotionEstimator(@Ptr ImageMotionEstimatorBase val);
    public native @Ptr ImageMotionEstimatorBase motionEstimator();

    public native void setDeblurer(@Ptr DeblurerBase val);
    public native @Ptr DeblurerBase deblurrer();

    public native void setTrimRatio(float val);
    public native float trimRatio();

    public native void setCorrectionForInclusion(@Cast("bool") boolean val);
    public native @Cast("bool") boolean doCorrectionForInclusion();

    public native void setBorderMode(int val);
    public native int borderMode();

    public native void setInpainter(@Ptr InpainterBase val);
    public native @Ptr InpainterBase inpainter();
}