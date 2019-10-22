package com.dicoding.picodiploma.dailydoseoffood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class FoodDetail extends AppCompatActivity {
    public static final String EXTRA_NAME = "name";
    public static final String EXTRA_DESC = "desc";
    public static final String EXTRA_PHOTO = "photo";

    TextView foodName,foodDesc;
    ImageView foodImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        foodName = findViewById(R.id.name_food);
        foodDesc = findViewById(R.id.desc_food);
        foodImg = findViewById(R.id.img_food);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String desc = getIntent().getStringExtra(EXTRA_DESC);
        int img = getIntent().getIntExtra(EXTRA_PHOTO,1);

        foodName.setText(name);
        foodDesc.setText(desc);
        Glide.with(this)
                .load(img)
                .into(foodImg);
    }



}
