package com.codepath.twitterhomescreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void onLogin(View v) {
        Toast.makeText(getApplicationContext(), "Logging you in", Toast.LENGTH_SHORT).show();
    }

    public void onForgot(View v) {
        Toast.makeText(getApplicationContext(), "Your temporary password has been e-mailed",
                Toast.LENGTH_SHORT).show();
    }
}
