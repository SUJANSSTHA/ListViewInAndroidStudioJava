package com.example.listviewstddetl;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter extends ArrayAdapter<Student> {

    public StudentAdapter(Context context, List<Student> students) {
        super(context, 0, students);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Student student = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Lookup view for data population
        TextView studentId = convertView.findViewById(R.id.student_id);
        TextView studentName = convertView.findViewById(R.id.student_name);
        TextView studentAddress = convertView.findViewById(R.id.student_address);

        // Populate the data into the template view using the data object
        studentId.setText("ID: " + student.getId());
        studentName.setText("Name: " + student.getName());
        studentAddress.setText("Address: " + student.getAddress());

        // Return the completed view to render on screen
        return convertView;
    }
}