package com.example.triviacategorylister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categories = new ArrayList<>();
        categories.add("General Knowledge");
        categories.add("Entertainment: Books");
        categories.add("Entertainment: Film");
        categories.add("Entertainment: Music");
        categories.add("Entertainment: Musicals & Theatres");
        categories.add("Entertainment: Television");
        categories.add("Entertainment: Video Games");
        categories.add("Entertainment: Board Games");
        categories.add("Entertainment: Comics");
        categories.add("Entertainment: Japanese Anime & Manga");
        categories.add("Entertainment: Cartoon & Animations");
        categories.add("Science & Nature");
        categories.add("Science: Computers");
        categories.add("Science: Mathematics");
        categories.add("Science: Gadgets");
        categories.add("Mythology");
        categories.add("Sports");
        categories.add("Geography");
        categories.add("History");
        categories.add("Politics");
        categories.add("Art");
        categories.add("Celebrities");
        categories.add("Animals");
        categories.add("Vehicles");

    }
}
