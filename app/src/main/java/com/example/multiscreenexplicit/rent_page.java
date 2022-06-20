package com.example.multiscreenexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class rent_page extends AppCompatActivity {

    Spinner spinner;
    Button search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_page);
        Intent intent = getIntent();
        spinner = (Spinner) findViewById(R.id.spinner);
        search= findViewById(R.id.backd);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String text = spinner.getSelectedItem().toString();
                Log.d("khushi", text);


                switch (text) {
                    case "Dadar":
                        Intent intent = new Intent(rent_page.this, dadar.class);
                        startActivity(intent);
                        break;

                    case "Mumbai":
                        Intent intent2 = new Intent(rent_page.this, Mumbai.class);
                        startActivity(intent2);
                        break;

                    case "Navi Mumbai":
                        Intent intent3 = new Intent(rent_page.this, Navi_Mumbai.class);
                        startActivity(intent3);
                        break;

                    case "Andheri":
                        Intent intent4 = new Intent(rent_page.this, Andheri.class);
                        startActivity(intent4);
                        break;

                    case "Bandra":
                        Intent intent5 = new Intent(rent_page.this, Bandra.class);
                        startActivity(intent5);
                        break;

                    case "Malad":
                        Intent intent6 = new Intent(rent_page.this, Malad.class);
                        startActivity(intent6);
                        break;

                }

            }
        });


        Spinner grade1 = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> grade = ArrayAdapter.createFromResource(this, R.array.cities, android.R.layout.simple_spinner_item);

        grade.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        grade1.setAdapter(grade);
        String text = spinner.getSelectedItem().toString();
        Log.d("khushi",text);

//        public void onItemSelected(AdapterView<?> parent, View view, int pos,long id) {
//
//            switch(pos)
//            {
//                case 0:
//                    Intent i=new Intent(rent_page.this,dadar.class);
//                    startActivity(i);
//                    break;
//                case 1:
//                    Intent i=new Intent(CurrentActivity.this,Myclass2.class);
//                    startActivity(i);
//            }
//
//        }

    }
}