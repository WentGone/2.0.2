package com.example.administrator.a202;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.yolanda.nohttp.NoHttp;

/**
 * Created by Administrator on 2016/5/25 0025.
 */
public class BaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NoHttp.init(getApplication());
    }

}
