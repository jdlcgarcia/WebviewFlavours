package creative.androidapp.webviewflavours;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class WarOfTheWorlds extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_war_of_the_worlds);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.war_of_the_worlds, menu);
		return true;
	}

}
