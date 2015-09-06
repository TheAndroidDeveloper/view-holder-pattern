package com.theandroiddeveloper.viewholderpattern.fragment;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;

import com.theandroiddeveloper.viewholderpattern.R;
import com.theandroiddeveloper.viewholderpattern.adapter.MessageAdapter;
import com.theandroiddeveloper.viewholderpattern.helper.MessageHelper;

/**
 *  Fragment class that represents the message app UI.
 *
 *  @author jonatan.salas
 */
public class MessageFragment extends Fragment implements AbsListView.OnScrollListener {
    private FloatingActionButton mFloatingButton;
    private MessageHelper mMessageHelper;
    private MessageAdapter mAdapter;

    public MessageFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_message, container, false);

        mFloatingButton = (FloatingActionButton) view.findViewById(R.id.fab);
        final ListView listView = (ListView) view.findViewById(R.id.list);

        mMessageHelper = new MessageHelper(getContext());
        mAdapter = new MessageAdapter(getContext(), mMessageHelper.getActualMessages());

        if(!mAdapter.isEmpty())
            listView.setAdapter(mAdapter);

        listView.setOnScrollListener(this);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mAdapter.setItems(mMessageHelper.getActualMessages());
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        switch (scrollState) {
            case SCROLL_STATE_TOUCH_SCROLL:
                ViewCompat.animate(mFloatingButton).translationYBy(250).start();
                break;
            case SCROLL_STATE_IDLE:
                ViewCompat.animate(mFloatingButton).translationY(0).start();
                break;
        }
    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

    }
}
