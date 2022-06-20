package com.example.multiscreenexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registration_page extends AppCompatActivity {
    EditText Name,address,phone,username,password;
    Button sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);
        Intent intent = getIntent();
        dbestate de = new dbestate(registration_page.this);
//        de.estate("khushi","ulhasnagar", "987764", "khushi06", "khushib");

        username = findViewById(R.id.username);
        Name = findViewById(R.id.Name);
        address = findViewById(R.id.address);
        password = findViewById(R.id.password);
        phone = findViewById(R.id.phone);
        sign=findViewById(R.id.sign);
        sign.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View view) {
                                        String name = Name.getText().toString();
                                        String usernameTXT = username.getText().toString();
                                        String passwordTXT = password.getText().toString();
                                        String phoneTXT = phone.getText().toString();
                                        String addressTXT = address.getText().toString();
                                        Log.d("khushi",name);
                                        Log.d("khushi",usernameTXT);
                                        Log.d("khushi",passwordTXT);
                                        Log.d("khushi",phoneTXT);
                                        Log.d("khushi",addressTXT);

                                        dbestate db=new dbestate(registration_page.this);
                                        Boolean checkinsertdata = db.estate(name, addressTXT, phoneTXT, usernameTXT, passwordTXT);
                                        if (checkinsertdata)
                                            Toast.makeText(registration_page.this, "Registration successful", Toast.LENGTH_SHORT).show();
                                        else
                                            Toast.makeText(registration_page.this, "user cannot be registered", Toast.LENGTH_SHORT).show();


                                    }
                                });



    }


}