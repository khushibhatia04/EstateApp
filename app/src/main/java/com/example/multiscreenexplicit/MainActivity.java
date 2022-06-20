package com.example.multiscreenexplicit;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, pw;
    TextView register;
    Button login;
    public static final String EXTRA_NAME = "com.example.multiscreenexplicit.extra.NAME;";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        register = findViewById(R.id.register);
        pw = findViewById(R.id.Password);
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = name.getText().toString();
                String password = pw.getText().toString();
                dbestate db = new dbestate(MainActivity.this);
                Boolean ans = db.checklogin(username, password);
                Log.d("ans ka ans", "" + ans);
                if (ans) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, registration_page.class);
                startActivity(intent);
            }
        });

    }

}