package com.example.david.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Quiz3Activity extends AppCompatActivity implements View.OnClickListener {
    private Button submit_button;
    private Button directions_button;
    private Button about_button;
    private Button home;
    private RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        submit_button = (Button) findViewById(R.id.submit_button);
        submit_button.setOnClickListener(this);
        directions_button = (Button) findViewById(R.id.directions_button);
        directions_button.setOnClickListener(this);
        about_button = (Button) findViewById(R.id.about_button);
        about_button.setOnClickListener(this);
        home = (Button) findViewById(R.id.home_button);
        home.setOnClickListener(this);
        group = (RadioGroup)findViewById(R.id.button_group);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.submit_button) {
            int number = group.getCheckedRadioButtonId();
            if (number == -1)
            {
                Toast.makeText(this, "No answer given", Toast.LENGTH_LONG).show();
            }
            else if (number == R.id.button_3)
            {
                Toast.makeText(this, "Correct Answer", Toast.LENGTH_LONG).show();
                Toast.makeText(this, "Answers have been submitted", Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(this, "Incorrect Answer", Toast.LENGTH_LONG).show();
                Toast.makeText(this, "Answers have been submitted", Toast.LENGTH_LONG).show();
            }
        }
        else if (v.getId() == R.id.directions_button){
            Intent i = new Intent(this, LocationActivity.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.about_button){
            Intent i = new Intent(this, AboutActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.home_button) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        else {
            //Do Nothing.
        }
    }
}
