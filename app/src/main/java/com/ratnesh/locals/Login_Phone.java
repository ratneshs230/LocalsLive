package com.ratnesh.locals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login_Phone extends AppCompatActivity {
    EditText phn;
    Button next_login;
    String phone;

    String TAG="LoginPhone";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__phone);



        phn = findViewById(R.id.phn);
        next_login = findViewById(R.id.login_next);



        next_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = phn.getText().toString().trim();

                if (number.length() != 10 ) {
                    phn.setError("Valid number is required");
                    phn.requestFocus();
                    return;
                }

                String phonenumber = "+" + "91" + number;

                Intent intent = new Intent(Login_Phone.this, OtpActivity.class);
                intent.putExtra("phonenumber", phonenumber);
                startActivity(intent);

            }
        });
    }


}


