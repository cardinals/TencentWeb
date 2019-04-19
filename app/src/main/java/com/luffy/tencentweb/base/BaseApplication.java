package com.luffy.tencentweb.base;

import android.app.Application;

import com.tencent.smtt.sdk.QbSdk;

/**
 * Created by lvlufei on 2019/4/19.
 */

public class BaseApplication extends Application {

    public void onCreate() {
        super.onCreate();
        /*初始化腾讯webview*/
        initX5Webview();
    }

    private void initX5Webview() {
        QbSdk.PreInitCallback cb = new QbSdk.PreInitCallback() {
            @Override
            public void onViewInitFinished(boolean arg0) {
                //x5內核初始化完成的回调，为true表示x5内核加载成功，否则表示x5内核加载失败，会自动切换到系统内核。
            }

            @Override
            public void onCoreInitFinished() {
            }
        };
        //x5内核初始化接口
        QbSdk.initX5Environment(getApplicationContext(), cb);
    }

}
