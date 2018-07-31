package com.rajputakash.bootstraptutorial;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class List1 extends Activity implements OnItemClickListener{


ListView listtopic;
	String topics[]={"Bootstrap Home","Bootstrap Button","Bootstrap Button Groups","Bootstrap Dropdowns","Bootstrap Images","Bootstrap Panels","Bootstrap Form","Bootstrap Glyphicon","Bootstrap Tooltip","Bootstrap Progress Bar","Bootstrap Modal","Bootstrap Tabs","Bootstrap collapse","Bootstrap Navigation Bar","Bootstrap Alert"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list1);
        
    
        listtopic=(ListView)findViewById(R.id.listtopic);
        ArrayAdapter<String> L=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,topics);
        listtopic.setAdapter(L);
        listtopic.setOnItemClickListener(this);
    }

    @Override
    	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
    		// TODO Auto-generated method stub
    	
   if (arg2==0) {
    	Intent intent=new Intent(List1.this,Bshome.class);
startActivity(intent);	
    }
   if (arg2==1) {
   	
	   Intent intent=new Intent(List1.this,Bsbutton.class);
startActivity(intent);	
   }
   if (arg2==2) {
	   	
	   Intent intent=new Intent(List1.this,Bsbuttongroup.class);
startActivity(intent);	
   }
   if (arg2==3) {
	   	
	   Intent intent=new Intent(List1.this,Bsdropdown.class);
startActivity(intent);	
   }	
   if (arg2==4) {
	   	
	   Intent intent=new Intent(List1.this,Bsimages.class);
startActivity(intent);	
   }	
   if (arg2==5) {
	   	
	   Intent intent=new Intent(List1.this,Bspanel.class);
startActivity(intent);	
   }	
   if (arg2==6) {
	   	
	   Intent intent=new Intent(List1.this,Bsform.class);
startActivity(intent);	
   }	
   if (arg2==7) {
	   	
	   Intent intent=new Intent(List1.this,Bsglyphicon.class);
startActivity(intent);	
   }	
   if (arg2==8) {
	   	
	   Intent intent=new Intent(List1.this,Bstooltip.class);
startActivity(intent);	
   }
   if (arg2==9) {
	   	
	   Intent intent=new Intent(List1.this,Bsprogressbar.class);
startActivity(intent);	
   }	
   if (arg2==10) {
	   	
	   Intent intent=new Intent(List1.this,Bsmodal.class);
startActivity(intent);	
   }	
   if (arg2==11) {
	   	
	   Intent intent=new Intent(List1.this,Bstabs.class);
startActivity(intent);	
   }	
   if (arg2==12) {
	   	
	   Intent intent=new Intent(List1.this,Bscollapse.class);
startActivity(intent);	
   }	
   if (arg2==13) {
	   	
	   Intent intent=new Intent(List1.this,Bsnavbar.class);
startActivity(intent);	
   }	
   
   if (arg2==14) {
	   	
	   Intent intent=new Intent(List1.this,Bsalert.class);
startActivity(intent);	
   }	
  	
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
		// TODO Auto-generated method stub
    	  if(item.getItemId()==R.id.rateus){
  			
    		  startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(( "http://play.google.com/store/apps/details?id=") +getPackageName())));
 			}
   
    else	if (item.getItemId()==R.id.contactus) {
       		
       		final Dialog d=new Dialog(List1.this);
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
   			
   		} else if(item.getItemId()==R.id.help){
   			
   			final Dialog d=new Dialog(List1.this);
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