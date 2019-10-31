package com.example.easyyoruba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Good Morning", "Kaaro"));
        words.add(new Word("Good Afternoon", "Kaasan"));
        words.add(new Word("How are you", "Bawo ni?"));
        words.add(new Word("Hope you are good", "Ṣe daadaa ni o wa?"));
        words.add(new Word("I am fine, what about you?", "Daadaa ni mo wa, iwo nko?"));
        words.add(new Word("Are you coming?", "Se o maa wa"));
        words.add(new Word("Will you go?", "Se o maa lo?"));
        words.add(new Word("I like your cloth", "Moferan aso e"));
        words.add(new Word("what is your name", "Ki ni oruko e?"));
        words.add(new Word("Have a nice day", "ki Oni ko dara fun o"));
        words.add(new Word("Do you understand", "Se o ye e?"));
        words.add(new Word("I understand", "O ye mi yeke!"));
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
