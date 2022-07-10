package com.vxot.learning.listView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.vxot.learning.R;

import java.util.List;

public class ListView2Activity extends AppCompatActivity {
    private static final String TAG = "ListView2Activity";
    private  ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);
        Log.d(TAG, "onCreate===>onCreate33" );
        init();
    }

    private void init(){
        //第二步：绑定控件
        listView = findViewById(R.id.list_view2);
        //第三步：准备数据
        List<Fruit> fruitList = Fruit.getFruitList();
        //第四步：设计每一个列表项的子布局
        //第五步：定义适配器 控件 -桥梁-数据
        FruitArrayAdapter adapter=new FruitArrayAdapter(    this,R.layout.fruit_item,fruitList);
        listView.setAdapter(adapter);
    }


//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//        @Override
//            Fruit fruit= fruitlist.get(position) ;
//            Toast.makeText(MainActivity.this,"您选择的水果是："+fruit.getName(),Toast.LENGTH_LONG).show();
//        }
//    });
}

