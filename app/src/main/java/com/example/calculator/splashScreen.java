package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class splashScreen extends AppCompatActivity {
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

        imageView2 = findViewById(R.id.imageView2);

        Thread thread = new Thread(){

            public void run(){
                try {
                    sleep(2000);

                }
                catch (Exception e){
                    e.printStackTrace();

                }
                finally {
                    Intent intent = new Intent(splashScreen.this , MainActivity.class);
                    startActivity(intent);

                }
            }
        };thread.start();
    }
}