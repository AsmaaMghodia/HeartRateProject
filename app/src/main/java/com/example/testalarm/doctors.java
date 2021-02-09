package com.example.testalarm;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class doctors extends AppCompatActivity {


    // Array of strings...
    ListView doclist;
    Toolbar toolbar_tips;
    String countryList[] = {"Dr: Mohamed Ali", "Dr: Ahmed lotfi", "Dr: Eman Zahran", "Dr: Nada", "Dr: Fouad", "Dr: Mahmmoud"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);

        doclist = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview_doctors,
                R.id.textView, countryList);
        doclist.setAdapter(arrayAdapter);
    }
}
