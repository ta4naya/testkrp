package com.example.testkrp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Sermons#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Sermons extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Sermons() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Sermons.
     */
    // TODO: Rename and change types and number of parameters
    public static Sermons newInstance(String param1, String param2) {
        Sermons fragment = new Sermons();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView pizzaRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_sermons, container, false);
        String[] sermonNames = new String[Sermon.sermons.length];
        String[] sermonDays = new String[Sermon.sermons.length];
        for (int i = 0; i < sermonNames.length; i++) {
            sermonNames[i] = Sermon.sermons[i].getName();
            sermonDays[i] = Sermon.sermons[i].getDay();

        }
        int[] sermonImages = new int[Sermon.sermons.length];
        for (int i = 0; i < sermonImages.length; i++) {
            sermonImages[i] = Sermon.sermons[i].getImageResourceId();
        }
        SermonImageAdapter adapter = new SermonImageAdapter(sermonNames,sermonDays, sermonImages);
        pizzaRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        pizzaRecycler.setLayoutManager(layoutManager);
        adapter.setListener(new SermonImageAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), SermonList.class);
                intent.putExtra("0", position);
                getActivity().startActivity(intent);
            }
        });
        return pizzaRecycler;
    }
}