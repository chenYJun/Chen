package com.chen;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import org.w3c.dom.Text;


public class WelcomeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        SharedPreferences mPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mPreferences.edit().putBoolean("fullScreen", false).commit() ;
        setContentView(R.layout.activity_welcome);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_wel, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
      /*  switch (item.getItemId()) {
            case R.id.action_settings :
                Toast toast = Toast.makeText(getApplicationContext(), "settings1", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                Log.d("LogMenu", "settings1");
                break;
            case R.id.action_settings2:
                Toast.makeText(getApplicationContext(), "settings2", Toast.LENGTH_SHORT).show();
                Log.d("Logmenu", "settings2");
                break;

        }*/

        return super.onOptionsItemSelected(item);
    }

}
