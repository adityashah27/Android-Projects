package com.dixitawedsharsh;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
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

public class WeddingFragment extends Fragment implements View.OnClickListener{
    private TextView txtTimerDay, txtTimerHour, txtTimerMinute, txtTimerSecond,txtTimernote;
    private TextView tvEvent;
    private Handler handler;
    private Runnable runnable;
    LinearLayout l1,l2,l3,l4;
    private ImageButton imageButton;
    public WeddingFragment() {
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
        View rootView= inflater.inflate(R.layout.fragment_wedding, container, false);
        txtTimerDay = (TextView)rootView. findViewById(R.id.txtTimerDay);
        txtTimerHour = (TextView)rootView. findViewById(R.id.txtTimerHour);
        txtTimerMinute = (TextView)rootView. findViewById(R.id.txtTimerMinute);
        txtTimerSecond = (TextView)rootView. findViewById(R.id.txtTimerSecond);
        txtTimernote = (TextView)rootView. findViewById(R.id.textView1);
        tvEvent = (TextView)rootView. findViewById(R.id.tvhappyevent);
        l1 = (LinearLayout) rootView. findViewById(R.id.LinearLayout10);
        l2 = (LinearLayout) rootView. findViewById(R.id.LinearLayout11);
        l3 = (LinearLayout) rootView. findViewById(R.id.LinearLayout12);
        l4 = (LinearLayout) rootView. findViewById(R.id.LinearLayout13);

        imageButton = (ImageButton) rootView. findViewById(R.id.imagebutton);
        imageButton.setOnClickListener(this);

        /*textview4 = (TextView)rootView. findViewById(R.id.textview4);
        textview4.setText(Html.fromHtml(
                "<a href=\"http://maps.google.com/maps?q=St.+Joseph+Church,+Rajagiri+Rd,+North+Kalamassery,+Kalamassery,+Ernakulam,+Kerala+683104\">" +
                        "St. Joseph's Church, Rajagiri Rd, North Kalamassery, Kalamassery, Ernakulam, Kerala 683104" +
                        "</a>"));
        textview4.setMovementMethod(LinkMovementMethod.getInstance());*/

        countDownStart();


        return rootView;
    }

    public void countDownStart() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat(
                            "yyyy-MM-dd HH:mm:ss" );
// Please here set your event date//YYYY-MM-DD
                    Date futureDate = dateFormat.parse("2017-11-30 10:30:00");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        txtTimerDay.setText("" + String.format("%02d", days));
                        txtTimerHour.setText("" + String.format("%02d", hours));
                        txtTimerMinute.setText(""
                                + String.format("%02d", minutes));
                        txtTimerSecond.setText(""
                                + String.format("%02d", seconds));
                    } else {
                        tvEvent.setVisibility(View.VISIBLE);
                        tvEvent.setText("The New Journey has started!");
                        //tvEvent.setGravity(Gravity.CENTER);
                        tvEvent.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
                        l1.setVisibility(View.GONE);
                        l2.setVisibility(View.GONE);
                        l3.setVisibility(View.GONE);
                        l4.setVisibility(View.GONE);
                        txtTimernote.setVisibility(View.GONE);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 1 * 1000);
    }
    @Override
    public void onResume() {
        super.onResume();
    }




    public void onClick(View v) {

        if (v.getId() == R.id.imagebutton) {
            //do something here if button1 is clicked
            String map = "http://maps.google.co.in/maps?q=RDP+7,+Sector+No.6,+Near+Ambe+Mata+Mandir,+Charkop,+Kandivali+West,+Mumbai,+Maharashtra+400059";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
            getActivity().startActivity(intent);

        }
    }




}