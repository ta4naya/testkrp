package com.example.testkrp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class SermonImageAdapter extends RecyclerView.Adapter<SermonImageAdapter.ViewHolder> {

    private String[] captions;
    private String[] captions_name;

    private int[] imageIds;

    private Listener listener;
    interface Listener {
        void onClick(int position);
    }
    public SermonImageAdapter(String[] captions,  String[] captions_name, int[] imageIds){
        this.captions = captions;
        this.imageIds = imageIds;
        this.captions_name = captions_name;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_captioned_image, parent, false);
        return new ViewHolder(cv);
    }
    public void setListener(Listener listener){
        this.listener = listener;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView)cardView.findViewById(R.id.info_image);
        Drawable drawable =
                ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(captions[position]);
        TextView textView = (TextView)cardView.findViewById(R.id.info_sermon);
        textView.setText(captions[position]);
        TextView textView1 = (TextView)cardView.findViewById(R.id.info_sermon_days);
        textView1.setText(captions_name[position]);
        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int sermontype = position;
                switch (sermontype) {
                    case 0:
                        Intent intent = new Intent(cardView.getContext(), SermonList.class);
                        cardView.getContext().startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(cardView.getContext(), EFHList.class);
                        cardView.getContext().startActivity(intent1);
                        break;
                    case 2:
                        Intent dDeep = new Intent(cardView.getContext(), DDlist.class);
                        cardView.getContext().startActivity(dDeep);
                        break;
                    case 3:
                        Intent dFClinic = new Intent(cardView.getContext(), com.example.testkrp.FaithCliniclist.class);
                        cardView.getContext().startActivity(dFClinic);
                        break;
                    case 4:
                        listener.onClick(4);
                        Intent dFriday = new Intent(cardView.getContext(), com.example.testkrp.FridayList.class);
                        cardView.getContext().startActivity(dFriday);
                        break;
                    case 5:
                        listener.onClick(5);
                        break;
                    case 6:
                        Intent mon = new Intent(cardView.getContext(), com.example.testkrp.Monlist.class);
                        cardView.getContext().startActivity(mon);
                        break;
                    case 7:
                        listener.onClick(6);
                        break;
                    case 8:
                        listener.onClick(6);
                        break;



                }

            }
          /* @Override
            public void onClick(View v) {

                Intent intent = new Intent(cardView.getContext(), com.example.testkrp.SermonList.class);
                cardView.getContext().startActivity(intent);
            } */
        });
    }


    @Override
    public int getItemCount() {
        return captions.length;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        //Define the view to be used for each data item
        private CardView cardView;
        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }
}
