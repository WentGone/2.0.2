package com.example.administrator.a202;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;

public class LoveActivity extends AppCompatActivity {
    LoveView loveView;
    RelativeLayout root;
    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if (loveView!=null){
                root.removeView(loveView);
                loveView = null;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);
        root = (RelativeLayout) findViewById(R.id.root);


        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loveView = new LoveView(LoveActivity.this);
                root.addView(loveView);
                mHandler.sendEmptyMessageDelayed(0,500);
            }
        });

        TranslateAnimation translateAnimation = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0,
                Animation.RELATIVE_TO_SELF, 0,
                Animation.RELATIVE_TO_SELF, 0,
                Animation.RELATIVE_TO_SELF, 1);
        TranslateAnimation translateAnimation1 = new TranslateAnimation(0,0,0,100);
        if (loveView!=null){
//            loveView.startAnimation(translateAnimation1);
        }



    }
}
