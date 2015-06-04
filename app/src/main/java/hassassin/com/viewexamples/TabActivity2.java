package hassassin.com.viewexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

/**
 * Created by mac on 02/06/15.
 */
public class TabActivity2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv2 = new TextView(this);
        tv2.setTextSize(25);
        tv2.setGravity(Gravity.CENTER);
        tv2.setText("This is Tab2 Activity");
        setContentView(tv2);
    }
}
