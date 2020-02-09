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
        categories.add(new Category("General Knowledge", 9, R.drawable.ic_general_knowledge_black_40dp));
        categories.add(new Category ("Entertainment: Books", 10, R.drawable.ic_books_black_40dp));
        categories.add(new Category ("Entertainment: Film", 11, R.drawable.ic_film_black_40dp));
        categories.add(new Category ("Entertainment: Music", 12, R.drawable.ic_music_black_40dp));
        categories.add(new Category ("Entertainment: Musicals & Theatres", 13, R.drawable.ic_musicals_black_40dp));
        categories.add(new Category ("Entertainment: Television", 14, R.drawable.ic_television_black_40dp));
        categories.add(new Category ("Entertainment: Video Games", 15, R.drawable.ic_videogame_black_40dp));
        categories.add(new Category ("Entertainment: Board Games", 16, R.drawable.ic_board_games_black_40dp));
        categories.add(new Category ("Entertainment: Comics", 29, R.drawable.ic_comics_black_40dp));
        categories.add(new Category ("Entertainment: Japanese Anime & Manga", 31, R.drawable.ic_manga_black_40dp));
        categories.add(new Category ("Entertainment: Cartoon & Animations", 32, R.drawable.ic_cartoons_black_40dp));
        categories.add(new Category ("Science & Nature", 17, R.drawable.ic_science_black_40dp));
        categories.add(new Category ("Science: Computers", 18, R.drawable.ic_computers_black_40dp));
        categories.add(new Category ("Science: Mathematics", 19, R.drawable.ic_mathematics_black_40dp));
        categories.add(new Category ("Science: Gadgets", 30, R.drawable.ic_gadgets_black_40dp));
        categories.add(new Category ("Mythology", 20, R.drawable.ic_myrhology_black_40dp));
        categories.add(new Category ("Sports", 21, R.drawable.ic_sports_black_40dp));
        categories.add(new Category ("Geography", 22, R.drawable.ic_geography_black_40dp));
        categories.add(new Category ("History", 23, R.drawable.ic_history_black_40dp));
        categories.add(new Category ("Politics", 24, R.drawable.ic_politics_black_40dp));
        categories.add(new Category ("Art", 25, R.drawable.ic_art_black_40dp));
        categories.add(new Category ("Celebrities", 26, R.drawable.ic_celebrity_black_40dp));
        categories.add(new Category ("Animals", 27, R.drawable.ic_animals_black_40dp));
        categories.add(new Category ("Vehicles", 28, R.drawable.ic_vehicles_black_40dp));

        ArrayAdapter<Category> categoriesAdapter = new CategoryAdapter(this, categories);

        ListView listView = (ListView) findViewById(R.id.categories_list);
        listView.setAdapter(categoriesAdapter);
    }
}
