package com.dicoding.picodiploma.dailydoseoffood;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListFoodAdapter extends RecyclerView.Adapter<ListFoodAdapter.ListFoodHolder> {
    private ArrayList<Food> listFood;

    public ListFoodAdapter(ArrayList<Food> list) {
        this.listFood = list;
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListFoodHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_food, viewGroup, false);
        return new ListFoodHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final ListFoodHolder holder, int position) {
        Food food = listFood.get(position);
        Glide.with(holder.itemView.getContext())
                .load(food.getPhoto())
                .apply(new RequestOptions().override(181, 131))
                .into(holder.foodView);
        holder.foodName.setText(food.getName());
        holder.foodDesc.setText(food.getDesc());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listFood.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }

    public class ListFoodHolder extends RecyclerView.ViewHolder {
        ImageView foodView;
        TextView foodName,foodDesc;

        public ListFoodHolder(@NonNull View itemView) {
            super(itemView);
            foodView = itemView.findViewById(R.id.img_photo);
            foodName = itemView.findViewById(R.id.name_food);
            foodDesc = itemView.findViewById(R.id.desc_food);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Food data);
    }
}
