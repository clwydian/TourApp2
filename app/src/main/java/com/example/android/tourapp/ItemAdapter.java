package com.example.android.tourapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * @link ItemAdapter is an @link ArrayAdapter providing layout for all the TextPicture objects
 */

public class ItemAdapter extends ArrayAdapter<TextPicture> {

    /**
     * Create a new {@link ItemAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param items   is the list of {@link TextPicture}s to be displayed.
     */
    public ItemAdapter(Context context, ArrayList<TextPicture> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link TextPicture} object located at this position in the list
        TextPicture currentItem = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID description.
        TextView description = listItemView.findViewById(R.id.description);
        // Get the current description and set the text of this new object
        description.setText(currentItem.getDescription());
        // Find the ImageView in the list_item.xml layout with the ID picture.
        ImageView picture = listItemView.findViewById(R.id.picture);
        //        set the image in the imageview to the returned current pictireID
        picture.setImageResource(currentItem.getPictureID());

        // Return the whole list item layout (containing 1 TextView 1 Image) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
