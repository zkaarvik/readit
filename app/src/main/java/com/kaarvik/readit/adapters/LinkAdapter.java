package com.kaarvik.readit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.kaarvik.readit.R;
import com.kaarvik.readit.object.RedditLink;

import org.w3c.dom.Text;

/**
 * Created by Zach on 9/15/2014
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

        TextView title = (TextView) rowView.findViewById(R.id.title);
        title.setText(links[position].getTitle());
        //title.setCompoundDrawablesWithIntrinsicBounds(int left, 0, 0, 0); //Drawable displayed next to link title

        TextView author = (TextView) rowView.findViewById(R.id.authorWithSub);
        String authorWithSub = context.getText(R.string.link_by) + " " + links[position].getAuthor() + " " +
                context.getText(R.string.link_in) + " " + context.getText(R.string.link_subreddit_prefix) + links[position].getSubreddit();
        author.setText(authorWithSub);

        return rowView;
    }
}
