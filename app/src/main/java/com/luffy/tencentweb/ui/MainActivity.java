package com.luffy.tencentweb.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.luffy.tencentweb.R;
import com.luffy.tencentweb.helper.IntentHelper;
import com.luffy.tencentweb.helper.WebConstantManager;

import java.util.HashMap;
import java.util.Map;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_open_gif, R.id.btn_open_pdf, R.id.btn_open_png, R.id.btn_open_word, R.id.btn_open_xlse,R.id.btn_open_html})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_open_gif:
                Map<String, Object> map_gif = new HashMap<>();
                map_gif.put("url", WebConstantManager.url_gif);
                IntentHelper.gotoWebActivity(MainActivity.this, map_gif);
                break;
            case R.id.btn_open_pdf:
                Map<String, Object> map_pdf = new HashMap<>();
                map_pdf.put("url", WebConstantManager.url_pdf);
                IntentHelper.gotoWebActivity(MainActivity.this, map_pdf);
                break;
            case R.id.btn_open_png:
                Map<String, Object> map_png = new HashMap<>();
                map_png.put("url", WebConstantManager.url_png);
                IntentHelper.gotoWebActivity(MainActivity.this, map_png);
                break;
            case R.id.btn_open_word:
                Map<String, Object> map_word = new HashMap<>();
                map_word.put("url", WebConstantManager.url_word);
                IntentHelper.gotoWebActivity(MainActivity.this, map_word);
                break;
            case R.id.btn_open_xlse:
                Map<String, Object> map_xlse = new HashMap<>();
                map_xlse.put("url", WebConstantManager.url_xlse);
                IntentHelper.gotoWebActivity(MainActivity.this, map_xlse);
                break;
            case R.id.btn_open_html:
                Map<String, Object> map_html = new HashMap<>();
                map_html.put("url", WebConstantManager.url_html);
                IntentHelper.gotoWebActivity(MainActivity.this, map_html);
                break;
        }
    }
}
