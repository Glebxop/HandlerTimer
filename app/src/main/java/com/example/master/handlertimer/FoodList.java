package com.example.master.handlertimer;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodList extends ListActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView=(ListView) getListView();
        ArrayAdapter<Food> adapter=new ArrayAdapter<Food>(this,R.layout.support_simple_spinner_dropdown_item,Food.food);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intent=new Intent(this,Diskription.class);
        Food food=Food.food[position];
        intent.putExtra("foodname",food.getName());
        intent.putExtra("foodnumber",food.getNumber());
        startActivity(intent);
    }
}
