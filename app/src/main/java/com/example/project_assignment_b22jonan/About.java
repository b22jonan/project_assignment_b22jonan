package com.example.project_assignment_b22jonan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        FloatingActionButton button = findViewById(R.id.returnbutton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // go to about page
                finish();
            }
        });
    }
}
