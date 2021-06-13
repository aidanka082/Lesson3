package com.example.homework3;

import java.util.ArrayList;
import java.util.List;

public class Flag {
    public static List<TaskModel>list = new ArrayList<>();
    public static List<TaskModel> getModel(){
        list.add(new TaskModel("Flag", "Kyrgyzstan", R.drawable.kyrgyz));
        list.add(new TaskModel("Flag", "Kazakhstan", R.drawable.kaz));
        list.add(new TaskModel("Flag", "Russia", R.drawable.rossiya));
        list.add(new TaskModel("Flag", "South Korea", R.drawable.bandera));
        list.add(new TaskModel("Flag", "Ukraine", R.drawable.ukraina));
        list.add(new TaskModel("Flag","Uzbekistan",R.drawable.uzbekistan));
        return list;


    }
}

