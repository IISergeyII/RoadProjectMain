package com.s.samsungitschool.roadprojectmain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EntryActivity extends AppCompatActivity {

    EditText loginEt, passwordEt;
    Button loginIn, register;

    private static String login = "";
    private static String password = "";

    // TODO Указать название сервера
    private static String server = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        loginEt = (EditText) findViewById(R.id.login_et);
        passwordEt = (EditText) findViewById(R.id.password_et);
        loginIn = (Button) findViewById(R.id.login_in_bt);
        register = (Button) findViewById(R.id.register_bt);

        loginIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), RegistrationActivity.class);
                startActivityForResult(i, 1);
            }
        });
    }


}
