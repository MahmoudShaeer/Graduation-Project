package com.example.mahmoudshaeer.graduationproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by mahmoud Shaeer on 4/12/2017.
 */

public class fragment_Apps extends Fragment {

    ListView apps;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.apps,container,false);
        apps= (ListView) view.findViewById(R.id.Apps);
        apps.setAdapter(new listResources(getActivity()));
        return view;
    }
}
