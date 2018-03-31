package com.example.david.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Quiz2Activity extends AppCompatActivity implements View.OnClickListener {
    private Button next_button;
    private RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        next_button = (Button) findViewById(R.id.next_button);
        next_button.setOnClickListener(this);
        group = (RadioGroup)findViewById(R.id.button_group);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.next_button) {
            Intent i = new Intent(this, Quiz3Activity.class);
            startActivity(i);
            int number = group.getCheckedRadioButtonId();
            if (number == -1)
            {
                Toast.makeText(this, "No answer given", Toast.LENGTH_LONG).show();
            }
            else if (number == R.id.button_2)
            {
                Toast.makeText(this, "Correct Answer", Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(this, "Incorrect Answer", Toast.LENGTH_LONG).show();
            }
        }
        else {
            //Do Nothing.
        }
    }
}
