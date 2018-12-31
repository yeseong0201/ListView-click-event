package com.example.ys020.listviewclickevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MyItem  {
    private  int profile;
    private String info;
    private String star;

    public int getProfile(){
        return profile;
    }

    public String getInfo(){
        return info;
    }
    public String getStar(){
        return star;
    }

    public MyItem(int profile, String info,String star){
        this.profile = profile;
        this.info = info;
        this.star = star;
    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_my_item);
//
//    }
}