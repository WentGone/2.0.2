package com.example.administrator.a202;

//import com.yolanda.nohttp.Response;

/**
 * Created by Administrator on 2016/5/25 0025.
 */
public interface HttpListener<T> {
    /**
     * 请求成功
     * @param what
     * @param response
     */
//    void onSuccess(int what, Response<T> response);

    /**
     * 请求失败
     * @param what
     * @param url
     * @param tag
     * @param exception
     * @param responseCode
     * @param networkMillis
     */
    void onFailed(int what, String url, Object tag,Exception exception, int responseCode, long networkMillis);
}
