package com.dixitawedsharsh;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.dixitawedsharsh.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Aditya on 9/24/2016.
 */

public class TimelineFragment extends Fragment{
TextView textView_11,textView_21,textView_31,textView_41,textView_51,textView_61,textView_71;
    public TimelineFragment() {
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
        View rootView= inflater.inflate(R.layout.fragment_timeline, container, false);
        textView_11 = (TextView)rootView.findViewById(R.id.textview_11);
        String htmlString1="<u>BIRTH</u>";
        textView_11.setText(Html.fromHtml(htmlString1));
        textView_21 = (TextView)rootView.findViewById(R.id.textview_21);
        String htmlString2="<u>SCHOOL LIFE</u>";
        textView_21.setText(Html.fromHtml(htmlString2));
        textView_31 = (TextView)rootView.findViewById(R.id.textview_31);
        String htmlString3="<u>COLLEGE LIFE</u>";
        textView_31.setText(Html.fromHtml(htmlString3));
        textView_41 = (TextView)rootView.findViewById(R.id.textview_41);
        String htmlString4="<u>CURRENT JOB</u>";
        textView_41.setText(Html.fromHtml(htmlString4));
        textView_51 = (TextView)rootView.findViewById(R.id.textview_51);
        String htmlString5="<u>INETREST</u>";
        textView_51.setText(Html.fromHtml(htmlString5));
        textView_61 = (TextView)rootView.findViewById(R.id.textview_61);
        String htmlString6="<u>PERSONALITY</u>";
        textView_61.setText(Html.fromHtml(htmlString6));
        textView_71 = (TextView)rootView.findViewById(R.id.textview_71);
        String htmlString7="<u>PERSONALITY</u>";
        textView_71.setText(Html.fromHtml(htmlString7));
        return rootView;
    }
    @Override
    public void onResume() {
        super.onResume();
    }










}