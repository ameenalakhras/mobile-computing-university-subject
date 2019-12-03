package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Students_list extends AppCompatActivity {


    List<Student> studentsList = new ArrayList<>();
    RecyclerView student_rv;
    StudentAdapter studentsAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list);

        initStudent(); // create group of student

        student_rv= findViewById(R.id.students_rv);
        student_rv.setLayoutManager(new LinearLayoutManager(this));
        studentsAdapter = new StudentAdapter(this ,studentsList );
        student_rv.setAdapter(studentsAdapter);
    }

    private void  initStudent(){
        studentsList . add(new Student("Ameen "));
        studentsList . add(new Student("Mahmoud"));
        studentsList . add(new Student("Ahmed"));
        studentsList . add(new Student("Mohammed"));
        studentsList . add(new Student("Eyad"));
        studentsList . add(new Student("Mousa"));
    }
}
