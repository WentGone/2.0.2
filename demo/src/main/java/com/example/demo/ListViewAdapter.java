package com.example.demo;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/7/10 0010.
 */
public abstract class ListViewAdapter<T> extends BaseAdapter{
    private static final String TAG = "ListViewAdapter";
    List<T> list;
    Context context;
    int count;

    public ListViewAdapter(List<T> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public abstract int[] indexCount();

    @Override
    public int getCount() {
        /*for (int i = 0;i<list.size()+indexCount().length+1;i++){
            getItem(i);
        }*/
        return list.size()+indexCount().length+1;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    // 告知每一个索引当前条目类型
    @Override
    public int getItemViewType(int position) {
        for (int m = 0;m<indexCount().length;m++){
            if (position == 0||position == indexCount()[m]+(m+1)*1){
                Log.d(TAG, "getItemViewType:");
                // 标题的状态码
                return 0;
            }
            else {
                // 正常条目态码
                return 1;
            }
        }
        return 0;
    }


    @Override
    public Object getItem(int i) {
        int[] mm = new int[]{4,7,9};
        for (int m = 0;m<indexCount().length;m++){
//        for (int m = 0;m<mm.length;m++){
            if (i == 0||i == indexCount()[m]+(m+1)*1){
                Log.d(TAG, "getItem: i == "+i);
                return null;
            }else {
                if (i>=1||i<indexCount()[0]+1){
                    return list.get(i-(m*1)+1);
                }else if (i>indexCount()[m]+(m+1)*1&&i>indexCount()[m+1]+(m+2)*1&&i<indexCount()[indexCount().length-1]+indexCount().length){
                    return list.get(i-m+1);
                }
            }
        }
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
