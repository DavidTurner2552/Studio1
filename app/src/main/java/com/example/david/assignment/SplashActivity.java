package com.example.david.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler splashHandler = new Handler();
        splashHandler.postDelayed(this,4000);
    }
    @Override
    public void run()
    {
        Intent intent = new Intent( SplashActivity.this, MainActivity.class );
        SplashActivity.this.startActivity( intent );
        finish();
    }

}
