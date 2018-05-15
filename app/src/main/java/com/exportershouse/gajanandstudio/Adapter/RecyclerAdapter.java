package com.exportershouse.gajanandstudio.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.exportershouse.gajanandstudio.R;

/**
 * Created by Juned on 2/8/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {



    private String[] titles = {
            "Pre Wedding",
            "Photos",
            "Videos",
            "Holiday"};

//    private String[] details = {"Item one details",
//            "Item two details", "Item three details",
//            "Item four details", "Item file details",
//            "Item six details", "Item seven details",
//            "Item eight details"};

        private  int[] images = { R.drawable.c1,
                                R.drawable.c2,
                                R.drawable.c3,R.drawable.c4};

    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
//        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);

//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override public void onClick(View v) {
//                    int position = getAdapterPosition();
//
//                    Snackbar.make(v, "Click detected on item " + position,
//                            Snackbar.LENGTH_LONG)
//                            .setAction("Action", null).show();
//
//                }
//            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.category_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
//        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }




}