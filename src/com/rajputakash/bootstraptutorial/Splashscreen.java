package com.rajputakash.bootstraptutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class Splashscreen extends Activity {


	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        
        Thread t=new Thread(){
        	public void run()
        	{
        		try {
					sleep(2500);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
        		finally{
        			Intent imsg=new Intent(Splashscreen.this,Main.class);
        			startActivity(imsg);
        			finish();
        		}
        	}
    	
        };
        t.start();
      
    }
  
}