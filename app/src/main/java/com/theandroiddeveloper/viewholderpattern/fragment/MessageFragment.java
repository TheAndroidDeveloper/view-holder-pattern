package com.theandroiddeveloper.viewholderpattern.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.theandroiddeveloper.viewholderpattern.R;
import com.theandroiddeveloper.viewholderpattern.adapter.MessageAdapter;
import com.theandroiddeveloper.viewholderpattern.helper.MessageHelper;

import java.util.ArrayList;
import java.util.List;

/**
 *  @author jonatan.salas
 */
public class MessageFragment extends Fragment {
    ListView mListView;
    MessageAdapter mAdapter;

    public MessageFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_list, container, false);
        mListView = (ListView) view.findViewById(R.id.list);

        MessageHelper helper = new MessageHelper(getContext());
        List messages = helper.getActualMessages();

        mAdapter = new MessageAdapter(getContext(), messages);

        if(!mAdapter.isEmpty())
            mListView.setAdapter(mAdapter);

        return view;
    }
}
