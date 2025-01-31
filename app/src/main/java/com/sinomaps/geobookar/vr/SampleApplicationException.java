package com.sinomaps.geobookar.vr;

/* renamed from: com.sinomaps.geobookar.vr.SampleApplicationException */
public class SampleApplicationException extends Exception {
    public static final int ACTIVATE_FLASH_FAILURE = 8;
    public static final int CAMERA_INITIALIZATION_FAILURE = 6;
    public static final int INITIALIZATION_FAILURE = 0;
    public static final int LOADING_TRACKERS_FAILURE = 3;
    public static final int SET_FOCUS_MODE_FAILURE = 7;
    public static final int TRACKERS_DEINITIALIZATION_FAILURE = 5;
    public static final int TRACKERS_INITIALIZATION_FAILURE = 2;
    public static final int UNLOADING_TRACKERS_FAILURE = 4;
    public static final int VUFORIA_ALREADY_INITIALIZATED = 1;
    private static final long serialVersionUID = 2;
    private int mCode = -1;
    private String mString = "";

    public SampleApplicationException(int code, String description) {
        super(description);
        this.mCode = code;
        this.mString = description;
    }

    public int getCode() {
        return this.mCode;
    }

    public String getString() {
        return this.mString;
    }
}
