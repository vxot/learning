package com.vxot.learning.listView;

import com.vxot.learning.R;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
    private int imageID;
    private String name;
    private String price;
    public int getImageID() {
        return imageID;
    }
    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }
    public Fruit(int imageID, String name, String price) {
        this.imageID = imageID;
        this.name = name;
        this.price = price;
    }

    public static List<Fruit> getFruitList(){
        List<Fruit> fruitList = new ArrayList<>();
        for (int i = 0; i <2 ; i++) {
            Fruit pineapple=new Fruit(R.drawable.pineapple,"菠萝","¥16.9 元/KG");
            fruitList.add(pineapple);
            Fruit mango = new Fruit(R.drawable.mango, "芒果","¥29.9 元/kg");
            fruitList.add(mango);
            Fruit pomegranate = new Fruit(R.drawable.pomegranate, "石榴","¥15元/kg");
            fruitList.add(pomegranate);
            Fruit grape = new Fruit(R.drawable.grape, "葡萄","¥19.9 元/kg");
            fruitList.add(grape);
            Fruit apple = new Fruit(R.drawable.apple, "苹果","¥20 元/kg");
            fruitList.add(apple);
            Fruit orange = new Fruit(R.drawable.orange, "橙子","¥18.8 元/kg");
            fruitList.add(orange);
            Fruit watermelon = new Fruit(R.drawable.watermelon, "西瓜","¥28.8元/kg");
            fruitList.add(watermelon);
        }
        return fruitList;
    }
}
