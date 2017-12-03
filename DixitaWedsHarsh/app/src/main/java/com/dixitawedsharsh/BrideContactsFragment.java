package com.dixitawedsharsh;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by Aditya on 9/24/2016.
 */

public class BrideContactsFragment extends Fragment implements View.OnClickListener{
   TextView textview_64;
    ScrollView scrollView;
    public BrideContactsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_bridecontacts, container, false);
        textview_64 = (TextView)rootView. findViewById(R.id.textview_64);
        textview_64.setText(Html.fromHtml(
        "<a href=\"http://maps.google.com/maps?q=DR.Gambers+residency+S.V+road+Malad+West,+Mumbai+400064\">" +
                "B/304 DR.Gambers residency S.V road Malad West, Mumbai 400064" +
                "</a>"));
        textview_64.setMovementMethod(LinkMovementMethod.getInstance());
        scrollView =(ScrollView) rootView.findViewById(R.id.scrollView1);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            scrollView.setNestedScrollingEnabled(true);
        }
        return rootView;
    }
    @Override
    public void onResume() {
        super.onResume();
    }


    @Override
    public void onClick(View v) {
    }
}