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
    private Button btnChoiceA;
    private Button btnChoiceB;
    private Button btnChoiceC;

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
        btnChoiceA = (Button) this.findViewById(R.id.choiceA);
        btnChoiceB = (Button) this.findViewById(R.id.choiceB);
        btnChoiceC = (Button) this.findViewById(R.id.choiceC);

        pageOne();
    }

    private void pageOne() {
        imPicture.setImageResource(R.drawable.house_scene);
        txtSwitcher.setText("It’s a bright sunny day outside and after a long day at school, you and " +
                "your best friends, Will and Bridgette decide to spend the afternoon at Will’s house. " +
                "We made it!\", exclaimed Will as they neared his " +
                "house. \"Come in!\"");

        backPage.setVisibility(View.INVISIBLE);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageTwo();
            }
        });
    }

    private void pageTwo() {
        imPicture.setImageResource(R.drawable.capstone2);
        txtSwitcher.setText("They opened the door and you notice that Will takes off his shoes before" +
                " he walks down the hallway. Bridgette on the other hand keeps her shoes on and " +
                "follows Will in.\n" +
                "What do you do now?");

        backPage.setVisibility(View.VISIBLE);

        backPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Back page button clicked");
                pageOne();
            }
        });

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageThree();
            }
        });
    }

    private void pageThree() {
        imPicture.setImageResource(R.drawable.capstone2);
        txtSwitcher.setVisibility(View.INVISIBLE);

        btnChoiceA.setVisibility(View.VISIBLE);
        btnChoiceA.setText("Take off shoes, Will took his off");
        btnChoiceB.setVisibility(View.VISIBLE);
        btnChoiceB.setText("Keep shoes on, Bridgette kept hers on");
        btnChoiceC.setVisibility(View.VISIBLE);
        btnChoiceC.setText("Take off shoes and tell Bridgette to take hers off too");

        backPage.setVisibility(View.INVISIBLE);
        nextPage.setVisibility(View.INVISIBLE);

        btnChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Choice A button clicked");
                pageFourChoiceA();
            }
        });

        btnChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Choice B button clicked");
                pageFourChoiceB();
            }
        });

        btnChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Choice C button clicked");
                pageFourChoiceC();
            }
        });
    }

    private void pageFourChoiceA() {
        imPicture.setImageResource(R.drawable.capstone3);
        btnChoiceA.setVisibility(View.INVISIBLE);
        btnChoiceB.setVisibility(View.INVISIBLE);
        btnChoiceC.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        nextPage.setVisibility(View.VISIBLE);

        txtSwitcher.setText("Will looks down at your feet and notices that Bridgette kept her shoes " +
                "on. He seems uncomfortable. “Oh, hey Bridgette, can you take your shoes off?”");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageFourChoiceC();
            }
        });

    }

    private void pageFourChoiceB() {
        imPicture.setImageResource(R.drawable.capstone3);
        btnChoiceA.setVisibility(View.INVISIBLE);
        btnChoiceB.setVisibility(View.INVISIBLE);
        btnChoiceC.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        nextPage.setVisibility(View.VISIBLE);

        txtSwitcher.setText("Will looks down at your feet and notices that you and Bridgette kept your shoes " +
                "on. He seems uncomfortable. “Oh, hey guys, can you take your shoes off?”");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageFourChoiceC();
            }
        });
    }

    private void pageFourChoiceC() {
        imPicture.setImageResource(R.drawable.capstone4);
        btnChoiceA.setVisibility(View.INVISIBLE);
        btnChoiceB.setVisibility(View.INVISIBLE);
        btnChoiceC.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        nextPage.setVisibility(View.VISIBLE);

        txtSwitcher.setText("Bridgette looks surprised, “What why do I need to take off my shoes? " +
                "We don’t do that at my house”");

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageFive();
            }
        });
    }

    private void pageFive() {
        imPicture.setImageResource(R.drawable.capstone5);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        backPage.setVisibility(View.VISIBLE);

        txtSwitcher.setText("\"It keeps the house a lot cleaner, my parents and grandparents have " +
                "always told me to take my shoes off. It’s the Asian culture”, explains Will. Bridgette" +
                " nods and respectfully slips off her shoes.");

        backPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Back page button clicked");
                pageFourChoiceC();
            }
        });

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
        backPage.setVisibility(View.VISIBLE);

        txtSwitcher.setText("Bridgette looks outside at the sunny weather." +
                "“It’s so nice! What do you guys want to do? Want to play basketball?” " +
                "Will lights up, he loves basketball. " +
                "“Sure! Let’s go play basketball outside. What do you think?");

        backPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageFive();
            }
        });

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
        btnChoiceA.setVisibility(View.VISIBLE);
        btnChoiceB.setVisibility(View.VISIBLE);
        btnChoiceC.setVisibility(View.VISIBLE);

        txtSwitcher.setVisibility(View.INVISIBLE);
        nextPage.setVisibility(View.INVISIBLE);

        btnChoiceA.setText("Oh, let's play HORSE!");
        btnChoiceB.setText("YES!");
        btnChoiceC.setText("Let play two on one!");

        backPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageSix();
            }
        });

        btnChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Choice A button clicked");
                pageEight();
            }
        });

        btnChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Choice B button clicked");
                pageEight();
            }
        });

        btnChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Choice C button clicked");
                pageEight();
            }
        });
    }

    private void pageEight() {
        imPicture.setImageResource(R.drawable.capstone7);
        btnChoiceA.setVisibility(View.INVISIBLE);
        btnChoiceB.setVisibility(View.INVISIBLE);
        btnChoiceC.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText("A couple of hours later, Will’s dad, Mr. Liu, opens the door, “Hey kids! You all must be very tired, do you want to drink a smoothie?” " +
                "Will wipes off his sweat with bright eyes, “That sound’s amazing!”");

        nextPage.setVisibility(View.VISIBLE);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageNine();
            }
        });
    }

    private void pageNine() {
        imPicture.setImageResource(R.drawable.capstone7);
        btnChoiceA.setVisibility(View.INVISIBLE);
        btnChoiceB.setVisibility(View.INVISIBLE);
        btnChoiceC.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        backPage.setVisibility(View.VISIBLE);

        txtSwitcher.setText("\"Mr. Liu laughs, “What type of smoothie do you want? We have some fruits to choose from inside.” " +
                "“Let’s go check out the kitchen”, says Will eagerly.");

        backPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Back page button clicked");
                pageEight();
            }
        });

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageTen();
            }
        });
    }

    private void pageTen() {
        imPicture.setImageResource(R.drawable.capstone8);
        txtSwitcher.setText("“I want strawberry!” says Bridgette." +
                "“Wait I want Lychee!” says Will");

        backPage.setVisibility(View.VISIBLE);
        backPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Back page button clicked");
                pageNine();
            }
        });

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageEleven();
            }
        });
    }

    private void pageEleven() {
        imPicture.setImageResource(R.drawable.capstone9);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText("Bridgette gives will a funny look “Ew, what is Lychee? It looks gross! Yuck!”");

        backPage.setVisibility(View.VISIBLE);
        backPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Back page button clicked");
                pageTen();
            }
        });

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageTwelve();
            }
        });
    }

    private void pageTwelve() {
        imPicture.setImageResource(R.drawable.capstone3);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText("Will furrows his brows. " +
                "“It’s not gross, why would you say that? It’s really good! Have you tried it before?”");

        backPage.setVisibility(View.VISIBLE);
        backPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Back page button clicked");
                pageEleven();
            }
        });

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Next page button clicked");
                pageThirteen();
            }
        });
    }

    private void pageThirteen() {
        imPicture.setImageResource(R.drawable.capstone9);
        btnChoiceOne.setVisibility(View.INVISIBLE);
        btnChoiceTwo.setVisibility(View.INVISIBLE);
        txtSwitcher.setVisibility(View.VISIBLE);
        txtSwitcher.setText("Bridgette looks at him like he’s crazy, “Ew, why would I try that? Is it from China or something?”");

        backPage.setVisibility(View.VISIBLE);
        backPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Back page button clicked");
                pageTwelve();
            }
        });

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
        txtSwitcher.setText("“You are so mean!” cried Wills as he turns and runs to his room. "
                + "Will and Bridgette are upset. What do you want to do?");

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
                Intent i = new Intent(getApplicationContext(), ContinueActivity.class);
                startActivity(i);
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
                Intent i = new Intent(getApplicationContext(), ContinueActivity.class);
                startActivity(i);
            }
        });
    }

}
