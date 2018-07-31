package com.rajputakash.bootstraptutorial;

import java.security.PublicKey;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.rajputakash.bootstraptutorial.R;

public class Bsbutton extends Activity {

Button buttonrunclick;
	
    @SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bsbutton);
   // getActionBar().setHomeButtonEnabled(true);
 getActionBar().setDisplayHomeAsUpEnabled(true);   
    }
    /*
      buttonrunclick=(Button)findViewById(R.id.buttonrunclick);
     
     buttonrunclick.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		
			Intent intent=new Intent(Bsbutton.this,Buttonrun.class);
			startActivity(intent);	
			
		}
	});  
     }
    */
    
    @Override
   	public boolean onOptionsItemSelected(MenuItem item) {
   		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
 
    	if (item.getItemId()==android.R.id.home) {
       		//this.finish();
       	onBackPressed();
       	}
    	return super.onOptionsItemSelected(item);
    	}   
}