package com.rajputakash.bootstraptutorial;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Main extends Activity {

	Button start;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        start=(Button)findViewById(R.id.startbutton);
        
        start.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(Main.this,List1.class);
	startActivity(intent);			
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        
        
        return true;
    }
    @Override
   	public boolean onOptionsItemSelected(MenuItem item) {
   		// TODO Auto-generated method stub
     if(item.getItemId()==R.id.rateus){
			
         startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(( "http://play.google.com/store/apps/details?id=") +getPackageName())));


		}
    	
    else  	if (item.getItemId()==R.id.contactus) {
       		
       		final Dialog d=new Dialog(Main.this);
          d.setContentView(R.layout.dialogmenu);
          d.setTitle("Contact us:");
         
          
          final Button bok=(Button)d.findViewById(R.id.bcontactus);
          bok.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				d.dismiss();
			}
		});
          d.show();
          
   			
   		}
else if(item.getItemId()==R.id.help){
	final Dialog d=new Dialog(Main.this);
    d.setContentView(R.layout.dialoghome);
    d.setTitle("Help menu:");
   
    
    final Button bok=(Button)d.findViewById(R.id.bhelp);
    bok.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			d.dismiss();
		}
	});
    d.show();
    
			
   		}
       	
   		return super.onOptionsItemSelected(item);
   	}
    
}
