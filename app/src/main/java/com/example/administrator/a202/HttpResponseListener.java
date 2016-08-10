package com.example.administrator.a202;

import android.app.Dialog;

//import com.yolanda.nohttp.OnResponseListener;
//import com.yolanda.nohttp.Request;
//import com.yolanda.nohttp.Response;

/**
 * Created by Administrator on 2016/5/25 0025.
// */
//public class HttpResponseListener<T> implements OnResponseListener<T>{
    public class HttpResponseListener<T>{
    /**
     * 显示的Dialog
     */
    private Dialog mDialog;

    /**
     * 当前请求
     */
//    private Request<?> mRequest;

    /**
     * 结果的回调
     */
    private HttpListener<T> callback;

    /**
     * 是否显示Dialog
     */
    private boolean isLoading;

   /* public HttpResponseListener(Context context,Request<?> request,HttpListener<T> httpCallback,boolean canCancle,boolean isLoading){
        this.mRequest = request;
        if (context!=null && isLoading){
            //如果Context不为null且需要显示dialog
            mDialog = new Dialog(context);
        }
        this.callback = httpCallback;
        this.isLoading = isLoading;
    }

    @Override
    public void onStart(int what) {
        if (isLoading && mDialog!=null && !mDialog.isShowing())
            mDialog.show();
    }

    @Override
    public void onSucceed(int what, Response<T> response) {
        if (callback!=null){
            callback.onSuccess(what,response);
        }
    }

    @Override
    public void onFailed(int what, String url, Object tag, Exception exception, int responseCode, long networkMillis) {
        if (callback!=null){
            callback.onFailed(what,url,tag,exception,responseCode,networkMillis);
        }
    }

    @Override
    public void onFinish(int what) {
        if (isLoading && mDialog!=null && mDialog.isShowing())
            mDialog.dismiss();
    }*/
}
