package com.jious2.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jious2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RequestsFragment extends Fragment {

    private View RequestsFragmentView;
    private RecyclerView myRequestsList;

    public RequestsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RequestsFragmentView = inflater.inflate(R.layout.fragment_requests,container,false);

        myRequestsList = (RecyclerView) RequestsFragmentView.findViewById(R.id.chat_requests_list);
        myRequestsList.setLayoutManager(new LinearLayoutManager(getContext()));

        return RequestsFragmentView;
    }

}
