package com.example.demo;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/10 0010.
 */
public class MyAdapter extends ListViewAdapter{
    private static final String TAG = "MyAdapter";
    List<Student> list;
    Context context;

    public MyAdapter(List list, Context context) {
        super(list, context);
        this.list = list;
    }

    @Override
    public int[] indexCount() {
        Log.d(TAG, "indexCount: "+list.size());
        ArrayList<Integer> aa = new ArrayList<Integer>();
        int lastIndexTyoe = list.get(0).getType();
        for (int i = 0;i<list.size();i++){
            if (list.get(i).getType()!=lastIndexTyoe){
                lastIndexTyoe = list.get(i).getType();
                aa.add(i);
            }
        }
        int[] indexCout = new int[aa.size()];
        for (int i = 0;i<aa.size();i++){
            indexCout[i] = aa.get(i);
//            Log.d(TAG, "indexCount: indexCount=="+indexCout[i]);
        }
        return indexCout;
    }


    @Override
    public Object getItem(int i) {
        return super.getItem(i);
    }
}
