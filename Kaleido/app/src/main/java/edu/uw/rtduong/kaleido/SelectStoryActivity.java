package edu.uw.rtduong.kaleido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SelectStoryActivity extends AppCompatActivity {

    private static final String TAG = "SelectStoryActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_story);

        Log.v(TAG, "Activity Started");

        final ImageButton iBtnStoryOne = (ImageButton) this.findViewById(R.id.StoryOneId);
        iBtnStoryOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Story One button clicked");
                Intent i = new Intent(getApplicationContext(), StoryActivity.class);
                startActivity(i);
            }
        });

        final ImageButton iBtnStoryTwo = (ImageButton) this.findViewById(R.id.StoryTwoId);
        iBtnStoryTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Story Two button clicked");
                Intent i = new Intent(getApplicationContext(), SmoothieActivity.class);
                startActivity(i);
            }
        });

        final ImageButton iBtnStoryThree = (ImageButton) this.findViewById(R.id.StoryThreeId);
        iBtnStoryThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Story Three button clicked");
//                Intent i = new Intent(getApplicationContext(), SettingsActivity.class);
//                startActivity(i);
            }
        });

        final Button btnBack = (Button) this.findViewById(R.id.btnBackId);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Back button clicked");
//                Intent i = new Intent(getApplicationContext(), SettingsActivity.class);
//                startActivity(i);
            }
        });
    }
}
