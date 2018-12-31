package com.example.ys020.listviewclickevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MyList extends AppCompatActivity implements View.OnClickListener {
    private ArrayList<MyItem> data = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_my_list);

        ListView listview = findViewById(R.id.my_listview);

        data = new ArrayList<>();

        MyItem item1 = new MyItem(R.drawable.potatochip, "감자알칩 500원 영양제과(주)", "★★★★★");
        MyItem item2 = new MyItem(R.drawable.picnic_apple, "피크닉 사과 500원 매일유업", "★★★★");

        data.add(item1);
        data.add(item2);

        Adapter adapter = new Adapter(this, R.layout.activity_my_item, data);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View v, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), WhenClicked.class);

                intent.putExtra("profile", Integer.toString(data.get(position).getProfile()));
                intent.putExtra("info", data.get(position).getInfo());
                intent.putExtra("star", data.get(position).getStar());
                startActivity(intent);

            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}

