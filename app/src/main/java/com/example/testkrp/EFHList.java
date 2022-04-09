package com.example.testkrp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EFHList extends AppCompatActivity {
    private ListView listView;
    private String efhNames[] = {
            "Business Edition",
            "Storytelling Edition",
            "Worship Edition",
            "Prayer Edition",
            "Holy Spirit Edition"
    };

    private Integer imageid[] = {
            R.drawable.business,
            R.drawable.broadview,
            R.drawable.realtionship,
            R.drawable.prayer,
            R.drawable.prayer_pts,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_f_h_list);
        ListView listView=(ListView)findViewById(R.id.efh_list);


        // For populating list data

        com.example.testkrp.CustomSermonAdapter customCountryList = new com.example.testkrp.CustomSermonAdapter(this, efhNames, imageid);
        listView.setAdapter(customCountryList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"You Selected "+efhNames[position-1]+ " as Country",Toast.LENGTH_SHORT).show();        }
        });
    }
}