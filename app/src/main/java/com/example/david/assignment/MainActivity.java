package com.example.david.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button about_button;
    private Button quiz_button;
    private Button directions_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about_button = (Button) findViewById(R.id.about_button);
        about_button.setOnClickListener(this);
        quiz_button = (Button) findViewById(R.id.quiz_button);
        quiz_button.setOnClickListener(this);
        directions_button = (Button) findViewById(R.id.directions_button);
        directions_button.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.about_button) {
            Intent i = new Intent(this, AboutActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.quiz_button) {
            Intent i = new Intent(this, QuizActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.directions_button) {
            Intent i = new Intent(this, LocationActivity.class);
            startActivity(i);
        }
    }
}
