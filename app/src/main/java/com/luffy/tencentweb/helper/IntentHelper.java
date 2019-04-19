package com.luffy.tencentweb.helper;

import android.content.Context;
import android.content.Intent;

import com.luffy.tencentweb.ui.WebActivity;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by lvlufei on 2019/4/19.
 */

public class IntentHelper {
    public static void gotoWebActivity(Context context, Map<String, Object> parameter) {
        Intent intent = new Intent(context, WebActivity.class);
        intent.putExtra("parameter", (Serializable) parameter);
        context.startActivity(intent);
    }
}
