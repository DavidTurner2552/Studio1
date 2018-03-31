package com.example.david.assignment;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LocationActivity extends AppCompatActivity implements View.OnClickListener{
    public Button locate;
    public EditText locationText;
    public Button about;
    public Button directions;
    public Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        locate = (Button) findViewById(R.id.locate_button);
        locate.setOnClickListener(this);
        locationText = (EditText) findViewById(R.id.search_map);
        about = (Button) findViewById(R.id.about_button);
        about.setOnClickListener(this);
        home = (Button) findViewById(R.id.home_button);
        home.setOnClickListener(this);
        directions = (Button) findViewById(R.id.quiz_button);
        directions.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.locate_button) {
            String address = locationText.getText().toString();
            try
            {
                address = "geo:0,0?q=" + address;
                Uri geo = Uri.parse(address);
                Intent i = new Intent(Intent.ACTION_VIEW, geo);
                startActivity(i);
            }
            catch(Exception e)
            {
// if there is no application that can handle geo-format URIs
                // get the error message, inform the user and try and recover
                String errorMessage = e.getMessage();
            }
        }
        else if (v.getId() == R.id.about_button) {
            Intent i = new Intent(this, AboutActivity.class);
            startActivity(i);
    }   else if (v.getId() == R.id.quiz_button) {
            Intent i = new Intent(this, DirectionsActivity.class);
            startActivity(i);
    }   else if (v.getId() == R.id.home_button) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
    }
    }

}
