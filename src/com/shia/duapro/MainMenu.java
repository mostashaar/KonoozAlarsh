package com.shia.duapro;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

import com.shia.duapro.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainMenu extends Activity{
	 private ImageView e1;	 private ImageView e2;	 private ImageView e3;
	 private ImageView e4;	 private ImageView e5;	 private ImageView e6;
	 private ImageView e7;	 private ImageView e8;	 private ImageView e9;
	 private ImageView e10;	 private ImageView e11;  private ImageView e12;
	 private ImageView e13;  private ImageView e14;  private ImageView e15;
	 private ImageView e16;
	 private int noG;
	 String fullname;
	 String duaNameAfterFinishDownload;
	 String duaReader;
	 
	 public static final int DIALOG_DOWNLOAD_PROGRESS = 0;
	 private ProgressDialog mProgressDialog;
		
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.mainmenu);
	        e1 = (ImageView) findViewById(R.id.imageView1);
	        e2 = (ImageView) findViewById(R.id.imageView2);
	        e3 = (ImageView) findViewById(R.id.imageView3);
	        e4 = (ImageView) findViewById(R.id.imageView4);
	        e5 = (ImageView) findViewById(R.id.imageView5);
	        e6 = (ImageView) findViewById(R.id.imageView6);
	        e7 = (ImageView) findViewById(R.id.imageView7);
	        e8 = (ImageView) findViewById(R.id.imageView8);
	        e9 = (ImageView) findViewById(R.id.imageView9);
	        e10 = (ImageView) findViewById(R.id.imageView10);
	        e11 = (ImageView) findViewById(R.id.imageView11);
	        e12 = (ImageView) findViewById(R.id.imageView12);
	        e13 = (ImageView) findViewById(R.id.imageView13);
	        e14 = (ImageView) findViewById(R.id.imageView14);
	        e15 = (ImageView) findViewById(R.id.imageView15);
	        e16 = (ImageView) findViewById(R.id.imageView16);
	        
	        /*====================================*/
	        
	        e1.setOnClickListener(new Button.OnClickListener()
		    {

				
				public void onClick(View arg0)
				{
					//Toast.makeText(getApplicationContext(), "???? ??????", Toast.LENGTH_SHORT).show();
					showDialog(1,"???? ??????");
				}
	        	
		    });
	        e2.setOnClickListener(new Button.OnClickListener()
		    {

				
				public void onClick(View arg0)
				{
					//Toast.makeText(getApplicationContext(), "???? ??????", Toast.LENGTH_SHORT).show();
					showDialog(2,"???? ????");
				}
	        	
		    });
	        e3.setOnClickListener(new Button.OnClickListener()
		    {

				
				public void onClick(View arg0)
				{
					//Toast.makeText(getApplicationContext(), "???? ??????", Toast.LENGTH_SHORT).show();
					showDialog(3,"???? ??????");
				}
	        	
		    });
	        e4.setOnClickListener(new Button.OnClickListener()
		    {

				
				public void onClick(View arg0)
				{
					//Toast.makeText(getApplicationContext(), "???? ??????", Toast.LENGTH_SHORT).show();
					showDialog(4,"???? ??????");
				}
	        	
		    });
	        e5.setOnClickListener(new Button.OnClickListener()
		    {

				
				public void onClick(View arg0)
				{
					//Toast.makeText(getApplicationContext(), "???? ??????", Toast.LENGTH_SHORT).show();
					showDialog(5,"???? ??????");
				}
	        	
		    });
	        e6.setOnClickListener(new Button.OnClickListener()
		    {

				
				public void onClick(View arg0)
				{
					//Toast.makeText(getApplicationContext(), "???? ??????", Toast.LENGTH_SHORT).show();
					showDialog(6,"???? ????????");
				}
	        	
		    });
	        e7.setOnClickListener(new Button.OnClickListener()
		    {

				
				public void onClick(View arg0)
				{
					//Toast.makeText(getApplicationContext(), "???? ??????", Toast.LENGTH_SHORT).show();
					showDialog(7,"???? ?????? ??????");
				}
	        	
		    });
	        e8.setOnClickListener(new Button.OnClickListener()
		    {

				
				public void onClick(View arg0)
				{
					//Toast.makeText(getApplicationContext(), "???? ??????", Toast.LENGTH_SHORT).show();
					showDialog(8,"???? ?????? ??????");
				}
	        	
		    });
	        e9.setOnClickListener(new Button.OnClickListener()
		    {

				
				public void onClick(View arg0)
				{
					//Toast.makeText(getApplicationContext(), "???? ??????", Toast.LENGTH_SHORT).show();
					showDialog(9,"???? ??????");
				}
	        	
		    });
	        e10.setOnClickListener(new Button.OnClickListener()
		    {

				
				public void onClick(View arg0)
				{
					//Toast.makeText(getApplicationContext(), "???? ??????", Toast.LENGTH_SHORT).show();
					showDialog(10,"???? ?????");
				}
	        	
		    });
	        e11.setOnClickListener(new Button.OnClickListener()
		    {

				
				public void onClick(View arg0)
				{
					//Toast.makeText(getApplicationContext(), "???? ??????", Toast.LENGTH_SHORT).show();
					showDialog(11,"???? ??? ???? ???????");
				}
	        	
		    });
	        
	        e12.setOnClickListener(new Button.OnClickListener()
		    {

				
				public void onClick(View arg0)
				{
					//Toast.makeText(getApplicationContext(), "???? ??????", Toast.LENGTH_SHORT).show();
					showDialog(12,"???? ?????");
				}
	        	
		    });
	        
	        e13.setOnClickListener(new Button.OnClickListener()
		    {

				
				public void onClick(View arg0)
				{
					//Toast.makeText(getApplicationContext(), "???? ??????", Toast.LENGTH_SHORT).show();
					showDialog(13,"???? ??????");
				}
	        	
		    });
	        
	        e14.setOnClickListener(new Button.OnClickListener()
		    {

				
				public void onClick(View arg0)
				{
					//Toast.makeText(getApplicationContext(), "???? ??????", Toast.LENGTH_SHORT).show();
					showDialog(14,"???? ???????");
				}
	        	
		    });
	        
	        e15.setOnClickListener(new Button.OnClickListener()
		    {

				
				public void onClick(View arg0)
				{
					//Toast.makeText(getApplicationContext(), "???? ??????", Toast.LENGTH_SHORT).show();
					showDialog(15,"???? ?????");
				}
	        	
		    });
	        
	        e16.setOnClickListener(new Button.OnClickListener()
		    {

				
				public void onClick(View arg0)
				{
					//Toast.makeText(getApplicationContext(), "???? ??????", Toast.LENGTH_SHORT).show();
					showDialog(16,"???? ?????");
				}
	        	
		    });
	 }
	void showDialog(int no, String duaName)
	{
		final String duaNamefinal = duaName;
		switch(no)
		{
			case 1:
				final CharSequence[] items = {"???? ??????","???? ???????","????? ????????","???? ?????????","???? ??????","???? ??????","???? ???????","???? ???????"};
				AlertDialog.Builder builder = new AlertDialog.Builder(this);
				noG = no;
				builder.setTitle(duaName);
				builder.setItems(items, new DialogInterface.OnClickListener() {
				    
					public void onClick(DialogInterface dialog, int item) {
				    	int duaNumber = ((noG*10)+item);
				    	fullname = "a" + duaNumber + ".mp3";
				    	duaNameAfterFinishDownload = duaNamefinal;
				    	duaReader = (String) items[item];
				    	
				    	if(checkFileExistance("a" + duaNumber))
				    	{
					        //Toast.makeText(getApplicationContext(), duaNumber, Toast.LENGTH_SHORT).show();
							Intent intent= new Intent(getBaseContext(), ShiaduaActivity.class);
							Bundle bundle = new Bundle();
							bundle.putString("duaNumber", "a" + Integer.toString(duaNumber) + ".mp3");
							bundle.putString("duaReader", (String) items[item]);
							bundle.putString("duaName", duaNamefinal);
							intent.putExtras(bundle);
							startActivity(intent);
				    	}
				    	else
				    	{
				    		startDownload("a" + duaNumber + ".mp3");
				    	}
				    }
				}).show();
				break;
			case 2:
				final CharSequence[] items1 = {"???? ?????","???? ??????","???? ???????","????? ????????","???? ?????????","???? ??????","???? ???????","???? ???????","???? ???????"};
				AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
				noG = no;
				builder1.setTitle(duaName);
				builder1.setItems(items1, new DialogInterface.OnClickListener() {
				    
					public void onClick(DialogInterface dialog, int item) {
				    	int duaNumber = ((noG*10)+item);
				    	fullname = "a" + duaNumber + ".mp3";
				    	duaNameAfterFinishDownload = duaNamefinal;
				    	duaReader = (String) items1[item];
				    	if(checkFileExistance("a" + duaNumber))
				    	{
				    		//Toast.makeText(getApplicationContext(), duaNumber, Toast.LENGTH_SHORT).show();
				    		Intent intent= new Intent(getBaseContext(), ShiaduaActivity.class);
				    		Bundle bundle = new Bundle();
				    		bundle.putString("duaNumber", "a" + Integer.toString(duaNumber) + ".mp3");
				    		bundle.putString("duaReader", (String) items1[item]);
				    		bundle.putString("duaName", duaNamefinal);
				    		intent.putExtras(bundle);
				    		startActivity(intent);
				    	}
				    	else
				    	{
				    		startDownload("a" + duaNumber + ".mp3");
				    	}
				    }
				}).show();
				break;
			case 3:
				final CharSequence[] items2 = {"???? ??????","???? ???????","???? ????","???? ?????????","???? ???????","???? ??????","???? ???????"};
				AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
				noG = no;
				builder2.setTitle(duaName);
				builder2.setItems(items2, new DialogInterface.OnClickListener() {
				    
					public void onClick(DialogInterface dialog, int item) {
				    	int duaNumber = ((noG*10)+item);
				    	fullname = "a" + duaNumber + ".mp3";
				    	duaNameAfterFinishDownload = duaNamefinal;
				    	duaReader = (String) items2[item];
				    	if(checkFileExistance("a" + duaNumber))
				    	{
				    		//Toast.makeText(getApplicationContext(), duaNumber, Toast.LENGTH_SHORT).show();
				    		Intent intent= new Intent(getBaseContext(), ShiaduaActivity.class);
				    		Bundle bundle = new Bundle();
				    		bundle.putString("duaNumber", "a" + Integer.toString(duaNumber) + ".mp3");
				    		bundle.putString("duaReader", (String) items2[item]);
				    		bundle.putString("duaName", duaNamefinal);
				    		intent.putExtras(bundle);
				    		startActivity(intent);
				    	}
				    	else
				    	{
				    		startDownload("a" + duaNumber + ".mp3");
				    	}
				    }
				}).show();
				break;
			case 4:
				final CharSequence[] items3 = {"???? ??????","???? ???????","????? ????????","???? ?????????","???? ????","???? ??????","???? ?? ???","???? ??????","???? ???????"};
				AlertDialog.Builder builder3 = new AlertDialog.Builder(this);
				noG = no;
				builder3.setTitle(duaName);
				builder3.setItems(items3, new DialogInterface.OnClickListener() {
				    
					public void onClick(DialogInterface dialog, int item) {
				    	int duaNumber = ((noG*10)+item);
				    	fullname = "a" + duaNumber + ".mp3";
				    	duaNameAfterFinishDownload = duaNamefinal;
				    	duaReader = (String) items3[item];
				    	if(checkFileExistance("a" + duaNumber))
				    	{
				    		//Toast.makeText(getApplicationContext(), duaNumber, Toast.LENGTH_SHORT).show();
				    		Intent intent= new Intent(getBaseContext(), ShiaduaActivity.class);
				    		Bundle bundle = new Bundle();
				    		bundle.putString("duaNumber", "a" + Integer.toString(duaNumber) + ".mp3");
				    		bundle.putString("duaReader", (String) items3[item]);
				    		bundle.putString("duaName", duaNamefinal);
				    		intent.putExtras(bundle);
				    		startActivity(intent);
				    	}
				    	else
				    	{
				    		startDownload("a" + duaNumber + ".mp3");
				    	}
				    }
				}).show();
				break;
			case 5:
				final CharSequence[] items4 = {"???? ????","??????","????? ????????","???? ?????","???? ??????","???? ???????","????? ???? ????","???? ???????","???? ????","???? ?????"};
				AlertDialog.Builder builder4 = new AlertDialog.Builder(this);
				noG = no;
				builder4.setTitle(duaName);
				builder4.setItems(items4, new DialogInterface.OnClickListener() {
				    
					public void onClick(DialogInterface dialog, int item) {
				    	int duaNumber = ((noG*10)+item);
				    	fullname = "a" + duaNumber + ".mp3";
				    	duaNameAfterFinishDownload = duaNamefinal;
				    	duaReader = (String) items4[item];
				    	if(checkFileExistance("a" + duaNumber))
				    	{
				    		//Toast.makeText(getApplicationContext(), duaNumber, Toast.LENGTH_SHORT).show();
				    		Intent intent= new Intent(getBaseContext(), ShiaduaActivity.class);
				    		Bundle bundle = new Bundle();
				    		bundle.putString("duaNumber", "a" + Integer.toString(duaNumber) + ".mp3");
				    		bundle.putString("duaReader", (String) items4[item]);
				    		bundle.putString("duaName", duaNamefinal);
				    		intent.putExtras(bundle);
				    		startActivity(intent);
				    	}
				    	else
				    	{
				    		startDownload("a" + duaNumber + ".mp3");
				    	}
				    }
				}).show();
				break;
			case 6:
				final CharSequence[] items5 = {"???? ??????","???? ???????","????? ????????","???? ?????????","???? ??????","???? ????","???? ??????","???? ????"};
				AlertDialog.Builder builder5 = new AlertDialog.Builder(this);
				noG = no;
				builder5.setTitle(duaName);
				builder5.setItems(items5, new DialogInterface.OnClickListener() {
				    
					public void onClick(DialogInterface dialog, int item) {
				    	int duaNumber = ((noG*10)+item);
				    	fullname = "a" + duaNumber + ".mp3";
				    	duaNameAfterFinishDownload = duaNamefinal;
				    	duaReader = (String) items5[item];
				    	if(checkFileExistance("a" + duaNumber))
				    	{
				    		//Toast.makeText(getApplicationContext(), duaNumber, Toast.LENGTH_SHORT).show();
				    		Intent intent= new Intent(getBaseContext(), ShiaduaActivity.class);
				    		Bundle bundle = new Bundle();
				    		bundle.putString("duaNumber", "a" + Integer.toString(duaNumber) + ".mp3");
				    		bundle.putString("duaReader", (String) items5[item]);
				    		bundle.putString("duaName", duaNamefinal);
				    		intent.putExtras(bundle);
				    		startActivity(intent);
				    	}
				    	else
				    	{
				    		startDownload("a" + duaNumber + ".mp3");
				    	}
				    }
				}).show();
				break;
			case 7:
				final CharSequence[] items6 = {"???? ???????","???? ???????","???? ???????","???? ????","????? ??????"};
				AlertDialog.Builder builder6 = new AlertDialog.Builder(this);
				noG = no;
				builder6.setTitle(duaName);
				builder6.setItems(items6, new DialogInterface.OnClickListener() {
				    
					public void onClick(DialogInterface dialog, int item) {
				    	int duaNumber = ((noG*10)+item);
				    	fullname = "a" + duaNumber + ".mp3";
				    	duaNameAfterFinishDownload = duaNamefinal;
				    	duaReader = (String) items6[item];
				    	if(checkFileExistance("a" + duaNumber))
				    	{
				    		//Toast.makeText(getApplicationContext(), duaNumber, Toast.LENGTH_SHORT).show();
				    		Intent intent= new Intent(getBaseContext(), ShiaduaActivity.class);
				    		Bundle bundle = new Bundle();
				    		bundle.putString("duaNumber", "a" + Integer.toString(duaNumber) + ".mp3");
				    		bundle.putString("duaReader", (String) items6[item]);
				    		bundle.putString("duaName", duaNamefinal);
				    		intent.putExtras(bundle);
				    		startActivity(intent);
				    	}
				    	else
				    	{
				    		startDownload("a" + duaNumber + ".mp3");
				    	}
				    }
				}).show();
				break;
			case 8:
				final CharSequence[] items7 = {"???? ?????","???? ??????","??? ???????","???? ?????????","???? ???????","???? ????"};
				AlertDialog.Builder builder7 = new AlertDialog.Builder(this);
				noG = no;
				builder7.setTitle(duaName);
				builder7.setItems(items7, new DialogInterface.OnClickListener() {
				    
					public void onClick(DialogInterface dialog, int item) {
				    	int duaNumber = ((noG*10)+item);
				    	fullname = "a" + duaNumber + ".mp3";
				    	duaNameAfterFinishDownload = duaNamefinal;
				    	duaReader = (String) items7[item];
				    	if(checkFileExistance("a" + duaNumber))
				    	{
				    		//Toast.makeText(getApplicationContext(), duaNumber, Toast.LENGTH_SHORT).show();
				    		Intent intent= new Intent(getBaseContext(), ShiaduaActivity.class);
				    		Bundle bundle = new Bundle();
				    		bundle.putString("duaNumber", "a" + Integer.toString(duaNumber) + ".mp3");
				    		bundle.putString("duaReader", (String) items7[item]);
				    		bundle.putString("duaName", duaNamefinal);
				    		intent.putExtras(bundle);
				    		startActivity(intent);
				    	}
				    	else
				    	{
				    		startDownload("a" + duaNumber + ".mp3");
				    	}
				    }
				}).show();
				break;
			case 9:
				final CharSequence[] items8 = {"????? ???? ????","???? ???????","????? ????????","???? ?????????","???? ???????","???? ??????","???? ?????"};
				AlertDialog.Builder builder8 = new AlertDialog.Builder(this);
				noG = no;
				builder8.setTitle(duaName);
				builder8.setItems(items8, new DialogInterface.OnClickListener() {
				    
					public void onClick(DialogInterface dialog, int item) {
				    	int duaNumber = ((noG*10)+item);
				    	fullname = "a" + duaNumber + ".mp3";
				    	duaNameAfterFinishDownload = duaNamefinal;
				    	duaReader = (String) items8[item];
				    	if(checkFileExistance("a" + duaNumber))
				    	{
				    		//Toast.makeText(getApplicationContext(), duaNumber, Toast.LENGTH_SHORT).show();
				    		Intent intent= new Intent(getBaseContext(), ShiaduaActivity.class);
				    		Bundle bundle = new Bundle();
				    		bundle.putString("duaNumber", "a" + Integer.toString(duaNumber) + ".mp3");
				    		bundle.putString("duaReader", (String) items8[item]);
				    		bundle.putString("duaName", duaNamefinal);
				    		intent.putExtras(bundle);
				    		startActivity(intent);
				    	}
				    	else
				    	{
				    		startDownload("a" + duaNumber + ".mp3");
				    	}
				    }
				}).show();
				break;
			case 10:
				final CharSequence[] items9 = {"?????","???? ???????","???? ???????"};
				AlertDialog.Builder builder9 = new AlertDialog.Builder(this);
				noG = no;
				builder9.setTitle(duaName);
				builder9.setItems(items9, new DialogInterface.OnClickListener() {
				    
					public void onClick(DialogInterface dialog, int item) {
				    	int duaNumber = ((noG*10)+item);
				    	fullname = "a" + duaNumber + ".mp3";
				    	duaNameAfterFinishDownload = duaNamefinal;
				    	duaReader = (String) items9[item];
				    	if(checkFileExistance("a" + duaNumber))
				    	{
				    		//Toast.makeText(getApplicationContext(), duaNumber, Toast.LENGTH_SHORT).show();
				    		Intent intent= new Intent(getBaseContext(), ShiaduaActivity.class);
				    		Bundle bundle = new Bundle();
				    		bundle.putString("duaNumber", "a" + Integer.toString(duaNumber) + ".mp3");
				    		bundle.putString("duaReader", (String) items9[item]);
				    		bundle.putString("duaName", duaNamefinal);
				    		intent.putExtras(bundle);
				    		startActivity(intent);
				    	}
				    	else
				    	{
				    		startDownload("a" + duaNumber + ".mp3");
				    	}
				    }
				}).show();
				break;
			case 11:
				final CharSequence[] items10 = {"???? ??????","???? ??????","????????? ??????","???? ???????","???? ???????","???? ??????"};
				AlertDialog.Builder builder10 = new AlertDialog.Builder(this);
				noG = no;
				builder10.setTitle(duaName);
				builder10.setItems(items10, new DialogInterface.OnClickListener() {
				    
					public void onClick(DialogInterface dialog, int item) {
				    	int duaNumber = ((noG*10)+item);
				    	fullname = "a" + duaNumber + ".mp3";
				    	duaNameAfterFinishDownload = duaNamefinal;
				    	duaReader = (String) items10[item];
				    	if(checkFileExistance("a" + duaNumber))
				    	{
				    		//Toast.makeText(getApplicationContext(), duaNumber, Toast.LENGTH_SHORT).show();
				    		Intent intent= new Intent(getBaseContext(), ShiaduaActivity.class);
				    		Bundle bundle = new Bundle();
				    		bundle.putString("duaNumber", "a" + Integer.toString(duaNumber) + ".mp3");
				    		bundle.putString("duaReader", (String) items10[item]);
				    		bundle.putString("duaName", duaNamefinal);
				    		intent.putExtras(bundle);
				    		startActivity(intent);
				    	}
				    	else
				    	{
				    		startDownload("a" + duaNumber + ".mp3");
				    	}
				    }
				}).show();
				break;
			case 12:
				final CharSequence[] items11 = {"???? ????","???? ???????","????? ????????","???? ?????????","???? ????","???? ??????","???? ??????","???? ??????"};
				AlertDialog.Builder builder11 = new AlertDialog.Builder(this);
				noG = no;
				builder11.setTitle(duaName);
				builder11.setItems(items11, new DialogInterface.OnClickListener() {
				    
					public void onClick(DialogInterface dialog, int item) {
				    	int duaNumber = ((noG*10)+item);
				    	fullname = "a" + duaNumber + ".mp3";
				    	duaNameAfterFinishDownload = duaNamefinal;
				    	duaReader = (String) items11[item];
				    	if(checkFileExistance("a" + duaNumber))
				    	{
				    		//Toast.makeText(getApplicationContext(), duaNumber, Toast.LENGTH_SHORT).show();
				    		Intent intent= new Intent(getBaseContext(), ShiaduaActivity.class);
				    		Bundle bundle = new Bundle();
				    		bundle.putString("duaNumber", "a" + Integer.toString(duaNumber) + ".mp3");
				    		bundle.putString("duaReader", (String) items11[item]);
				    		bundle.putString("duaName", duaNamefinal);
				    		intent.putExtras(bundle);
				    		startActivity(intent);
				    	}
				    	else
				    	{
				    		startDownload("a" + duaNumber + ".mp3");
				    	}
				    }
				}).show();
				break;
			case 13:
				final CharSequence[] items12 = {"???? ????","???? ???????","???? ????????"};
				AlertDialog.Builder builder12 = new AlertDialog.Builder(this);
				noG = no;
				builder12.setTitle(duaName);
				builder12.setItems(items12, new DialogInterface.OnClickListener() {
				    
					public void onClick(DialogInterface dialog, int item) {
				    	int duaNumber = ((noG*10)+item);
				    	fullname = "a" + duaNumber + ".mp3";
				    	duaNameAfterFinishDownload = duaNamefinal;
				    	duaReader = (String) items12[item];
				    	if(checkFileExistance("a" + duaNumber))
				    	{
				    		//Toast.makeText(getApplicationContext(), duaNumber, Toast.LENGTH_SHORT).show();
				    		Intent intent= new Intent(getBaseContext(), ShiaduaActivity.class);
				    		Bundle bundle = new Bundle();
				    		bundle.putString("duaNumber", "a" + Integer.toString(duaNumber) + ".mp3");
				    		bundle.putString("duaReader", (String) items12[item]);
				    		bundle.putString("duaName", duaNamefinal);
				    		intent.putExtras(bundle);
				    		startActivity(intent);
				    	}
				    	else
				    	{
				    		startDownload("a" + duaNumber + ".mp3");
				    	}
				    }
				}).show();
				break;
			case 14:
				final CharSequence[] items13 = {"???? ??????","???? ???????","????? ????????"};
				AlertDialog.Builder builder13 = new AlertDialog.Builder(this);
				noG = no;
				builder13.setTitle(duaName);
				builder13.setItems(items13, new DialogInterface.OnClickListener() {
				    
					public void onClick(DialogInterface dialog, int item) {
				    	int duaNumber = ((noG*10)+item);
				    	fullname = "a" + duaNumber + ".mp3";
				    	duaNameAfterFinishDownload = duaNamefinal;
				    	duaReader = (String) items13[item];
				    	if(checkFileExistance("a" + duaNumber))
				    	{
				    		//Toast.makeText(getApplicationContext(), duaNumber, Toast.LENGTH_SHORT).show();
				    		Intent intent= new Intent(getBaseContext(), ShiaduaActivity.class);
				    		Bundle bundle = new Bundle();
				    		bundle.putString("duaNumber", "a" + Integer.toString(duaNumber) + ".mp3");
				    		bundle.putString("duaReader", (String) items13[item]);
				    		bundle.putString("duaName", duaNamefinal);
				    		intent.putExtras(bundle);
				    		startActivity(intent);
				    	}
				    	else
				    	{
				    		startDownload("a" + duaNumber + ".mp3");
				    	}
				    }
				}).show();
				break;
			case 15:
				final CharSequence[] items14 = {"???? ??????","???? ???","????? ????????","???? ?????????","???? ??????","???? ????","??? ???","???? ?????????","???? ???????","???? ???????"};
				AlertDialog.Builder builder14 = new AlertDialog.Builder(this);
				noG = no;
				builder14.setTitle(duaName);
				builder14.setItems(items14, new DialogInterface.OnClickListener() {
				    
					public void onClick(DialogInterface dialog, int item) {
				    	int duaNumber = ((noG*10)+item);
				    	fullname = "a" + duaNumber + ".mp3";
				    	duaNameAfterFinishDownload = duaNamefinal;
				    	duaReader = (String) items14[item];
				    	if(checkFileExistance("a" + duaNumber))
				    	{
				    		//Toast.makeText(getApplicationContext(), duaNumber, Toast.LENGTH_SHORT).show();
				    		Intent intent= new Intent(getBaseContext(), ShiaduaActivity.class);
				    		Bundle bundle = new Bundle();
				    		bundle.putString("duaNumber", "a" + Integer.toString(duaNumber) + ".mp3");
				    		bundle.putString("duaReader", (String) items14[item]);
				    		bundle.putString("duaName", duaNamefinal);
				    		intent.putExtras(bundle);
				    		startActivity(intent);
				    	}
				    	else
				    	{
				    		startDownload("a" + duaNumber + ".mp3");
				    	}
				    }
				}).show();
				break;
			case 16:
				final CharSequence[] items15 = {"??? ???????","???? ???????","????????? ?????"};
				AlertDialog.Builder builder15 = new AlertDialog.Builder(this);
				noG = no;
				builder15.setTitle(duaName);
				builder15.setItems(items15, new DialogInterface.OnClickListener() {
				    
					public void onClick(DialogInterface dialog, int item) {
				    	int duaNumber = ((noG*10)+item);
				    	fullname = "a" + duaNumber + ".mp3";
				    	duaNameAfterFinishDownload = duaNamefinal;
				    	duaReader = (String) items15[item];
				    	if(checkFileExistance("a" + duaNumber))
				    	{
				    		//Toast.makeText(getApplicationContext(), duaNumber, Toast.LENGTH_SHORT).show();
				    		Intent intent= new Intent(getBaseContext(), ShiaduaActivity.class);
				    		Bundle bundle = new Bundle();
				    		bundle.putString("duaNumber", "a" + Integer.toString(duaNumber) + ".mp3");
				    		bundle.putString("duaReader", (String) items15[item]);
				    		bundle.putString("duaName", duaNamefinal);
				    		intent.putExtras(bundle);
				    		startActivity(intent);
				    	}
				    	else
				    	{
				    		startDownload("a" + duaNumber + ".mp3");
				    	}
				    }
				}).show();
				break;
		}
	 }
	 
	 public boolean checkFileExistance(String fileName)
	 {
		createDirIfNotExists("/shiaduapro/");

		java.io.File file = new java.io.File("/sdcard/shiaduapro/" , fileName + ".mp3");
 		if(file.exists())
 		{
 			Log.i("true","file exist");
 			return true;
 		}
 		else
 		{
 			Log.i("false","file not exist");
 			return false;
 		}
 		
	 }
	 
	 public boolean createDirIfNotExists(String path) {
		    boolean ret = true;

		    File file = new File(Environment.getExternalStorageDirectory(), path);
		    if (!file.exists()) {
		        if (!file.mkdirs()) {
		            Log.e("TravellerLog :: ", "Problem creating Image folder");
		            ret = false;
		        }
		    }
		    return ret;
		}
	
	 public boolean onCreateOptionsMenu(Menu menu) 
	 {
	 	menu.add(0, 1, 0, "?? ????????");
	     return true;
	 }
	 
	 
	 public boolean onOptionsItemSelected(MenuItem item)
	 {
	     switch (item.getItemId())
	     {
		        case 1:
		        	Intent intent= new Intent(getBaseContext(), about.class);
					startActivity(intent);
		            break;
	     }
	     return false;
	 }
    private void startDownload(String duaNumber) {
        String url = "http://10.20.1.51/"+duaNumber;
        new DownloadFileAsync().execute(url);
        Log.i("1","inside start download");
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
		case DIALOG_DOWNLOAD_PROGRESS:
			mProgressDialog = new ProgressDialog(this);
			mProgressDialog.setMessage("???? ????? ??????");
			mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
			mProgressDialog.setCancelable(false);
			mProgressDialog.show();
			return mProgressDialog;
		default:
			return null;
        }
    }

	class DownloadFileAsync extends AsyncTask<String, String, String> {
		   
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			showDialog(DIALOG_DOWNLOAD_PROGRESS);
		}
	
		@Override
		protected String doInBackground(String... aurl) 
		{
			int count;
	
			try 
			{
				URL url = new URL(aurl[0]);
				URLConnection conexion = url.openConnection();
				conexion.connect();
				int lenghtOfFile = conexion.getContentLength();
				Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);
			
				InputStream input = new BufferedInputStream(url.openStream());
				String[] temp;
				temp = aurl[0].split("/");
				OutputStream output = new FileOutputStream("/sdcard/shiaduapro/" + temp[temp.length-1]);
	
				byte data[] = new byte[1024];
				long total = 0;
				while ((count = input.read(data)) != -1)
				{
					total += count;
					publishProgress(""+(int)((total*100)/lenghtOfFile));
					output.write(data, 0, count);
				}
		
				output.flush();
				output.close();
				input.close();
			} 
			catch (Exception e) 
			{}
			return null;
		}
		protected void onProgressUpdate(String... progress) 
		{
			 //Log.d("ANDRO_ASYNC",progress[0]);
			 mProgressDialog.setProgress(Integer.parseInt(progress[0]));
		}
	
		@Override
		protected void onPostExecute(String unused) {
			dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
			Intent intent= new Intent(getBaseContext(), ShiaduaActivity.class);
			Bundle bundle = new Bundle();
			bundle.putString("duaNumber", fullname);
			bundle.putString("duaReader", duaReader);
			bundle.putString("duaName", duaNameAfterFinishDownload);
			//Log.e("duaNameAfterFinishDownload",""+duaNameAfterFinishDownload);
			intent.putExtras(bundle);
			startActivity(intent);
		}
	}
}