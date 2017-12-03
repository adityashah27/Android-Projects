package com.dixitawedsharsh;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.LinearLayout;

import android.widget.TextView;
import android.widget.Toast;

/*import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.android.youtube.player.YouTubePlayer.OnInitializedListener;*/


import java.text.SimpleDateFormat;

import java.util.Date;


/**
 * Created by Aditya on 9/24/2016.
 */

public class StoryFragment extends Fragment{

    TextView textView_11,textView_21,textView_31,textView_41,textView_51;
    //private static final String API_KEY = "AIzaSyD5M2DDO3qFZai9KC_x3dYkUEJ7QN0-j70";

    // YouTubeのビデオID
   // private static String VIDEO_ID = "gR8z0lIVpZM";
    public StoryFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_story, container, false);


     //   YouTubePlayerSupportFragment youTubePlayerFragment = YouTubePlayerSupportFragment.newInstance();

        // レイアウトにYouTubeフラグメントを追加
       // FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
       // transaction.add(R.id.youtube_layout, youTubePlayerFragment).commit();

        // YouTubeフラグメントのプレーヤーを初期化する
        /*youTubePlayerFragment.initialize(API_KEY, new OnInitializedListener() {

            // YouTubeプレーヤーの初期化成功
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
                if (!wasRestored) {
                    player.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
                    player.loadVideo(VIDEO_ID);
                    player.play();
                }
            }


            // YouTubeプレーヤーの初期化失敗
            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult error) {
                // YouTube error
                String errorMessage = error.toString();
                Toast.makeText(getActivity(), errorMessage, Toast.LENGTH_LONG).show();
                Log.d("errorMessage:", errorMessage);
            }
        });*/

        textView_11 = (TextView)rootView.findViewById(R.id.textview_11);
        String htmlString1="<u>ELDER'S BLESSING</u>";
        textView_11.setText(Html.fromHtml(htmlString1));

        textView_31 = (TextView)rootView.findViewById(R.id.textview_31);
        String htmlString3="<u>VOWS</u>";
        textView_31.setText(Html.fromHtml(htmlString3));

        textView_51 = (TextView)rootView.findViewById(R.id.textview_51);
        String htmlString5="<u>VOWS</u>";
        textView_51.setText(Html.fromHtml(htmlString5));
        return rootView;
    }











}