package hassassin.com.viewexamples;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MotionEvent;
import android.widget.ViewFlipper;

/**
 * Created by mac on 03/06/15.
 */
public class ViewFlipAdapter extends ActionBarActivity {

    private ViewFlipper viewFlipper;
    private float lastX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_flipper);

        viewFlipper = (ViewFlipper) findViewById(R.id.vf_jaripeo);
    }

    @Override
    public boolean onTouchEvent(MotionEvent touchEvent) {

        switch(touchEvent.getAction()){

            //When use the first touch the screen to swap
            case MotionEvent.ACTION_DOWN:{

                lastX = touchEvent.getX();
                break;
            }
            case MotionEvent.ACTION_UP:{
                float currentX = touchEvent.getX();

                //If left to right swipe on screen
                if(lastX < currentX){
                    // if no more view/ child to flip
                    if(viewFlipper.getDisplayedChild() == 0){
                        break;
                    }
                    // Set the required Animation type to ViewFlipper
                    // The next screen will come in form left and current Screen will go OUT frome left
                    viewFlipper.setInAnimation(this, R.anim.slide_in_from_left);
                    viewFlipper.setOutAnimation(this, R.anim.slide_out_to_right);

                    //Show the next Screen
                    viewFlipper.showNext();
                }
                // if right to left swipe on screen
                if(lastX > currentX){
                    if(viewFlipper.getDisplayedChild() == 1){
                        break;
                    }
                    // Set the required Animation to ViewFliper
                    // The next screen will come in from Right and current Screen will go OUT from Left

                    viewFlipper.setInAnimation(this, R.anim.slide_in_from_right);
                    viewFlipper.setOutAnimation(this, R.anim.slide_out_to_left);

                    // Show the previous Screen
                    viewFlipper.showPrevious();
                }
                break;
            }

        }
            return false;
    }
}
