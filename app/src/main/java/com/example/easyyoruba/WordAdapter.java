package com.example.easyyoruba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {
    public WordAdapter(Context context, ArrayList<Word> pWords) {
        super(context,0, pWords);
    }
    @Override
    public View getView(int postition, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word my_word = (Word) getItem(postition);
        TextView yorubaTextView = listItemView.findViewById(R.id.yoruba_txt_view);
        yorubaTextView.setText(my_word.getYorubaTranslation());
        TextView defaultTextView = listItemView.findViewById(R.id.default_txt_view);
        defaultTextView.setText(my_word.getDefaultTranslation());
        return  listItemView;


            }
        }
