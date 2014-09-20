package com.kaarvik.readit.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.volley.Response;
import com.kaarvik.readit.R;
import com.kaarvik.readit.adapters.LinkAdapter;
import com.kaarvik.readit.net.NetRequest;
import com.kaarvik.readit.net.RedditRequest;
import com.kaarvik.readit.object.RedditLink;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link com.kaarvik.readit.fragment.SubredditFragment.OnSubredditListPress} interface
 * to handle interaction events.
 * Use the {@link SubredditFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class SubredditFragment extends Fragment {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String SUBREDDIT_NAME = "param1";

    private String name;
    private View view;

    private OnSubredditListPress mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param name The Name of the Subreddit this fragment will display.
     * @return A new instance of fragment SubredditFragment.
     */
    public static SubredditFragment newInstance(String name) {
        SubredditFragment fragment = new SubredditFragment();
        Bundle args = new Bundle();
        args.putString(SUBREDDIT_NAME, name);
        fragment.setArguments(args);
        return fragment;
    }
    public SubredditFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString(SUBREDDIT_NAME);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.view = inflater.inflate(R.layout.fragment_subreddit, container, false);

        //Get subreddit listing
        //TODO: use a passed subreddit name
        RedditRequest.requestSubredditLinkArray(this, "");

//        LinkAdapter linkAdapter = new LinkAdapter(getActivity(), links);
//        ListView listView = (ListView) this.view.findViewById(R.id.subreddit_link_list);
//        listView.setAdapter(linkAdapter);

        return view;
    }

    public void onSubredditLoaded(RedditLink[] redditLinks){
        LinkAdapter linkAdapter = new LinkAdapter(getActivity(), redditLinks);
        ListView listView = (ListView) this.view.findViewById(R.id.subreddit_link_list);
        listView.setAdapter(linkAdapter);
    }

    public void onListPressed(int position) {
        if (mListener != null) {
            mListener.onSubredditListPress(position);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnSubredditListPress) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnSubredditListPress");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * See the Android Training lesson
     * http://developer.android.com/training/basics/fragments/communicating.html
     * for more information.
     */
    public interface OnSubredditListPress {
        public void onSubredditListPress(int position);
    }

}
