package com.example.administrator.a202;

//import com.yolanda.nohttp.NoHttp;
//import com.yolanda.nohttp.Request;
//import com.yolanda.nohttp.RequestQueue;

/**
 * Created by Administrator on 2016/5/25 0025.
 */
public class CallServer {
    private static CallServer callServer;

//    private RequestQueue requestQueue;

    private CallServer() {
//        requestQueue = NoHttp.newRequestQueue();
    }

    public static CallServer getInstance() {
        if (callServer == null) {
            synchronized (CallServer.class) {
                if (callServer == null) {
                    callServer = new CallServer();
                }
            }
        }
        return callServer;
    }

   /* *//**
     * 添加一个请求队列
     * @param context 用于实例化Dialog
     * @param what  用来标志请求，在回调方法中会返回这个what，类似handler的what
     * @param request   请求对象
     * @param callback  结果回调对象
     * @param cancale   是否允许用户取消请求
     * @param isLoading 是否显示dialog
     * @param <T>
     *//*
    public <T> void add(Context context, int what, Request<T> request,HttpListener<T> callback,boolean cancale,boolean isLoading){
        requestQueue.add(what,request,new HttpResponseListener<T>(context,request,callback,cancale,isLoading));
    }

    *//**
     * 取消这个sign标记的所有请求
     *//*
    public void cancelBySign(Object sign) {
        requestQueue.cancelBySign(sign);
    }

    *//**
     * 取消队列中所有请求
     *//*
    public void cancelAll() {
        requestQueue.cancelAll();
    }

    *//**
     * 退出app时停止所有请求
     *//*
    public void stopAll() {
        requestQueue.stop();
    }*/
}
