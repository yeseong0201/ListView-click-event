package com.example.ys020.listviewclickevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class WhenClicked extends AppCompatActivity {
private  int img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_when_clicked);

        Intent intent = getIntent();

        ImageView profile = findViewById(R.id.img_prof);
        TextView info = findViewById(R.id.tv_info);
        TextView star = findViewById(R.id.star);

        img=Integer.parseInt(intent.getStringExtra("profile"));
        profile.setImageResource(img);
        info.setText(intent.getStringExtra("info"));
        star.setText(intent.getStringExtra("star"));
    }
}
