package com.example.triviacategorylister;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<Category> {

    public CategoryAdapter(Context context, ArrayList<Category> categories) {
        super(context, 0, categories);
    }

    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.category_item_view, parent, false);
        }

        Category currentCategory = getItem(position);

        ImageView categoryImageView = (ImageView) listItemView.findViewById(R.id.category_image);
        categoryImageView.setImageResource(currentCategory.getmImageResourceId());

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.category_name);
        nameTextView.setText(currentCategory.getmCategoryName());

        return listItemView;
    }
}
