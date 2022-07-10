package com.vxot.learning.listView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.vxot.learning.R;

public class ListViewActivity extends AppCompatActivity {

    private  ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        init();
    }

    private void init(){
        //2、绑定控件
        listView=(ListView) findViewById(R.id.list_view);
        //3、准备数据
        String[] data={"菠萝","芒果","石榴","葡萄", "苹果", "橙子", "西瓜","菠萝","芒果","石榴","葡萄", "苹果", "橙子", "西瓜","菠萝","芒果","石榴","葡萄", "苹果", "橙子", "西瓜"};
        //4、创建适配器 连接数据源和控件的桥梁
        //参数 1：当前的上下文环境
        //参数 2：当前列表项所加载的布局文件
        //(android.R.layout.simple_list_item_1)这里的布局文件是Android内置的，里面只有一个textview控件用来显示简单的文本内容
        //参数 3：数据源
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        //5、将适配器加载到控件中
        listView.setAdapter(adapter);
        //6、为列表中选中的项添加单击响应事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

           /* Parent: 指定哪个AdapterView（可能会有多个ListView，区分多个ListView）
            View: 为你点击的Listview的某一项的内容，来源于adapter。如用((TextView)view).getText().toString()，可以取出点击的这一项的内容，转为string 类型。
            Position: 指的是adapter的某一项的位置，如点击了listview第2项，而第2项对应 的是adapter的第2个数值，那此时position的值就为1了。注：这些数值都是从0开 始的。
            Id：id的值为点击了Listview的哪一项对应的数值，点击了listview第2项，那id就等于1。一般和position相同。*/
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String result=((TextView)view).getText().toString();
                Toast.makeText(ListViewActivity.this,"您选择的水果是："+result,Toast.LENGTH_LONG).show();
            }
        });
    }
}