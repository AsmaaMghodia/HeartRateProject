package com.example.testalarm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Editprofile extends AppCompatActivity {
    public static String age="لم يتم ادخاله";
    public static String weight="لم يتم ادخاله";
    public static  String q1_data ="لا يوجد";
    public static String q2_data="لا يوجد";
    public static String q3_data="لا يوجد";
    public static String q4_data="لا يوجد";





    RadioGroup q1;
    RadioGroup q2;
    RadioGroup q3;
    RadioGroup q4;
    RadioGroup q5;
   public  static EditText e1;
    public static EditText e2;
    public static EditText e3;
    public static EditText e4;
    public static EditText e5;
    public static  EditText aget;
    public static    EditText weightt;
    public static Button done;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("أضف معلوماتك");

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

       aget=findViewById(R.id.age);
         weightt =findViewById(R.id.weight);

        q1 = findViewById(R.id.mard);
        q2 =findViewById(R.id.amlyat);
        q3 =findViewById(R.id.sens);
        q4 =findViewById(R.id.takedialy);
        Button done= (Button) findViewById(R.id.done);
         e1 = findViewById(R.id.e1);
         e2 =findViewById(R.id.e2);
         e3 =findViewById(R.id.e3);
         e4=findViewById(R.id.e4);
        // get selected radio button from radioGroup
        int selectedId = q1.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        RadioButton radioSelectq1 = (RadioButton) findViewById(selectedId);

        q1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId ==R.id.yes1 ){
                    e1.setVisibility(View.VISIBLE);
                q1_data=  e1.getText().toString();


                }
                if(checkedId ==R.id.no1 ){
                    e1.setVisibility(View.INVISIBLE);
                    q1_data= "لا يوجد";



                }
            }
       });


        q2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId ==R.id.yes2 ){
                    e2.setVisibility(View.VISIBLE);
                    q2_data=  e2.getText().toString();



                }
                if(checkedId ==R.id.no2 ){
                    e2.setVisibility(View.INVISIBLE);


                }
            }
        });

        q3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId ==R.id.yes3 ){
                    e3.setVisibility(View.VISIBLE);
                    q3_data=  e3.getText().toString();



                }
                if(checkedId ==R.id.no3 ){
                    e3.setVisibility(View.INVISIBLE);



                }
            }
        });

        q4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId ==R.id.yes4 ){
                    e4.setVisibility(View.VISIBLE);
                    q4_data=  e4.getText().toString();


                }
                if(checkedId ==R.id.no4 ){
                    e4.setVisibility(View.INVISIBLE);


                }
            }
        });

//        data[4]=age;
  //      data[5]=weight;

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data_fun();

                Intent intent = new Intent(Editprofile.this,MainActivity.class);
                startActivity(intent);


                }


            });
        }




    public  static void data_fun(){
        age= aget.getText().toString();
        weight = weightt.getText().toString();
        q1_data=  e1.getText().toString();
        q2_data=  e2.getText().toString();
        q3_data=  e3.getText().toString();
        q4_data=  e4.getText().toString();

    }

}
