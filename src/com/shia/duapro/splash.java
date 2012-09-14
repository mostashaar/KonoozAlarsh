package com.shia.duapro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class splash extends Activity {

	private Thread mSplashThread;    

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Splash screen view
        setContentView(R.layout.splash);

        
        final splash sPlashScreen = this;   
        
        // The thread to wait for splash screen events
        mSplashThread =  new Thread(){
            @Override
            public void run(){
                try {
                    synchronized(this){
                        // Wait given period of time or exit on touch
                        wait(5000);
                    }
                }
                catch(InterruptedException ex){                    
                }

                finish();
                
                // Run next activity
                Intent intent = new Intent();
                intent.setClass(sPlashScreen, MainMenu.class);
                startActivity(intent);
                //stop();                    
            }
        };
        
        mSplashThread.start();        
    }
        
    /**
     * Processes splash screen touch events
     */
    
    @Override
    public boolean onTouchEvent(MotionEvent evt)
    {
        if(evt.getAction() == MotionEvent.ACTION_DOWN)
        {
            synchronized(mSplashThread){
                mSplashThread.notifyAll();
            }
        }
        return true;
    }    
	
}