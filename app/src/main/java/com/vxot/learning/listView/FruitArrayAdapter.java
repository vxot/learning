package com.vxot.learning.listView;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.vxot.learning.R;

import java.util.List;

public class FruitArrayAdapter extends ArrayAdapter<Fruit> {
    private static final String TAG = "FruitArrayAdapter";

    public FruitArrayAdapter(@NonNull Context context, int resource, @NonNull List<Fruit> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Fruit fruit = getItem(position);
        View view = null;
        if(convertView==null){
            //为每一个子项加载设定的布局
            view= LayoutInflater.from(getContext()).inflate(R.layout.fruit_item, parent, false);
            //分别获取 image view 和 textview 的实例
            ImageView fruit_image = view.findViewById(R.id.fruit_image);
            TextView fruit_name = view.findViewById(R.id.fruit_name);
            TextView fruit_price= view.findViewById(R.id.fruit_price);
            // 设置要显示的图片和文字
            fruit_image.setImageResource(fruit.getImageID());
            fruit_name.setText(fruit.getName());
            fruit_price.setText(fruit.getPrice());
            Log.d(TAG, "getView===>" + view);
        } else{
            Log.d(TAG, "convertView===>" + convertView);
            view = convertView;
        }

        return view;
    }



    @NonNull
//    @Override
    public View getViewOrign(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit = getItem(position);
        //为每一个子项加载设定的布局
        View view= LayoutInflater.from(getContext()).inflate(R.layout.fruit_item, parent, false);
        //分别获取 image view 和 textview 的实例
        ImageView fruit_image = view.findViewById(R.id.fruit_image);
        TextView fruit_name = view.findViewById(R.id.fruit_name);
        TextView fruit_price= view.findViewById(R.id.fruit_price);
        // 设置要显示的图片和文字
        fruit_image.setImageResource(fruit.getImageID());
        fruit_name.setText(fruit.getName());
        fruit_price.setText(fruit.getPrice());
        Log.d(TAG, "getView===>" + view);
        return view;
    }


    private class ViewHolder {
        ImageView fruitimage;
        TextView fruitname;
        TextView fruitprice;
    }

}


