package hassassin.com.viewexamples;

import android.app.Notification;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

/**
 * Created by mac on 02/06/15.
 */
public class TabAdapter extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabhost_ex);

        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);

        TabSpec tab1 = tabHost.newTabSpec("First Tab");
        TabSpec tab2 = tabHost.newTabSpec("Second Tab");
        TabSpec tab3 = tabHost.newTabSpec("Third Tab");

        //Asignar el nombre del Tab al Activity
        tab1.setIndicator("Calls");
        tab1.setContent(new Intent(this, TabActivity1.class));

        tab2.setIndicator("Messages");
        tab2.setContent(new Intent(this, TabActivity2.class));

        tab3.setIndicator("Publications");
        tab3.setContent(new Intent(this, TabActivity3.class));

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);

    }
}
