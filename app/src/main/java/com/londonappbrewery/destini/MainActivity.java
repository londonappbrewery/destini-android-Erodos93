package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button mbuttonTop;
    private Button mbuttonBotton;
    private TextView mstoryTextView;
    private int mStoryIndexView = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mbuttonTop = (Button) findViewById(R.id.buttonTop);
        mbuttonBotton = (Button) findViewById(R.id.buttonBottom);
        mstoryTextView = (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:


        mbuttonTop.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if (mStoryIndexView == 1 || mStoryIndexView == 2) {
                    mstoryTextView.setText(R.string.T3_Story);
                    mbuttonTop.setText(R.string.T3_Ans1);
                    mbuttonBotton.setText(R.string.T3_Ans2);
                    mStoryIndexView = 3;
                } else if (mStoryIndexView == 3) {
                    mstoryTextView.setText(R.string.T6_End);
                    mbuttonBotton.setVisibility(View.GONE);
                    mbuttonTop.setVisibility(View.GONE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mbuttonBotton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if (mStoryIndexView == 1) {
                    mstoryTextView.setText(R.string.T2_Story);
                    mbuttonTop.setText(R.string.T2_Ans1);
                    mbuttonBotton.setText(R.string.T2_Ans2);
                    mStoryIndexView = 2;
                } else if (mStoryIndexView == 2) {
                    mstoryTextView.setText(R.string.T4_End);
                    mbuttonBotton.setVisibility(View.GONE);
                    mbuttonTop.setVisibility(View.GONE);
                } else {
                    mstoryTextView.setText(R.string.T5_End);
                    mbuttonBotton.setVisibility(View.GONE);
                    mbuttonTop.setVisibility(View.GONE);
                }
            }
        });

    }


}
