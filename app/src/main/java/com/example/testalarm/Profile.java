package com.example.testalarm;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Profile extends AppCompatActivity {
    String age ="لم يتم ادخاله";
    String weghit = "لم يتم ادخاله";
    String q1_data_p ="لا يوجد";
    String q2_data_p="لا يوجد";
    String q3_data_p="لا يوجد";
    String q4_data_p="لا يوجد";
  Editprofile editprofile =new Editprofile();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_profile);

        Toolbar toolbar = findViewById(R.id.toolbar2);
        toolbar.setTitle("معلوماتك");
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        TextView ageview = findViewById(R.id.age);
        TextView weightview = findViewById(R.id.weighttex);
        TextView q1 = findViewById(R.id.q1);
        TextView q2 = findViewById(R.id.q2);
        TextView q3 = findViewById(R.id.q3);
        TextView q4 = findViewById(R.id.q4);


   // Intent intent = getIntent();
    //age = intent.getStringExtra("age");
    //weghit = intent.getStringExtra("weight");
        age = editprofile.age;
        if(age.isEmpty()){
            ageview.setText(" السن:  " + "لم يتم ادخاله");
        }
        else {ageview.setText(" السن  " + age);}

    weghit = editprofile.weight;
        if(weghit.isEmpty()){
            ageview.setText(" الوزن:  " + "لم يتم ادخاله");
        }
        else {weightview.setText(" الوزن: " + weghit);}

    q1_data_p = editprofile.q1_data;
        if(q1_data_p.isEmpty()){
            q1.setText("لا يوجد");
        }
        else {q1.setText(q1_data_p);}

    q2_data_p = editprofile.q2_data;
        if(q2_data_p.isEmpty()){
            q2.setText("لا يوجد");
        }
        else {q2.setText(q2_data_p);}

    q3_data_p = editprofile.q3_data;
        if(q3_data_p.isEmpty()){
            q3.setText("لا يوجد");
        }
        else {q3.setText(q3_data_p);}

    q4_data_p = editprofile.q4_data;
        if(q4_data_p.isEmpty()){
            q4.setText("لا يوجد");
        }
        else {q4.setText(q4_data_p);}






    }
}
