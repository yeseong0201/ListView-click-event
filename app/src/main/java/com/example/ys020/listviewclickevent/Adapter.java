package com.example.ys020.listviewclickevent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<MyItem> data;
    private  int layout;

    public Adapter(Context context, int layout, ArrayList<MyItem> data){
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data = data;
        this.layout = layout;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public String getItem(int position) {
        return data.get(position).getInfo();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = inflater.inflate(layout,parent,false);
        }
        MyItem myItem = data.get(position);

        ImageView profile =  convertView.findViewById(R.id.profile);
        profile.setImageResource(myItem.getProfile());

        TextView info = (TextView) convertView.findViewById(R.id.info);
        info.setText(myItem.getInfo());

        TextView star = (TextView) convertView.findViewById(R.id.star);
        star.setText(myItem.getStar());

        return convertView;
    }
}
