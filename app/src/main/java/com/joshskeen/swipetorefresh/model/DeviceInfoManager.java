package com.joshskeen.swipetorefresh.model;

import android.content.Context;

import com.joshskeen.swipetorefresh.util.TestUtils;

public class DeviceInfoManager {

    private Context mContext;

    public DeviceInfoManager(Context context) {
        mContext = context;
    }

    public String getDeviceId() {
        return TestUtils.getRandomStringOfLength(25);
//        return Settings.Secure.getString(mContext.getContentResolver(), Settings.Secure.ANDROID_ID);
    }

}
