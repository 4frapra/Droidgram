package com.teamedge.android.droidgram000;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int numberLikes = 0;

    /**
     * This method displays the likes on the screen.
     */
    private void displayLikes(int number) {
        TextView likesTextView = (TextView) findViewById(R.id.likes_text_view);
        likesTextView.setText("" + number);
    }

    public void increase(View view) {
        numberLikes++;
        displayLikes(numberLikes);
    }

    public void decrease(View view) {
        if(numberLikes <= 0) {
            return ;
        }
        numberLikes--;
        displayLikes(numberLikes);
    }
}
