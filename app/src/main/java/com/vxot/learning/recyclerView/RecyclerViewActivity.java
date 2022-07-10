package com.vxot.learning.recyclerView;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.vxot.learning.R;
import com.vxot.learning.listView.Fruit;

import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    private static final String TAG = "RecyclerViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        List<Fruit> fruitList = Fruit.getFruitList();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_main);
        Log.d(TAG, "recyclerView===>" + recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

//        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fruitList);
        recyclerView.setAdapter(adapter);

    }




}