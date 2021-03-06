package com.example.android.tourapp;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CinemaScreenFrag extends Fragment {

    public CinemaScreenFrag() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.textpicture_list, container, false);

//Build our arraylist of descriptions and images so they scroll vertically on the page
        final ArrayList<TextPicture> items = new ArrayList<>();
        items.add(new TextPicture(getString(R.string.cinema1text), R.drawable.cinema6_400));
        items.add(new TextPicture(getString(R.string.cinema2text), R.drawable.cinema1_400));
        items.add(new TextPicture(getString(R.string.cinema3text), R.drawable.cinema2_400));
        items.add(new TextPicture(getString(R.string.cinematext), R.drawable.cinema3_400));
        items.add(new TextPicture(getString(R.string.cinema4text), R.drawable.cinema4_400));
        items.add(new TextPicture(getString(R.string.cinematext), R.drawable.cinema5_400));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link items}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        // There is a {@link ListView} with the view ID called list, declared in textpicture_list.xml
        ListView listView = rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link ItemAdapter} above, so that the
        // {@link ListView} will display list items for each {@link TextPicture} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}

