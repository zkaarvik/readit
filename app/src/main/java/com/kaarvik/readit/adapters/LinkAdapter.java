package com.kaarvik.readit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.kaarvik.readit.R;
import com.kaarvik.readit.object.RedditLink;

/**
 * Created by Zach on 9/15/2014.
 */
public class LinkAdapter extends ArrayAdapter<RedditLink> {
    private final Context context;
    private final RedditLink[] links;

    public LinkAdapter(Context context, RedditLink[] links) {
        super(context, R.layout.adapter_link, links);
        this.context = context;
        this.links = links;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //TODO: Implement a viewholder - better performance

        //convertView will be != null if Android determines we can recycle a view (it has gone out of sight)
        View rowView = convertView;
        if(rowView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.adapter_link, parent, false);
        }

        TextView textView = (TextView) rowView.findViewById(R.id.label);
        //ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        textView.setText(links[position].getName());

        return rowView;
    }
}
