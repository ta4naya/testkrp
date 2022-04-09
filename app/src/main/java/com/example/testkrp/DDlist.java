package com.example.testkrp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DDlist extends AppCompatActivity {
    private ListView listView;
    private String DDNames[] = {
            "Sermons",
            "Chit Chat",
            "Q and A"
    };
    private Integer imageid[] = {
            R.drawable.ddeep,
            R.drawable.chitchat,
            R.drawable.qanda,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_dlist);
        ListView listView=(ListView)findViewById(R.id.Dd_list);
        com.example.testkrp.CustomSermonAdapter customCountryList = new com.example.testkrp.CustomSermonAdapter(this, DDNames, imageid);
        listView.setAdapter(customCountryList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"You Selected "+DDNames[position-1]+ " as Country",Toast.LENGTH_SHORT).show();        }
        });
    }
}