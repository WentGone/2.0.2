package com.example.test;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private String url = "http://192.168.0.101:8080/MyServerlet/MyServerlet";
    Button button;
    TextView textView;
    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 0x00){
                String result = (String) msg.obj;
                Log.d(TAG,"Handler msg is "+result);
                textView.setText(result);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.Main_Btn);
        textView = (TextView) findViewById(R.id.Main_TV);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(){
                    @Override
                    public void run() {
                        try {
                            String result = OkHttpClientManager.getAsString(url+"?username=King");
                            Log.d(TAG, "onClick: result is "+result);
                            Message msg = mHandler.obtainMessage();
                            msg.what = 0x00;
                            msg.obj = result;
                            mHandler.sendMessage(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }.start();
            }
        });
    }
}
