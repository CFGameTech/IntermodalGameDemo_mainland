package com.cftech.gamesdk.demo;

import android.app.Application;
import android.util.Log;

import com.cftech.gamelibrary.CFGameInitSDKModel;
import com.cftech.gamelibrary.CFGameSDK;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        CFGameInitSDKModel initSDKModel = new CFGameInitSDKModel();
        initSDKModel.application = this;
        initSDKModel.appId = 1013140;
        initSDKModel.appKey = "4c2958117d1ae41831812bf6805c";

        initSDKModel.language = "zh_CN";
        initSDKModel.area = "cn";
        initSDKModel.isGameSoundPlay = true;
        initSDKModel.isProduct = true;

        CFGameSDK.initSDK(initSDKModel, new CFGameSDK.ICFSDKCallback() {
            @Override
            public void onSuccess() {
                Log.i("BaseApplication", "CFGameSDK Init Success.");
            }

            @Override
            public void onError(int i, String s) {
                Log.i("BaseApplication", "CFGameSDK Init fail.");
            }
        });
    }
}
