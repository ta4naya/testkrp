package com.example.testkrp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FaithCliniclist extends AppCompatActivity {
    private ListView listView;
    private String FaithNames[] = {
            " Faith Clinic",
            "Testimony Service"

    };
    private Integer imageid[] = {
            R.drawable.fclinic,
            R.drawable.testimony

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faithclinic_list);
        ListView listView=(ListView)findViewById(R.id.faithclinic_list);
        com.example.testkrp.CustomSermonAdapter customCountryList = new com.example.testkrp.CustomSermonAdapter(this, FaithNames, imageid);
        listView.setAdapter(customCountryList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"You Selected "+FaithNames[position-1]+ " as Country",Toast.LENGTH_SHORT).show();        }
        });
    }
}