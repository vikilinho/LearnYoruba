package com.example.easyyoruba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       TextView txtView = findViewById(R.id.txt_color);
        TextView txtView2 = findViewById(R.id.txt_phrases);
       TextView  txtView3 =findViewById(R.id.txt_number);
       TextView txtView4 = findViewById(R.id.txt_family);

        txtView.setOnClickListener(this);
        txtView2.setOnClickListener(this);
        txtView3.setOnClickListener(this);
        txtView4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txt_family:
                Intent i = new Intent(this, FamilyActivity.class);
                startActivity(i);
                break;
            case R.id.txt_color:
                Intent y = new Intent(this, ColourActivty.class);
                startActivity(y);
                break;
            case R.id.txt_number:
                Intent x = new Intent(this, NumberActivity.class);
                startActivity(x);
                break;
            case R.id.txt_phrases:
                Intent p = new Intent(this, PhraseActivity.class);
                startActivity(p);
                break;

        }


    }
}
