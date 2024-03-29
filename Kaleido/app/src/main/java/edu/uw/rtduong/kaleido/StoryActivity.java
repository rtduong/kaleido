package edu.uw.rtduong.kaleido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {

    private static final String TAG = "StoryActivity";

    private Button nextPage;
    private ImageView imPicture;
    private Button btnChoiceOne;
    private Button btnChoiceTwo;
    private TextView txtSwitcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Log.v(TAG, "Activity Started");

        nextPage = (Button) this.findViewById(R.id.nextPage);
        imPicture = (ImageView) this.findViewById(R.id.isPictureId);
        btnChoiceOne = (Button) this.findViewById(R.id.choiceOne);
        btnChoiceTwo = (Button) this.findViewById(R.id.choiceTwo);
        txtSwitcher = (TextView) this.findViewById(R.id.textSwitcher);

        pageOne();
    }

    private void pageOne() {
        imPicture.setImageResource(R.drawable.flash_poster);
        txtSwitcher.setText("This is the beginning of the story. The Flash is the fastest man alive. He's pretty cool.");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageTwo();
            }
        });
    }

    private void pageTwo() {
        imPicture.setImageResource(R.drawable.captain_cold);
        txtSwitcher.setText("Sometimes he gets in fights with his enemy, Captain Cold. Should the Flash fight him or try to peacefully work out their differences?");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageThree();
            }
        });
    }

    private void pageThree() {
        imPicture.setImageResource(R.drawable.captain_cold);
        txtSwitcher.setVisibility(View.INVISIBLE);
        btnChoiceOne.setVisibility(View.VISIBLE);
        btnChoiceOne.setText("Fight");
        btnChoiceTwo.setVisibility(View.VISIBLE);
        btnChoiceTwo.setText("Talk it out");

        btnChoiceOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Choice one button clicked");
//                pageThree();
            }
        });

        btnChoiceTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Choice two button clicked");
                pageFour();
            }
        });

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.v(TAG, "Next page button clicked");
//                pageThree();
            }
        });
    }

    private void pageFour() {
        imPicture.setImageResource(R.drawable.buds);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText("Yay, they are all friends now! Good choice!");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageFive();
            }
        });
    }

    private void pageFive() {
        imPicture.setImageResource(R.drawable.mad_kid);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText("Here is a picture that will be in our actual story about a disagreement about smoothies!");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                Intent i = new Intent(getApplicationContext(), SelectStoryActivity.class);
                startActivity(i);
            }
        });
    }
}
