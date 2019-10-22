package com.dicoding.picodiploma.dailydoseoffood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Food> list = new ArrayList<>();


    private void showSelectedFood(Food food) {
        Intent intent = new Intent(this,FoodDetail.class);
        intent.putExtra(FoodDetail.EXTRA_NAME,food.getName());
        intent.putExtra(FoodDetail.EXTRA_DESC,food.getDesc());
        intent.putExtra(FoodDetail.EXTRA_PHOTO,food.getPhoto());
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.tv_food);
        recyclerView.setHasFixedSize(true);

        list.addAll(FoodData.getListData());
        showRecyclerList();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.about:
                Intent intent = new Intent(this,AboutMe.class);
                startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(list);
        recyclerView.setAdapter(listFoodAdapter);

        listFoodAdapter.setOnItemClickCallback(new ListFoodAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Food data) {
             showSelectedFood(data);
            }
        });




    }




}
