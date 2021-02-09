package com.example.testalarm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Button btn_1 = findViewById(R.id.about_one);
        Button btn_2 = findViewById(R.id.about_two);
        Button btn_3 = findViewById(R.id.about_3);
        Button btn_4 = findViewById(R.id.about_4);
        Button btn_5 = findViewById(R.id.about_5);
        Button btn_6 = findViewById(R.id.about_6);
        Button btn_7 = findViewById(R.id.about_7);
        Button btn_8 = findViewById(R.id.about_8);
        Button btn_9 = findViewById(R.id.about_9);
        Button btn_10 = findViewById(R.id.about_10);
        Button btn_11= findViewById(R.id.about_11);
        Button btn_12= findViewById(R.id.about_12);
        Button btn_13= findViewById(R.id.about_13);


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this, About1.class);
                startActivity(intent);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this, About2.class);
                startActivity(intent);
            }
        });


        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this, About3.class);
                startActivity(intent);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this, About4.class);
                startActivity(intent);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this, About5.class);
                startActivity(intent);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this, About6.class);
                startActivity(intent);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this, About7.class);
                startActivity(intent);
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this, About8.class);
                startActivity(intent);
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this, About9.class);
                startActivity(intent);
            }
        });

        btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this, About10.class);
                startActivity(intent);
            }
        });

        btn_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this, About11.class);
                startActivity(intent);
            }
        });

        btn_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this, About12.class);
                startActivity(intent);
            }
        });

        btn_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this, About13.class);
                startActivity(intent);
            }
        });


    }
}
