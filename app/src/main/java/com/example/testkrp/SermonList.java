package com.example.testkrp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SermonList  extends AppCompatActivity {

    public static final String EXTRA_PIZZA_ID ="sermonId" ;
    private ListView listView;
    private String sermonNames[] = {
            "Business Sunday",
            "Broadview Sunday",
            "Relationship Sunday",
            "Thanksgiving Sunday",
            "Commuinion Sunday",
            "Worship Sunday"
    };

    private Integer imageid[] = {
            R.drawable.business,
            R.drawable.broadview,
            R.drawable.realtionship,
            R.drawable.prayer,
            R.drawable.prayer_pts,
            R.drawable.worker
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sermon_list);
        TextView textView = new TextView(this);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText("List of Sermons");

        ListView listView=(ListView)findViewById(R.id.serom_list);
        listView.addHeaderView(textView);

        // For populating list data

        com.example.testkrp.CustomSermonAdapter customCountryList = new com.example.testkrp.CustomSermonAdapter(this, sermonNames, imageid);
       listView.setAdapter(customCountryList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"You Selected "+sermonNames[position-1]+ " as Country",Toast.LENGTH_SHORT).show();        }
        });
    }
}
