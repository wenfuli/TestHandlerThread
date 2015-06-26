package com.gamingshow.testhandlerthread;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * This Demo is about android handler Test,
 * recently we run IntentService and Handler obj at onHandleIntent method.
 * and then we get handler obj call postRunDelay method while the runnable isn't execute.
 *
 * we find that is we use 'new Hanlder（)‘  but not 'new Handler(Looper.getMainLooper())'.
 *
 * how that is working ?
 * now we use a instance explain
 *
 */
public class GamingShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaming_show);
        MyIntentService.startActionFoo(this,null,null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_gaming_show, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
