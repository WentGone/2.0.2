package com.went_gone.commentlist;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.linearlistview.LinearListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    LinearListView linearListView;
    List<CommentEntity> commentList;
    MyAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearListView = (LinearListView) findViewById(R.id.LinearListView);
        initData();
        mAdapter = new MyAdapter(commentList);


        linearListView.setDividerDrawable(new ColorDrawable(Color.CYAN));
        linearListView.setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE
                | LinearLayout.SHOW_DIVIDER_BEGINNING);

      /*  horizontal.setDividerDrawable(getResources().getDrawable(R.drawable.divider_vertical_holo_dark));

        horizontal.setDividerThickness(getResources().getDimensionPixelSize(R.dimen.padding_medium));*/
//        linearListView.setDividerThickness(getResources().getDimensionPixelSize(R.dimen.padding_small));


        linearListView.setAdapter(mAdapter);
        linearListView.setOnItemClickListener(new LinearListView.OnItemClickListener() {
            @Override
            public void onItemClick(LinearListView parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"OnItemClick"+position,Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initData() {
        commentList = new ArrayList<>();
        commentList.add(new CommentEntity("怎麼了？","Went",null,false));
        commentList.add(new CommentEntity("沒什麼。","Went_Gone",null,false));
//        commentList.add(new CommentEntity("沒什麼。","Went_Gone","Gone",true));
    }

    class MyAdapter extends BaseAdapter{
        List<CommentEntity> commentList;
        public MyAdapter(List<CommentEntity> commentList) {
            this.commentList = commentList;
        }

        @Override
        public int getCount() {
            return commentList.size();
        }

        @Override
        public CommentEntity getItem(int i) {
            return commentList.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public int getViewTypeCount() {
            return 2;
        }

        @Override
        public int getItemViewType(int position) {
            if (!getItem(position).isComment()){
                return 0;
            }else {
                return 1;
            }
        }

        @Override
        public View getView(final int i, View view, ViewGroup viewGroup) {
            int type = getItemViewType(i);
            View view1 = null;
            switch (type){
                case 0:
                    //未回復的
                    view1 = getLayoutInflater().inflate(R.layout.item_no_reply,viewGroup,false);

                    TextView tvName = (TextView) view1.findViewById(R.id.item_no_reply_name);
                    tvName.setText(getItem(i).getName1());
                    TextView tvContent = (TextView) view1.findViewById(R.id.item_no_reply_content);
                    tvContent.setText(getItem(i).getContent());
                    Log.d(TAG, "getView: "+i+"+height==="+view1.getMeasuredHeight());
                    break;
                case 1:
                    //回復的
                    view1 = getLayoutInflater().inflate(R.layout.item_reply,viewGroup,false);
                    TextView tvName1 = (TextView) view1.findViewById(R.id.item_reply_name1);
                    tvName1.setText(getItem(i).getName1());
                    TextView tvContent1 = (TextView) view1.findViewById(R.id.item_reply_content);
                    tvContent1.setText(getItem(i).getContent());
                    TextView tvName2 = (TextView) view1.findViewById(R.id.item_reply_name2);
                    tvName2.setText(getItem(i).getName2());
                    break;
            }
            view1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(),"Adapter"+i,Toast.LENGTH_SHORT).show();
                }
            });
            return view1;
        }
    }
}
