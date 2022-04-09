package com.example.testkrp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FridayList extends AppCompatActivity {
    private ListView listView;
    private String FriNames[] = {
            "Praise Night",
            "Workers Prayer Meetings",
            "Jacobs Night",
            "Holy Ghost Service"

    };
    private Integer imageid[] = {
            R.drawable.monday,
            R.drawable.monday,
            R.drawable.monday,
            R.drawable.monday,


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friday_list);
        ListView listView=(ListView)findViewById(R.id.friday_list);
        com.example.testkrp.CustomSermonAdapter customCountryList = new com.example.testkrp.CustomSermonAdapter(this, FriNames, imageid);
        listView.setAdapter(customCountryList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"You Selected "+FriNames[position-1]+ " as Country",Toast.LENGTH_SHORT).show();        }
        });
    }
}