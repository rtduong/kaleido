package edu.uw.rtduong.kaleido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class SmoothieActivity extends AppCompatActivity {

    private static final String TAG = "SmoothieActivity";

    private ImageButton nextPage;
    private ImageButton backPage;
    private ImageView imPicture;
    private Button btnChoiceOne;
    private Button btnChoiceTwo;
    private TextView txtSwitcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smoothie);

        nextPage = (ImageButton) this.findViewById(R.id.nextPage);
        backPage = (ImageButton) this.findViewById(R.id.backPage);
        imPicture = (ImageView) this.findViewById(R.id.isPictureId);
        btnChoiceOne = (Button) this.findViewById(R.id.choiceOne);
        btnChoiceTwo = (Button) this.findViewById(R.id.choiceTwo);
        txtSwitcher = (TextView) this.findViewById(R.id.textSwitcher);

        pageOne();
    }

    private void pageOne() {
        imPicture.setImageResource(R.drawable.house_scene);
        txtSwitcher.setText("You and your friends, Bridgette and Will, are going over to Will's house after school. \"Welcome to my house, let's go inside!\", exclaimed Will.");

        backPage.setVisibility(View.INVISIBLE);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageThirteen();
            }
        });
    }

    private void pageTwo() {
        imPicture.setImageResource(R.drawable.captain_cold);
        txtSwitcher.setText("Will takes off his shoes at the door and sets them to the side. Bridgette has not taken off her shoes yet. What do you want to do?");

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
        txtSwitcher.setText("\"Can you guys take off your shoes?\", asks Will angrily.");

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
        txtSwitcher.setText("Bridgette is very puzzled, \"What? Why? We don't do that at my house!\"");

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
        txtSwitcher.setText("\"It's viewed as disrespectful in Asian cultures and it keeps the house a lot cleaner.\", explains Will. \"Oh! That makes sense.\" Bridgette takes off her shoes.");

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
        txtSwitcher.setText("\"Hey, do you guys want to play some basketball?\", Will asks. \"Sure! Let's go outside and play!\", you exclaim.");

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
        txtSwitcher.setText("\"You kids must be tired! Do you want a smoothie?\", asks Will's dad. \"YES!\", the children all yell excitedly");

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
        txtSwitcher.setText("\"You kids can pick a fruit and let me know what you want.\", says Will's dad. \"Let's go into the kitchen to see what fruit there are!\", says Will as he leads the other kids back inside his house.");

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
        txtSwitcher.setText("\"There are so many fruits to choose from!\" \"What kind of smoothie do you guys want?\"");

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
        txtSwitcher.setText(" \"I want strawberry!\", says Bridgette. \"No! I want lychee!\", exclaims Will. \"Ew! What is that? It looks gross. Yuck! Is that from China or something?\", says Bridgette." +
                "\"It's not gross! Have you tried before?\", replies Will angrily. \"Guys stop fighting, it's just a smoothie!\", you shout.");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageThirteen();
            }
        });
    }

    private void pageThirteen() {
        imPicture.setImageResource(R.drawable.will_fat);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText(" \"No!\" yells Will as he runs to his room.");

        backPage.setVisibility(View.VISIBLE);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageFourteen();
            }
        });
    }

    private void pageFourteen() {
        imPicture.setImageResource(R.drawable.will_fat);
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
        imPicture.setImageResource(R.drawable.will_fat);
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
                talkToBridgette();
            }
        });
    }

    private void talkToWill() {
        imPicture.setImageResource(R.drawable.will_sad);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        nextPage.setVisibility(View.VISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText("You go inside of Will's room to talk to him. \n\"Can you believe what she said about my fruit? I’m really hurt!\" yelled Will.");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageFifteen();
            }
        });
    }

    private void talkToBridgette() {
        imPicture.setImageResource(R.drawable.racist);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        nextPage.setVisibility(View.VISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText("You go sit next to Bridgette in the kitchen.\n \"I don’t understand why Will is so upset. Lychee is a weird fruit!\" yelled Bridgette.");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageFifteen();
            }
        });
    }

}
