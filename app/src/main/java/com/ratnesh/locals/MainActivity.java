package com.ratnesh.locals;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    Boolean loginState;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences main = getSharedPreferences("Local_preference", MODE_PRIVATE);

        loginState = main.getBoolean("Login_State", false);

        if (loginState) {
            intent = new Intent(MainActivity.this, HomePage.class);
        } else {
            intent = new Intent(MainActivity.this, Login_Phone.class);
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(intent);

                finish();

            }
        }, 1000);
    }
}
