package com.example.administrator.a202;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//import com.yolanda.nohttp.NoHttp;
//import com.yolanda.nohttp.OnResponseListener;
//import com.yolanda.nohttp.Request;
//import com.yolanda.nohttp.RequestMethod;
//import com.yolanda.nohttp.RequestQueue;
//import com.yolanda.nohttp.Response;

public class MainActivity extends BaseActivity {
    TextView textview;
    Button mBtnLove;
    String url = "http://192.168.155.1:8080/MyServerlet/MyServerlet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView) findViewById(R.id.TextView);
        Button btnBase = (Button) findViewById(R.id.ButtonBase);
        Button btnPackage = (Button) findViewById(R.id.ButtonPackage);

      /*  btnBase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RequestQueue queue = NoHttp.newRequestQueue();
                Request<String> request = NoHttp.createStringRequest(url, RequestMethod.POST);
                request.add("username", "WZ");
                queue.add(0X001, request, responseListener);
            }
        });*/

        btnPackage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                httpPackage();
            }
        });

        Button btnCalendar = (Button) findViewById(R.id.ButtonCalendar);
        btnCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initCalendar();
            }
        });
        back();

        mBtnLove = (Button) findViewById(R.id.ButtonLove);
        mBtnLove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,LoveActivity.class));
            }
        });

    }

    private void initCalendar() {

    }

   /* private void httpPackage() {
        Request<String> request = NoHttp.createStringRequest(url);
        request.add("username","King");
        HttpListener<String> httpListener = new HttpListener<String>() {
            @Override
            public void onSuccess(int what, Response<String> response) {
                String request = response.get();
                textview.setText(request);
            }

            @Override
            public void onFailed(int what, String url, Object tag, Exception exception, int responseCode, long networkMillis) {
                textview.setText("Failed");
            }
        };
        CallServer.getInstance().add(this,0x002,request,httpListener,false,true);

    }

    private OnResponseListener<String> responseListener = new OnResponseListener<String>() {
        @Override
        public void onStart(int what) {

        }

        @Override
        public void onSucceed(int what, Response<String> response) {
            if (what == 0x001) {
                String result = response.get();
                textview.setText(result);
            }
        }

        @Override
        public void onFailed(int what, String url, Object tag, Exception exception, int responseCode, long networkMillis) {
            textview.setText("error");
        }

        @Override
        public void onFinish(int what) {
            Toast.makeText(getApplicationContext(), "结束", Toast.LENGTH_SHORT).show();
        }
    };*/

    private void back(){

    }
}
