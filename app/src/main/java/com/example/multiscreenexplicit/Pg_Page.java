package com.example.multiscreenexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Pg_Page extends AppCompatActivity {
    Spinner spinner2;
    Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pg_page);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        Intent intent2 = getIntent();

        Spinner grade1 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> grade = ArrayAdapter.createFromResource(this, R.array.cities, android.R.layout.simple_spinner_item);

        grade.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        grade1.setAdapter(grade);


        search= findViewById(R.id.backd);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String text = spinner2.getSelectedItem().toString();
                Log.d("khushi", text);


                switch (text) {
                    case "Dadar":
                        Intent intent = new Intent(Pg_Page.this, Dadar_Pg.class);
                        startActivity(intent);
                        break;

                    case "Mumbai":
                        Intent intent2 = new Intent(Pg_Page.this, mumbaipg.class);
                        startActivity(intent2);
                        break;

                    case "Navi Mumbai":
                        Intent intent3 = new Intent(Pg_Page.this, Navi_mumbai_Pg.class);
                        startActivity(intent3);
                        break;

                    case "Andheri":
                        Intent intent4 = new Intent(Pg_Page.this, andheripg.class);
                        startActivity(intent4);
                        break;

                    case "Bandra":
                        Intent intent5 = new Intent(Pg_Page.this, bandrapg.class);
                        startActivity(intent5);
                        break;

                    case "Malad":
                        Intent intent6 = new Intent(Pg_Page.this, Mlalad_Pg.class);
                        startActivity(intent6);
                        break;

                }

            }
        });



    }
}