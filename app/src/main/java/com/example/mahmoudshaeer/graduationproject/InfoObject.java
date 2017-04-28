package com.example.mahmoudshaeer.graduationproject;

import android.graphics.drawable.Drawable;

/**
 * Created by mahmoud Shaeer on 1/31/2017.
 */

class InfoObject {
    public String appname = "";
    public String pname = "";
    public String versionName = "";
    public int versionCode = 0;
    public Drawable icon;


    public Drawable getIcon() {
        return icon;
    }

    public String getAppname() {
        return appname;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public String getPname() {
        return pname;
    }

    public String getVersionName() {
        return versionName;
    }
}