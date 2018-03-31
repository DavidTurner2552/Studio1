package com.example.david.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener{
    private Button directions_button;
    private Button quiz_button;
    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        directions_button = (Button) findViewById(R.id.directions_button);
        directions_button.setOnClickListener(this);
        quiz_button = (Button) findViewById(R.id.quiz_button);
        quiz_button.setOnClickListener(this);
        home = (Button) findViewById(R.id.home_button);
        home.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.directions_button) {
            Intent i = new Intent(this, LocationActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.quiz_button) {
            Intent i = new Intent(this, QuizActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.home_button) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
