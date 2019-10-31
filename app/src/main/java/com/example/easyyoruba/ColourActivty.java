package com.example.easyyoruba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColourActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red", "Pupa"));
        words.add(new Word("Blue", "Buluu"));
        words.add(new Word("Green", "Awo Ewe"));
        words.add(new Word("Yellow", "yelo"));
        words.add(new Word("Black", "Dudu"));
        words.add(new Word("White", "fun fun"));
        words.add(new Word("Brown", "buraun"));
        words.add(new Word("Purple", "popu"));
        words.add(new Word("Pink", "pinki"));



        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
