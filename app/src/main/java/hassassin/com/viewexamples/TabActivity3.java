package hassassin.com.viewexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

/**
 * Created by mac on 02/06/15.
 */
public class TabActivity3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv3 = new TextView(this);
        tv3.setTextSize(25);
        tv3.setGravity(Gravity.CENTER_VERTICAL);
        tv3.setText("This is Tab3 Activity");
        setContentView(tv3);
    }
}
