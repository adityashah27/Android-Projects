package com.dixitawedsharsh;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Aditya on 9/24/2016.
 */

public class Schedule extends AppCompatActivity implements View.OnClickListener{

    Toolbar toolbar;
    private Context mContext;
    TextView textview_14,textview_24,textview_34;
    TextView textview_11,textview_21,textview_31;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scehdule);

        /**
         *Setup the DrawerLayout and NavigationView
         */
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview_14 = (TextView) findViewById(R.id.textview_14);
        textview_14.setText(Html.fromHtml(
                "<a href=\"http://maps.google.com/maps?q=RDP+7,+Sector+No.6,+Near+Ambe+Mata+Mandir,+Charkop,+Kandivali+West,+Mumbai,+Maharashtra+400059\">" +
                        "RDP 7, Sector No.6, Near Ambe Mata Mandir, Charkop, Kandivali West, Mumbai, Maharashtra 400059" +
                        "</a>"));
        textview_14.setMovementMethod(LinkMovementMethod.getInstance());

        textview_24 = (TextView) findViewById(R.id.textview_24);
        textview_24.setText(Html.fromHtml(
                "<a href=\"http://maps.google.com/maps?q=RDP+7,+Sector+No.6,+Near+Ambe+Mata+Mandir,+Charkop,+Kandivali+West,+Mumbai,+Maharashtra+400059\">" +
                        "RDP 7, Sector No.6, Near Ambe Mata Mandir, Charkop, Kandivali West, Mumbai, Maharashtra 400059" +
                        "</a>"));
        textview_24.setMovementMethod(LinkMovementMethod.getInstance());




        textview_11 = (TextView)findViewById(R.id.textview_11);
        String htmlString1="<u>Marriage, Haryana Bhavan </u>";
        textview_11.setText(Html.fromHtml(htmlString1));

        textview_21 = (TextView)findViewById(R.id.textview_21);
        String htmlString2="<u>Reception, Haryana Bhavan </u>";
        textview_21.setText(Html.fromHtml(htmlString2));


        initCollapsingToolbar();







    }

    private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(" ");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.setTitle(getString(R.string.wedding_day));
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(" ");
                    isShow = false;
                }
            }
        });
    }

    public void exit()
    {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //ProfileActivity.this.finish();
                        finishAffinity();
                        System.exit(0);
                        moveTaskToBack(true);

                    }
                })
                .setNegativeButton("No", null)
                .show();
    }



    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
        //return(super.onCreateOptionsMenu(menu));
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        Intent i;
        if (id == R.id.action_exit) {
            exit();
            return true;
        }


        switch (item.getItemId()) {

            case android.R.id.home:
                // app icon in action bar clicked; go home
                Intent intentHome = new Intent(this, MainActivity.class);
                intentHome.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intentHome);
                overridePendingTransition(R.anim.left,
                        R.anim.right);//add animations
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
        //noinspection SimplifiableIfStatement


    }


    public boolean onKeyDown(int keyCode, KeyEvent event){
        if(keyCode == KeyEvent.KEYCODE_BACK) {
            Intent Act2Intent = new Intent(this, MainActivity.class);
            overridePendingTransition(R.anim.left,
                    R.anim.right);//add animations
            startActivity(Act2Intent);

            finish();
            return true;
        }
        return false;
    }


}

















