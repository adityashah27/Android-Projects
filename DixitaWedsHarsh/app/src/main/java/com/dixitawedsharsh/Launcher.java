/*//the launching page
package com.dixitawedsharsh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;






public class Launcher extends Activity {
	Animation animFadein,zoom_out;
	private Toolbar mToolbar;
	ImageView image,image1;



	//create a new acitvity
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launcher);






		

		image=(ImageView) findViewById(R.id.imageView1);
		//image1=(ImageView) findViewById(R.id.imageView2);
		 animFadein = AnimationUtils.loadAnimation(getApplicationContext(),
	                R.anim.fade_in);
		zoom_out = AnimationUtils.loadAnimation(getApplicationContext(),
				R.anim.zoom_out);

		 //image1.startAnimation(zoom_out);
	
		//adding animations
		zoom_out.setAnimationListener(new Animation.AnimationListener(){
			@Override
			public void onAnimationStart(Animation arg0) {
			}
			@Override
			public void onAnimationRepeat(Animation arg0) {
			}
			@Override
			public void onAnimationEnd(Animation arg0) {
				image.setVisibility(View.VISIBLE);
				image.startAnimation(animFadein);

			}
		});


		animFadein.setAnimationListener(new Animation.AnimationListener(){
	    @Override
	    public void onAnimationStart(Animation arg0) {
	    }           
	    @Override
	    public void onAnimationRepeat(Animation arg0) {
	    }           
	    @Override
	    public void onAnimationEnd(Animation arg0) {
	    	Toast.makeText(getApplicationContext(), "Welcome to the Wedding. Press Anywhere to continue",
                    Toast.LENGTH_LONG).show();
	        
	    }
	});
	}

	
	
	public void clickany(View v){
		Intent i=new Intent(this, MainActivity.class);//creating intent and starting new activity for main page
		startActivity(i);
		overridePendingTransition(R.anim.left_to_right,
    			R.anim.right_to_left);//add animations


	}
	




}
*/

//the launching page
package com.dixitawedsharsh;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;



public class Launcher extends Activity {
	Animation animFadein;
	private Toolbar mToolbar;

	//create a new acitvity
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launcher);
		mToolbar = (Toolbar) findViewById(R.id.toolbar);


		//AppInbox.startInbox(this, "_2PulCjil0QrlTpqa-PVObwtPyH3psVlb5MUzQglcpk", "749091774738", null, null,null, null,null, null, Gender.BOTH, 0);
		//setSupportActionBar(mToolbar);
		//getSupportActionBar().setDisplayShowHomeEnabled(true);
		//WindowManager.LayoutParams lp = getWindow().getAttributes();
		//lp.screenBrightness = 75 / 100.0f;
		//getWindow().setAttributes(lp);
		// Check whether the user has already accepted



		ImageView image;
		image=(ImageView) findViewById(R.id.imageView1);
		animFadein = AnimationUtils.loadAnimation(getApplicationContext(),
				R.anim.fade_in);
		image.startAnimation(animFadein);

		//adding animations
		animFadein.setAnimationListener(new Animation.AnimationListener(){
			@Override
			public void onAnimationStart(Animation arg0) {
			}
			@Override
			public void onAnimationRepeat(Animation arg0) {
			}
			@Override
			public void onAnimationEnd(Animation arg0) {
				Toast.makeText(getApplicationContext(), "Press Anywhere to continue",
						Toast.LENGTH_LONG).show();

			}
		});
	}



	public void clickany(View v){
		Intent i=new Intent(this, com.dixitawedsharsh.MainActivity.class);//creating intent and starting new activity for main page
		startActivity(i);
		overridePendingTransition(R.anim.left_to_right,
				R.anim.right_to_left);//add animations
	}





}
