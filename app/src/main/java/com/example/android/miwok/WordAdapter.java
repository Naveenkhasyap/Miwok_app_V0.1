package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by msi on 1/30/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    @NonNull
    private int colorResourceID;
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_layout, parent, false);
        }

        Word currentWord = getItem(position);

        ImageView im = (ImageView) listItemView.findViewById(R.id.img);

        if(currentWord.hasImage()) {
            im.setImageResource(currentWord.getImageResourceID());
            im.setVisibility(View.VISIBLE);
        }else {
            im.setVisibility(View.GONE);

        }
        TextView first = (TextView) listItemView.findViewById(R.id.main1);

        first.setText(currentWord.getMiwakTranslation());

        TextView second = (TextView) listItemView.findViewById(R.id.main2);

        second.setText(currentWord.getdefaultTranslation());

        View textcontainer = listItemView.findViewById(R.id.text_container);

        int color  = ContextCompat.getColor(getContext(),colorResourceID);

        textcontainer.setBackgroundColor(color);

        return listItemView;
    }

    public WordAdapter(Activity context, ArrayList<Word> words,int color) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        colorResourceID = color;
    }
}
