package com.example.easyyoruba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father", "Baba"));
        words.add(new Word("Mother", "Iya"));
        words.add(new Word("Elder Brother", "Egbon Okunrin"));
        words.add(new Word("Elder Sister", "Egbon Obinrin"));
        words.add(new Word("Younger Brother", "Aburo Okunrin"));
        words.add(new Word("Younger Sister", "Aburo Obinrin"));
        words.add(new Word("Cloth", "Aso"));
        words.add(new Word("Tree", "Igi"));
        words.add(new Word("Shoe", "Bata"));
        words.add(new Word("House", "Ile"));
        words.add(new Word("Hospital", "Ile Iwosan"));
        words.add(new Word("Book", "Iwe"));
        words.add(new Word("Mountain", "Oke"));
        words.add(new Word("Go", "Malo"));
        words.add(new Word("Stop", "Duro"));
        words.add(new Word("Enter", "Wole"));
        words.add(new Word("Welcome", "Kabo"));
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
