package com.dixitawedsharsh;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Aditya on 9/24/2016.
 */

public class FamilyTree extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;


    final Context context = this;


Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.family_tree);

        mToolbar = (Toolbar) findViewById(R.id.toolbar_1);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
       // button10=(Button)findViewById(R.id.button10);
        button9=(Button)findViewById(R.id.button9);
        button9.setOnClickListener(this);


        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom_dialog);
                //dialog.setTitle("Ann Cherian");

                TextView text0 = (TextView) dialog.findViewById(R.id.text0);
                text0.setText("Deepak Gaglani");
                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText("Papa");
                TextView text1 = (TextView) dialog.findViewById(R.id.text1);
                text1.setText("Custom Clearing agent");


                Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOk);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom_dialog);
               // dialog.setTitle("Cherian M Thomas");
                TextView text0 = (TextView) dialog.findViewById(R.id.text0);
                text0.setText("Bhavna gaglani");
                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText("Mummy");
                TextView text1 = (TextView) dialog.findViewById(R.id.text1);
                text1.setText("Homemaker");


                Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOk);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom_dialog);
                //dialog.setTitle("Nitin Cherian");
                TextView text0 = (TextView) dialog.findViewById(R.id.text0);
                text0.setText("Sumeet Gaglani");
                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText("Brother");
                TextView text1 = (TextView) dialog.findViewById(R.id.text1);
                text1.setText("Electronics and Telecommunication engineer");


                Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOk);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom_dialog);
                //dialog.setTitle("Nishith Cherian");
                TextView text0 = (TextView) dialog.findViewById(R.id.text0);
                text0.setText("Dixita Gaglani");
                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText("Bride");
                TextView text1 = (TextView) dialog.findViewById(R.id.text1);
                text1.setText("Senior Manager at Screen Facts");


                Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOk);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom_dialog);
                //dialog.setTitle("Annie Thomas");
                TextView text0 = (TextView) dialog.findViewById(R.id.text0);
                text0.setText("Dipti Dhabalia");
                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText("Mummy");
                TextView text1 = (TextView) dialog.findViewById(R.id.text1);
                text1.setText("Homemaker");


                Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOk);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom_dialog);
                //dialog.setTitle("Thomas Mathew");
                TextView text0 = (TextView) dialog.findViewById(R.id.text0);
                text0.setText("Ashok Dhabalia");
                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText("Daddy");
                TextView text1 = (TextView) dialog.findViewById(R.id.text1);
                text1.setText("MD in Real Plastic Company Limited");


                Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOk);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom_dialog);
               // dialog.setTitle("Neethal Thomas");
                TextView text0 = (TextView) dialog.findViewById(R.id.text0);
                text0.setText("Harsh Dhabalia");
                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText("Groom");
                TextView text1 = (TextView) dialog.findViewById(R.id.text1);
                text1.setText("MD in Real Plastic Company Limited");


                Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOk);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom_dialog);
                //dialog.setTitle("Priyanky Mukherjee");
                TextView text0 = (TextView) dialog.findViewById(R.id.text0);
                text0.setText("Heth Dhabalia");
                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText("Brother");
                TextView text1 = (TextView) dialog.findViewById(R.id.text1);
                text1.setText("Commerce Student");


                Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOk);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

/*
        button10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom_dialog);
                //dialog.setTitle("Anirudha Mukherjee");
                TextView text0 = (TextView) dialog.findViewById(R.id.text0);
                text0.setText("Anirudha Mukherjee");
                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText("Brother in-law");
                TextView text1 = (TextView) dialog.findViewById(R.id.text1);
                text1.setText("Software engineer at ANZ");


                Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOk);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });*/

    }














    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button9) {
            //do something here if button1 is clicked
            Intent i = new Intent(this, com.dixitawedsharsh.MainActivity.class);
            startActivity(i);
            overridePendingTransition(R.anim.left_to_right,
                    R.anim.right_to_left);//add animations
        }
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

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
}