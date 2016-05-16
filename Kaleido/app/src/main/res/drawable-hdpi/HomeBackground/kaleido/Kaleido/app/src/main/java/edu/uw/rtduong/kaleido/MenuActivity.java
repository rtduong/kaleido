package edu.uw.rtduong.kaleido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {


    private static final String TAG = "MenuActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Log.v(TAG, "Activity Started");

        final Button btnPlay = (Button) this.findViewById(R.id.btnPlayId);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Play button clicked");
                Intent i = new Intent(getApplicationContext(), SelectStoryActivity.class);
                startActivity(i);
            }
        });

        final Button btnSettings = (Button) this.findViewById(R.id.btnSettingsId);
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Settings button clicked");
                Intent i = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(i);
            }
        });

        final Button btnProfile = (Button) this.findViewById(R.id.btnProfileId);
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Profile button clicked");
//                Intent i = new Intent(getApplicationContext(), SettingsActivity.class);
//                startActivity(i);
            }
        });

    }
}
