package com.vxot.learning.recyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.vxot.learning.R;
import com.vxot.learning.listView.Fruit;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    private List<Fruit> fruitList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        View fruitView;
        ImageView fruit_image;
        TextView fruit_name;
        TextView fruit_price;

        public ViewHolder(View view) {
            super(view);
            fruitView = view;
            fruit_image = view.findViewById(R.id.fruit_image);
            fruit_name = view.findViewById(R.id.fruit_name);
            fruit_price= view.findViewById(R.id.fruit_price);
        }

    }

    public RecyclerViewAdapter(List<Fruit> fruitList) {
        this.fruitList = fruitList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item, parent, false);
        Log.d(TAG, "view===>" + view);
        ViewHolder holder = new ViewHolder(view);
        onClick(holder);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Fruit fruit = fruitList.get(position);
        holder.fruit_image.setImageResource(fruit.getImageID());
        holder.fruit_name.setText(fruit.getName());
        holder.fruit_price.setText(fruit.getPrice());
    }

    @Override
    public int getItemCount() {
        return fruitList.size();
    }


    private void onClick(ViewHolder holder){
        holder.fruitView.setOnClickListener(v -> {
            int position = holder.getAdapterPosition();
            Fruit fruit = fruitList.get(position);
            Toast.makeText(v.getContext(), "you clicked view " + fruit.getName(),
                    Toast.LENGTH_SHORT).show();
        });
        holder.fruit_image.setOnClickListener(v -> {
            int position = holder.getAdapterPosition();
            Fruit fruit = fruitList.get(position);
            Toast.makeText(v.getContext(), "you clicked image " + fruit.getName(),
                    Toast.LENGTH_SHORT).show();
        });
        holder.fruit_name.setOnClickListener(v -> {
            int position = holder.getAdapterPosition();
            Fruit fruit = fruitList.get(position);
            Log.d("1",fruit.getName());
            Toast.makeText(v.getContext(), "you clicked name " + fruit.getName(),
                    Toast.LENGTH_SHORT).show();
        });
    }

}
