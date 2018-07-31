package com.rajputakash.bootstraptutorial;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import com.rajputakash.bootstraptutorial.R;

public class Bsnavbar extends Activity {


	
    @SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bsnavbar);
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