package com.example.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<Student> students;
    ListViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        listView = (ListView) findViewById(R.id.listview);
        MyAdapter adapter = new MyAdapter(students,this);
        listView.setAdapter(adapter);
//        adapter = new ListViewAdapter<Student>(students,this);
    }

    private void initData() {
        students = new ArrayList<Student>();

        students.add(new Student("","",1));
        students.add(new Student("","",1));
        students.add(new Student("","",1));
        students.add(new Student("","",1));
        students.add(new Student("","",2));
        students.add(new Student("","",2));
        students.add(new Student("","",2));
        students.add(new Student("","",3));
        students.add(new Student("","",3));
        students.add(new Student("","",4));
        students.add(new Student("","",4));
        students.add(new Student("","",4));

       /* students.add(new Student("A","一班",1));
        students.add(new Student("B","一班",1));
        students.add(new Student("C","一班",1));
        students.add(new Student("D","一班",1));
        students.add(new Student("E","一班",1));
        students.add(new Student("F","二班",2));
        students.add(new Student("G","二班",2));
        students.add(new Student("H","二班",2));
        students.add(new Student("I","二班",2));
        students.add(new Student("J","二班",2));
        students.add(new Student("K","二班",2));
        students.add(new Student("L","二班",2));
        students.add(new Student("M","二班",2));
        students.add(new Student("N","二班",2));
        students.add(new Student("O","二班",2));
        students.add(new Student("P","三班",3));
        students.add(new Student("R","三班",3));
        students.add(new Student("S","三班",3));
        students.add(new Student("T","三班",3));
        students.add(new Student("U","三班",3));
        students.add(new Student("V","三班",3));
        students.add(new Student("W","三班",3));
        students.add(new Student("X","三班",3));
        students.add(new Student("Y","三班",3));
        students.add(new Student("Z","三班",3));*/
    }
}
