package com.arka.veerabhadraswamymantra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;

public class SplashScreenNew extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable() {
// Using handler with postDelayed called runnable run method
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenNew.this, MainActivity.class);
                startActivity(i);
                // close this activity
                finish();
            }
        }, 2*1000); // wait for 5 seconds
    }
}
