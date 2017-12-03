package com.dixitawedsharsh;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import android.content.IntentFilter;
import android.content.res.Configuration;

import android.os.Bundle;
import android.support.design.widget.NavigationView;

import android.support.v4.app.FragmentManager;

import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import com.google.firebase.messaging.FirebaseMessaging;
import com.dixitawedsharsh.R;
import com.dixitawedsharsh.app.Config;
import com.dixitawedsharsh.util.NotificationUtils;


/**
 * Created by Aditya on 9/24/2016.
 */


        import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    Toolbar toolbar;
    private Context mContext;
    private static final String TAG = MainActivity.class.getSimpleName();
    private BroadcastReceiver mRegistrationBroadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         *Setup the DrawerLayout and NavigationView
         */
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.navigation_view) ;

        /**
         * Lets inflate the very first fragment
         * Here , we are inflating the TabFragment as the first Fragment
         */

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView,new Tab_Layout()).commit();
        /**
         * Setup click events on the Navigation View Items.
         * Update for git
         */

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            Intent i;

            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();

                int id = menuItem.getItemId();

                switch (id) {

                    case R.id.schedule:
                        i = new Intent(mNavigationView.getContext(), com.dixitawedsharsh.Schedule.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.left_to_right,
                                R.anim.right_to_left);//add animations
                        break;
               /*     case R.id.places_to_visit:
                        i = new Intent(mNavigationView.getContext(), com.nishithwedsneethal.Places_to_visit.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.left_to_right,
                                R.anim.right_to_left);//add animations
                        break;
                    case R.id.climate:
                        i = new Intent(mNavigationView.getContext(), com.nishithwedsneethal.Climate.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.left_to_right,
                                R.anim.right_to_left);//add animations
                        break;
*/
                    case R.id.contact:
                        i = new Intent(mNavigationView.getContext(), com.dixitawedsharsh.Contacts_Info.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.left_to_right,
                                R.anim.right_to_left);//add animations
                        break;
  /*                  case R.id.send_wishes:
                        i = new Intent(mNavigationView.getContext(), com.nishithwedsneethal.Send_Wishes.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.left_to_right,
                                R.anim.right_to_left);//add animations
                        break;
                    case R.id.past_events:
                        i = new Intent(mNavigationView.getContext(), com.nishithwedsneethal.Past_Events.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.left_to_right,
                                R.anim.right_to_left);//add animations
                        break;
                        */
                    case R.id.family_tree:
                        i = new Intent(mNavigationView.getContext(), com.dixitawedsharsh.FamilyTree.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.left_to_right,
                                R.anim.right_to_left);//add animations
                        break;
                    /*case R.id.significance:
                        i = new Intent(mNavigationView.getContext(), com.nishithwedsneethal.Significance.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.left_to_right,
                                R.anim.right_to_left);//add animations
                        break;
                    case R.id.photo_upload:
                        i = new Intent(mNavigationView.getContext(), com.nishithwedsneethal.Upload_photos.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.left_to_right,
                                R.anim.right_to_left);//add animations
                        break;

*/
                   case R.id.push_notification:
                       Toast.makeText(getApplicationContext(), "Stay tuned for the live updates and enjoy the wedding",
                               Toast.LENGTH_LONG).show();
                        break;


                    case R.id.exit:
                        exit();
                        break;
                    // FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                    // xfragmentTransaction.replace(R.id.containerView,new TabFragment()).commit();
                }

                return true;

            }

        });

        /**
         * Setup Drawer Toggle of the Toolbar
         */

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
                R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);


        mDrawerToggle.syncState();

        mRegistrationBroadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {

                // checking for type intent filter
                if (intent.getAction().equals(Config.REGISTRATION_COMPLETE)) {
                    // gcm successfully registered
                    // now subscribe to `global` topic to receive app wide notifications
                    FirebaseMessaging.getInstance().subscribeToTopic(Config.TOPIC_GLOBAL);

                    //displayFirebaseRegId();

                } else if (intent.getAction().equals(Config.PUSH_NOTIFICATION)) {
                    // new push notification is received

                    String message = intent.getStringExtra("message");

                    Toast.makeText(getApplicationContext(), "Push notification: " + message, Toast.LENGTH_LONG).show();

                    //txtMessage.setText(message);
                }
            }
        };


      //  displayFirebaseRegId();
    }

    @Override
    protected void onResume() {
        super.onResume();

        // register GCM registration complete receiver
        LocalBroadcastManager.getInstance(this).registerReceiver(mRegistrationBroadcastReceiver,
                new IntentFilter(Config.REGISTRATION_COMPLETE));

        // register new push message receiver
        // by doing this, the activity will be notified each time a new message arrives
        LocalBroadcastManager.getInstance(this).registerReceiver(mRegistrationBroadcastReceiver,
                new IntentFilter(Config.PUSH_NOTIFICATION));

        // clear the notification area when the app is opened
        NotificationUtils.clearNotifications(getApplicationContext());
    }

    @Override
    protected void onPause() {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(mRegistrationBroadcastReceiver);
        super.onPause();
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
    public void onBackPressed() {
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
        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggls

    }


}

















