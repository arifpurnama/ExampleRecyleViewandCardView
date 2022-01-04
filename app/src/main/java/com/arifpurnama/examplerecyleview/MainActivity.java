package com.arifpurnama.examplerecyleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.arifpurnama.examplerecyleview.Adapter.CourseAdapter;
import com.arifpurnama.examplerecyleview.Model.CourseModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView courseRV;

    //Array List for Data
    private ArrayList<CourseModel> courseModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courseRV = findViewById(R.id.idRVCourse);

        // here we have created new array list and added data to it.
        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new CourseModel("DSA in Java", 10, R.drawable.icon));
        courseModelArrayList.add(new CourseModel("Java Course", 3, R.drawable.icon));
        courseModelArrayList.add(new CourseModel("C++ COurse", 4, R.drawable.icon));
        courseModelArrayList.add(new CourseModel("DSA in C++", 4, R.drawable.icon));
        courseModelArrayList.add(new CourseModel("Kotlin for Android", 4, R.drawable.icon));
        courseModelArrayList.add(new CourseModel("Java for Android", 4, R.drawable.icon));
        courseModelArrayList.add(new CourseModel("HTML and CSS", 4, R.drawable.icon));

        // we are initializing our adapter class and passing our arraylist to it.
        CourseAdapter courseAdapter = new CourseAdapter(this, courseModelArrayList);
        //setting layout to horizontal
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }

}