package com.example.abstractclassesandinterfaces;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/* created by learnovate */
public class AbstractionActivity extends Activity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_abstraction);

        Fan myFan = new Fan();
        Light myLight = new Light();

        myFan.breakDevice();
        myLight.breakDevice();

        Switch mySwitch = new Switch();

        mySwitch.wireUP(myFan);
        mySwitch.wireUP(myLight);

        mySwitch.flipSwitchUp();
        mySwitch.flipSwitchDown();

        //mySwitch.unWire(myFan);
        mySwitch.wireDown(myFan);

        mySwitch.flipSwitchUp();
        mySwitch.flipSwitchDown();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // inflate the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.abstraction,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item click here. the action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
