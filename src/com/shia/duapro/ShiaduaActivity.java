package com.shia.duapro;



import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;


public class ShiaduaActivity extends Activity implements Runnable  {
    /** Called when the activity is first created. */

	private ImageView pausePlay;
	private SeekBar mSeekBar;
	private MediaPlayer mPlayer = new MediaPlayer();
	private TextView mText;
	private TextView totalTime;
	private TextView currentTime;
	private int duaString;
	private NotificationManager nm;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }
    @Override
    public void onStart()
    {
        super.onStart();

        Bundle bundle = this.getIntent().getExtras();
		String duaNumber = bundle.getString("duaNumber");
		String duaName = bundle.getString("duaName");
		String duaReader = bundle.getString("duaReader");
		Log.e("duaNumber",""+duaNumber);
		String newString = duaNumber;
		newString = stripNonDigits(duaNumber);
		duaString = Integer.parseInt( newString );
		duaString /= 100; 
		//Log.e("duaString",""+duaString+" "+newString);
		startNotif(duaName, duaReader);
		try
        {
	        //int id = R.raw.class.getField("a" + duaNumber).getInt(0);
			//mPlayer = MediaPlayer.create(this,id);
			mPlayer.setDataSource("/sdcard/shiaduapro/" + duaNumber);
			mPlayer.prepare();
	        pausePlay = (ImageView) findViewById(R.id.pausePlay);
	        mSeekBar = (SeekBar) findViewById(R.id.seekBar1);
	        mText = (TextView) findViewById(R.id.tv);
	        totalTime = (TextView) findViewById(R.id.textView2);
	        currentTime = (TextView) findViewById(R.id.textView1);
	        mSeekBar.setProgress(0);
        	mPlayer.start();
        }
		catch(Exception e)
		{
			Log.e("error",e.toString());
		}
		int text;
		try 
		{
			text = R.string.class.getField("a" + duaString).getInt(0);
			mText.setText(text);
			mText.setTextSize((float)23.0);
			mText.setMovementMethod(new ScrollingMovementMethod());
		} 
		catch (IllegalArgumentException e) 
		{
			
			e.printStackTrace();
		} 
		catch (SecurityException e)
		{
			
			e.printStackTrace();
		} 
		catch (IllegalAccessException e) 
		{
			
			e.printStackTrace();
		} 
		catch (NoSuchFieldException e)
		{
			
			e.printStackTrace();
		}
    	
        pausePlay.setOnClickListener(new Button.OnClickListener()
	    {

			public void onClick(View arg0)
			{
				if(mPlayer.isPlaying())
				{
					mPlayer.pause();
					pausePlay.setImageResource(R.drawable.play);
				}
				else
				{
					mPlayer.start();
					pausePlay.setImageResource(R.drawable.pause);
				}
			}
	    }); 
        
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

    		public void onStopTrackingTouch(SeekBar seekBar) {

    		}

    		public void onStartTrackingTouch(SeekBar seekBar) {
    			

    		}

    		public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
    			
    			if(fromUser){
    				mPlayer.seekTo(progress);
    				mSeekBar.setProgress(progress);
    			}
    		}
    	});
        
        Thread currentThread  = new Thread(this);
    	currentThread.start();
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
    	menu.add(0, 1, 0, "Œÿ ﬂ»Ì—");
    	menu.add(0, 2, 0, "Œÿ „ Ê”ÿ");
    	menu.add(0, 3, 0, "Œÿ ’€Ì—");
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
	        case 1:
	    		mText.setTextSize((float)31.0);
	            break;
	        case 2: 
	        	mText.setTextSize((float)27.0);
	            break;
	        case 3: 
	        	mText.setTextSize((float)23.0);
	            break;
        }
        return false;
    }

	public void run() 
	{
		int currentPosition = 0;
        int total = mPlayer.getDuration();
        int mSeconds, mMinutes, mHours;
        int seconds = (int) (total / 1000) % 60 ;
        int minutes = (int) ((total / (1000*60)) % 60);
        int hours   = (int) ((total / (1000*60*60)) % 24);
        totalTime.setText(String.format("%d:%02d:%02d", hours, minutes, seconds));
        mSeekBar.setMax(total);
        while(mPlayer != null && currentPosition < total )
        {
			try 
			{
				currentPosition = mPlayer.getCurrentPosition();
		        mSeconds = (int) (currentPosition / 1000) % 60 ;
		        mMinutes = (int) ((currentPosition / (1000*60)) % 60);
		        mHours   = (int) ((currentPosition / (1000*60*60)) % 24);
				Message msg = new Message();
		        String currentTime = String.format("%d:%02d:%02d", mHours, mMinutes, mSeconds);
		        msg.obj = currentTime;
		        mHandler.sendMessage(msg);
				Thread.sleep(1000);

			} 
			catch (InterruptedException e)
			{
				Log.e("error",e.toString());
				return;
			}
			catch (Exception ex)
			{
				Log.e("error",ex.toString());
	            return;
			}
			mSeekBar.setProgress(currentPosition);
			
        }
	}
	Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) 
        {
			String text = (String)msg.obj;
			currentTime.setText(text);
        }
	};

	@Override
	public void onBackPressed() {
		
		super.onBackPressed();
		if(mPlayer != null)
		{
			mPlayer.release();
			mPlayer = null;
		}
		nm.cancel(R.string.hello);

	}
	
	void startNotif(String duaName,String duaReader)
	{
		nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

        // The details of our fake message
        CharSequence from = "ﬂ‰Ê“ «·⁄—‘";
        CharSequence message = duaName + " »’Ê  " + duaReader;

        Intent intent= new Intent(this, ShiaduaActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP);

        // The PendingIntent to launch our activity if the user selects this notification
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, intent, 0);

        
        // The ticker text, this uses a formatted string so our message could be localized
        String tickerText = duaName + " »’Ê  " + duaReader;

        // construct the Notification object.
        Notification notif = new Notification(R.drawable.icon, tickerText,System.currentTimeMillis());
        notif.flags = Notification.FLAG_ONGOING_EVENT;

        // Set the info for the views that show in the notification panel.
        notif.setLatestEventInfo(this, from, message, contentIntent);


        nm.notify(R.string.hello, notif);
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onDestroy()
	 */
	@Override
	protected void onDestroy() {
		
		super.onDestroy();
		nm.cancel(R.string.hello);
	}
	public static String stripNonDigits(final String input){
	    final StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < input.length(); i++){
	        final char c = input.charAt(i);
	        if(c > 47 && c < 58){
	            sb.append(c);
	        }
	    }
	    return sb.toString();
	}

	
}