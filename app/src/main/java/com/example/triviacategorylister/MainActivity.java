package com.example.triviacategorylister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Category> categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categories = new ArrayList<>();
        categories.add(new Category("General Knowledge", 9));
        categories.add(new Category ("Entertainment: Books", 10));
        categories.add(new Category ("Entertainment: Film", 11));
        categories.add(new Category ("Entertainment: Music", 12));
        categories.add(new Category ("Entertainment: Musicals & Theatres", 13));
        categories.add(new Category ("Entertainment: Television", 14));
        categories.add(new Category ("Entertainment: Video Games", 15));
        categories.add(new Category ("Entertainment: Board Games", 16));
        categories.add(new Category ("Entertainment: Comics", 29));
        categories.add(new Category ("Entertainment: Japanese Anime & Manga", 31));
        categories.add(new Category ("Entertainment: Cartoon & Animations", 32));
        categories.add(new Category ("Science & Nature", 17));
        categories.add(new Category ("Science: Computers", 18));
        categories.add(new Category ("Science: Mathematics", 19));
        categories.add(new Category ("Science: Gadgets", 30));
        categories.add(new Category ("Mythology", 20));
        categories.add(new Category ("Sports", 21));
        categories.add(new Category ("Geography", 22));
        categories.add(new Category ("History", 23));
        categories.add(new Category ("Politics", 24));
        categories.add(new Category ("Art", 25));
        categories.add(new Category ("Celebrities", 26));
        categories.add(new Category ("Animals", 27));
        categories.add(new Category ("Vehicles", 28));

        ArrayAdapter<Category> categoriesAdapter = new CategoryAdapter(this, categories);

        ListView listView = (ListView) findViewById(R.id.categories_list);
        listView.setAdapter(categoriesAdapter);
    }
}
