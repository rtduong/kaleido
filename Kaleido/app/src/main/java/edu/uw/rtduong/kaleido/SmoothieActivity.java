package edu.uw.rtduong.kaleido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SmoothieActivity extends AppCompatActivity {

    private static final String TAG = "SmoothieActivity";

    private Button nextPage;
    private ImageView imPicture;
    private Button btnChoiceOne;
    private Button btnChoiceTwo;
    private TextView txtSwitcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smoothie);

        nextPage = (Button) this.findViewById(R.id.nextPage);
        imPicture = (ImageView) this.findViewById(R.id.isPictureId);
        btnChoiceOne = (Button) this.findViewById(R.id.choiceOne);
        btnChoiceTwo = (Button) this.findViewById(R.id.choiceTwo);
        txtSwitcher = (TextView) this.findViewById(R.id.textSwitcher);

        pageOne();
    }

    private void pageOne() {
        imPicture.setImageResource(R.drawable.flash_poster);
        txtSwitcher.setText("\"Welcome to my house!\", exclaimed Will");

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
        txtSwitcher.setText("\"Come inside!\" Will takes off his shoes and sets them to the side. Bridgette has not taken off her shoes yet. What do you want to do?");

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
        nextPage.setVisibility(View.INVISIBLE);
        btnChoiceOne.setText("Take Off");
        btnChoiceTwo.setVisibility(View.VISIBLE);
        btnChoiceTwo.setText("Don't take off");

        btnChoiceOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Choice one button clicked");
                takeOffShoesPage();
            }
        });

        btnChoiceTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Choice two button clicked");
                dontTakeOffPage();
            }
        });
    }

    private void takeOffShoesPage() {
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        nextPage.setVisibility(View.VISIBLE);
        txtSwitcher.setText("You choose to take off your shoes! You also tell Bridgette to take off her shoes.");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageFive();
            }
        });

    }

    private void dontTakeOffPage() {
        imPicture.setImageResource(R.drawable.buds);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        nextPage.setVisibility(View.VISIBLE);
        txtSwitcher.setText("\"Can you guys take off your shoes!?\", asks Will angrily");

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
        txtSwitcher.setText("Bridgette is very puzzled. \"What? Why? We don't do that at my house.\"");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageSix();
            }
        });
    }

    private void pageSix() {
        imPicture.setImageResource(R.drawable.mad_kid);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText("\"Well it's viewed as disrespectful in Asian culture and it keeps the house a lot cleaner!\" explains Will. \"Oh! That makes sense.\" Bridgette takes off her shoes.");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageSeven();
            }
        });
    }

    private void pageSeven() {
        imPicture.setImageResource(R.drawable.mad_kid);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText("\"Hey guys want to play some basketball?\", Will asks. \"Sure! Let's go outside and play!\", you exclaim.");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageEight();
            }
        });
    }

    private void pageEight() {
        imPicture.setImageResource(R.drawable.mad_kid);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText("\"Pass the ball!\" \"Nice shot!\" \"Let's play horse!\"");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageNine();
            }
        });
    }

    private void pageNine() {
        imPicture.setImageResource(R.drawable.mad_kid);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText("\"Hey kids, you guys must be tired! Do you want a smoothie?\", asks Will's dad. \"YESSSSS!\"");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageTen();
            }
        });
    }

    private void pageTen() {
        imPicture.setImageResource(R.drawable.mad_kid);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText("\"Why don't you guys pick a fruit and let me know what you want.\" \"Let's go into the kitchen to see what fruit there are!\"");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageEleven();
            }
        });
    }

    private void pageEleven() {
        imPicture.setImageResource(R.drawable.mad_kid);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText("\"So many fruits to choose from!\" \"What do you guys want?\"");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageTwelve();
            }
        });
    }

    private void pageTwelve() {
        imPicture.setImageResource(R.drawable.mad_kid);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText(" \"I want strawberries!\" \"No! I want lychee!\" \"Ew! What is that? It looks gross. Yuck! Is that from China or something?\"" +
                "\"It's not yuck! Have you tried before?\" \"Guys stop fighting, it's just a smoothie!\", you shout.");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageThirteen();
            }
        });
    }

    private void pageThirteen() {
        imPicture.setImageResource(R.drawable.mad_kid);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText(" \"No!\" yells Will and he runs to his room.");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageFourteen();
            }
        });
    }

    private void pageFourteen() {
        imPicture.setImageResource(R.drawable.mad_kid);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText("Your friends are mad at each other. What do you want to do?");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageFifteen();
            }
        });
    }

    private void pageFifteen() {
        imPicture.setImageResource(R.drawable.captain_cold);
        txtSwitcher.setVisibility(View.INVISIBLE);
        btnChoiceOne.setVisibility(View.VISIBLE);
        nextPage.setVisibility(View.INVISIBLE);
        btnChoiceOne.setText("Talk to Will?");
        btnChoiceTwo.setVisibility(View.VISIBLE);
        btnChoiceTwo.setText("Talk to Bridgette?");

        btnChoiceOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Choice one button clicked");
                talkToWill();
            }
        });

        btnChoiceTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Choice two button clicked");
                //dontTakeOffPage();
            }
        });
    }

    private void talkToWill() {
        imPicture.setImageResource(R.drawable.mad_kid);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText("\"Hey Will, are you upset?\" \"Of course I am. Can you believe what she said about my fruit? I'm hurt!\"");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageFifteen();
            }
        });
    }


}
