package edu.uw.rtduong.kaleido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    private static final String TAG = "SettingsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Log.v(TAG, "Activity Started");

        final Button btnPlay = (Button) this.findViewById(R.id.btnAboutId);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Play button clicked");
                Intent i = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(i);
            }
        });

    }
}
