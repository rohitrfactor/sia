package com.example.garorasu.fragmenttest;

import android.app.Fragment;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by garorasu on 26/3/16.
 */
public class Contact extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //dialPhoneNumber("911");
        View rootView = inflater.inflate(R.layout.contact, container, false);
        return rootView;
    }

}
