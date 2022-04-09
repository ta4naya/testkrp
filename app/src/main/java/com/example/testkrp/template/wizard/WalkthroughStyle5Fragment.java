package com.example.testkrp.template.wizard;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import com.example.testkrp.R;
import com.example.testkrp.BuildConfig;

/**
 * Created by wahyu on 15/11/16.
 */

@SuppressLint("ValidFragment")
public class WalkthroughStyle5Fragment extends Fragment {
    int wizard_page_position;

    public WalkthroughStyle5Fragment(int position) {
        this.wizard_page_position = position;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int layout_id = R.layout.walkthrough5_fragment;
        View view = inflater.inflate(layout_id, container, false);

        String url = "walkthrough/walkthrough_5_960.jpg";

        ImageView img = (ImageView) view.findViewById(R.id.imagePage1);
        loadImageRequest(img, url);

        return view;
    }

    private void loadImageRequest(ImageView img, String url) {
        Glide.with(getActivity())
                .load(url)
                .thumbnail(0.01f)
                .centerCrop()
                .into(img);
    }
}
