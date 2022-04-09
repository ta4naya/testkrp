package com.example.testkrp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Monlist extends AppCompatActivity {
    private ListView listView;
    private String MonNames[] = {
            "Monday Dews",

    };
    private Integer imageid[] = {
            R.drawable.monday,

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday_list);
        ListView listView=(ListView)findViewById(R.id.mon_list);
        com.example.testkrp.CustomSermonAdapter customCountryList = new com.example.testkrp.CustomSermonAdapter(this, MonNames, imageid);
        listView.setAdapter(customCountryList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"You Selected "+MonNames[position-1]+ " as Country",Toast.LENGTH_SHORT).show();        }
        });
    }
}