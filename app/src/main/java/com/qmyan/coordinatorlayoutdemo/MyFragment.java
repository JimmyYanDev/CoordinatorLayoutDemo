package com.qmyan.coordinatorlayoutdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by MichealYan on 2018/12/10.
 * Email: 956462326@qq.com
 * Describe:
 **/
public class MyFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private String[] strs = new String[50];

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        mRecyclerView = view.findViewById(R.id.list);
        for (int i = 0; i < 50; i++) {
            strs[i] = "Test" + i;
        }
        mRecyclerView.setLayoutManager(new LinearLayoutManager(container.getContext(), LinearLayoutManager.VERTICAL, false));
        mRecyclerView.setAdapter(new MyAdapter(strs));
        return view;
    }
}
