package org.concordiashanghai.chapter12.fortuneteller;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	ArrayList<String> fortunes = new ArrayList<String>();
	TextView fortune;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		fortune = (TextView) findViewById(R.id.fortuneText);
		Button button = (Button) findViewById(R.id.fortuneButton);
		
		fortunes.add("Yes");
	    fortunes.add("No");
	    fortunes.add("Maybe So");
	    fortunes.add("What do you think?");
	    fortunes.add("Tomorrow will never come...");
	    fortunes.add("Brightness is in your future");
	    fortunes.add("Your dreams will come true :D");
	    fortunes.add("Ask again later");
	    
	    button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				 String s = fortunes.get( (int) (Math.random() * fortunes.size()) );
				 
				 fortune.setText(s);
				
			}
		} ) ; // end of line
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
