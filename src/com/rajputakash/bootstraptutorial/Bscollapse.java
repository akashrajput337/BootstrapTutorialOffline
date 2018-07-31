package com.rajputakash.bootstraptutorial;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.rajputakash.bootstraptutorial.R;

public class Bscollapse extends Activity {


	
    @SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bscollapse);
        getActionBar().setDisplayHomeAsUpEnabled(true);   
    }
    
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