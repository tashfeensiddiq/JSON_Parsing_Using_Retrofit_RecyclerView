package com.example.dd.retrofit2;

/**
 * Created by dd on 08.05.2017.
 */

public class JSONResponse {
    private AndroidVersion[] android;

    public JSONResponse(AndroidVersion[] android) {
        this.android = android;
    }

    public AndroidVersion[] getAndroid() {
        return android;
    }
}
