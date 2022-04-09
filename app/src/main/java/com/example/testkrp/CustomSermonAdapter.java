package com.example.testkrp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testkrp.R;

public class CustomSermonAdapter extends ArrayAdapter {
    private String[] sermonNames;
    private Integer[] imageid;
    private Activity context;

    public CustomSermonAdapter(Activity context, String[] sermonNames,  Integer[] imageid) {
        super(context, R.layout.row_layout_messages,sermonNames);
        this.context = context;
        this.sermonNames = sermonNames;
        this.imageid = imageid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)
            row = inflater.inflate(R.layout.row_layout_messages, null, true);

        TextView textViewCapital = (TextView) row.findViewById(R.id.textViewSermon);
        ImageView imageFlag = (ImageView) row.findViewById(R.id.imageViewFlag);
        textViewCapital.setText(sermonNames[position]);
        imageFlag.setImageResource(imageid[position]);
        return  row;
    }
}
