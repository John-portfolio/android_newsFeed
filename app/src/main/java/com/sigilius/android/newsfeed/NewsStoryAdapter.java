package com.sigilius.android.newsfeed;


import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link NewsStoryAdapter} knows how to create a list item layout for each earthquake
 * in the data source (a list of {@link NewsStory} objects).
 */
public class NewsStoryAdapter extends ArrayAdapter<NewsStory> {

    /**
     * Constructs a new {@link NewsStoryAdapter}.
     *
     * @param context of the app
     * @param news    is the list of news stories, which is the data source of the adapter
     */
    public NewsStoryAdapter(Context context, List<NewsStory> news) {

        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the earthquake at the given position
     * in the list of news stories.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        NewsStory currentNews = getItem(position);

        // Find the TextView with view ID magnitude
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        // Display the magnitude of the current earthquake in that TextView
        titleView.setText(currentNews.getTitle());

        // Find the TextView with view ID magnitude
        TextView byLineView = (TextView) listItemView.findViewById(R.id.byline);
        // Display the magnitude of the current earthquake in that TextView
        byLineView.setText(currentNews.getByLine());

        TextView fromDateView = (TextView) listItemView.findViewById(R.id.from_date);
        fromDateView.setText(QueryUtils.formatNewsDate(currentNews.getFromDate()));

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}

