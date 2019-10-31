package com.example.easyyoruba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //Creating a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Okan", "One"));
        words.add(new Word("Eji", "Two"));
        words.add(new Word("Eta", "Three"));
        words.add(new Word("Erin", "Four"));
        words.add(new Word("Arun", "Five"));
        words.add(new Word("Efa", "Six"));
        words.add(new Word("Eje", "Seven"));
        words.add(new Word("Ejo", "Eight"));
        words.add(new Word("Esan", "Nine"));
        words.add(new Word("Ewa", "Ten"));
        words.add(new Word("Okanla", "Eleven"));
        words.add(new Word("Ejila", "Twelve"));
        words.add(new Word("Etala", "Thirteen"));
        words.add(new Word("Erinla", "Fourteen"));
        words.add(new Word("Erindinlogun", "Fifteen"));
        words.add(new Word("Arundinlogun", "Sixteen"));
        words.add(new Word("Etadinlogun", "Seventeen"));
        words.add(new Word("Ejidinlogun", "Eighteen"));
        words.add(new Word("Okandinlogun", "Nineteen"));
        words.add(new Word("Ogun", "Twenty"));


        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
