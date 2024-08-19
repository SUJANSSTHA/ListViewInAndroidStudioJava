package com.example.listviewstddetl;


import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John Doe", "123 Elm Street"));
        students.add(new Student(2, "Jane Smith", "456 Oak Avenue"));
        students.add(new Student(3, "Jim Brown", "789 Maple Drive"));
        students.add(new Student(4, "Jill White", "101 Pine Lane"));
        students.add(new Student(5, "Jack Black", "202 Birch Road"));

        // Create an adapter
        StudentAdapter adapter = new StudentAdapter(this, students);

        // Find the ListView and set the adapter
        ListView listView = findViewById(R.id.student_list_view);
        listView.setAdapter(adapter);
    }
}