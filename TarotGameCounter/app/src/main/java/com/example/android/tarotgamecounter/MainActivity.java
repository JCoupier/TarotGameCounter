package com.example.android.tarotgamecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreTaker = 0;
    int scoreDefenders = 0;

    int boutsHitTaker = 0;
    int boutsHitDefenders = 0;
    int boutsHits = 0;

    int kingsHitTaker = 0;
    int kingsHitDefenders = 0;
    int kingsHits = 0;

    int queensHitTaker = 0;
    int queensHitDefenders = 0;
    int queensHits = 0;

    int knightsHitTaker = 0;
    int knightsHitDefenders = 0;
    int knightsHits = 0;

    int jacksHitTaker = 0;
    int jacksHitDefenders = 0;
    int jacksHits = 0;

    int cardsHitTaker = 0;
    int cardsHitDefenders = 0;
    int lowCardsNumber = 59;

    int petitAuBoutHitTaker = 0;
    int petitAuBoutHitDefenders = 0;
    int petitAuBoutHits = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            // Restore value of members from saved state
            scoreTaker = savedInstanceState.getInt("scoreTaker");
            scoreDefenders = savedInstanceState.getInt("scoreDefenders");

            displayForTaker(scoreTaker);
            displayForDefenders(scoreDefenders);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("scoreTaker", scoreTaker);
        savedInstanceState.putInt("scoreDefenders", scoreDefenders);
        super.onSaveInstanceState(savedInstanceState);
    }

    /**
     * Displays the given score for the Taker.
     */
    public void displayForTaker(int score) {
        TextView scoreView = (TextView) findViewById(R.id.taker);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for the Taker by 5 points,
     * Change the text of the button for Hit count.
     * Stop the Hit possibility if All bouts already counted
     */
    public void boutsButtonHitTaker(View v) {
        if (boutsHits == 3) {
            Toast.makeText(this, "All Bouts already counted", Toast.LENGTH_SHORT).show();
        } else {
            scoreTaker = scoreTaker + 5;
            displayForTaker(scoreTaker);
            boutsHitTaker = boutsHitTaker + 1;
            boutsHits = boutsHits + 1;
            String boutsTextTaker = "BOUTS (" + boutsHitTaker + ")";
            Button boutsButtonTaker = (Button) findViewById(R.id.boutsButtonTaker);
            boutsButtonTaker.setText(boutsTextTaker);
            lowCardsNumber = lowCardsNumber - 1;
        }
    }

    /**
     * Increase the score for the Taker by 5 points,
     * Change the text of the button for Hit count.
     * Stop the Hit possibility if All kings already counted
     */
    public void kingsButtonHitTaker(View v) {
        if (kingsHits == 4) {
            Toast.makeText(this, "All Kings already counted", Toast.LENGTH_SHORT).show();
        } else {
            scoreTaker = scoreTaker + 5;
            displayForTaker(scoreTaker);
            kingsHitTaker = kingsHitTaker + 1;
            kingsHits = kingsHits + 1;
            String kingsTextTaker = "KINGS (" + kingsHitTaker + ")";
            Button kingsButtonTaker = (Button) findViewById(R.id.kingsButtonTaker);
            kingsButtonTaker.setText(kingsTextTaker);
            lowCardsNumber = lowCardsNumber - 1;
        }
    }

    /**
     * Increase the score for the Taker by 4 points,
     * Change the text of the button for Hit count.
     * Stop the Hit possibility if All queens already counted
     */
    public void queensButtonHitTaker(View v) {
        if (queensHits == 4) {
            Toast.makeText(this, "All Queens already counted", Toast.LENGTH_SHORT).show();
        } else {
            scoreTaker = scoreTaker + 4;
            displayForTaker(scoreTaker);
            queensHitTaker = queensHitTaker + 1;
            queensHits = queensHits + 1;
            String queensTextTaker = "QUEENS (" + queensHitTaker + ")";
            Button queensButtonTaker = (Button) findViewById(R.id.queensButtonTaker);
            queensButtonTaker.setText(queensTextTaker);
            lowCardsNumber = lowCardsNumber - 1;
        }
    }

    /**
     * Increase the score for the Taker by 3 points,
     * Change the text of the button for Hit count.
     * Stop the Hit possibility if All knights already counted
     */
    public void knightsButtonHitTaker(View v) {
        if (knightsHits == 4) {
            Toast.makeText(this, "All Knights already counted", Toast.LENGTH_SHORT).show();
        } else {
            scoreTaker = scoreTaker + 3;
            displayForTaker(scoreTaker);
            knightsHitTaker = knightsHitTaker + 1;
            knightsHits = knightsHits + 1;
            String knightsTextTaker = "KNIGHTS (" + knightsHitTaker + ")";
            Button knightsButtonTaker = (Button) findViewById(R.id.knightsButtonTaker);
            knightsButtonTaker.setText(knightsTextTaker);
            lowCardsNumber = lowCardsNumber - 1;
        }
    }

    /**
     * Increase the score for the Taker by 2 points,
     * Change the text of the button for Hit count.
     * Stop the Hit possibility if All jacks already counted
     */
    public void jacksButtonHitTaker(View v) {
        if (jacksHits == 4) {
            Toast.makeText(this, "All Jacks already counted", Toast.LENGTH_SHORT).show();
        } else {
            scoreTaker = scoreTaker + 2;
            displayForTaker(scoreTaker);
            jacksHitTaker = jacksHitTaker + 1;
            jacksHits = jacksHits + 1;
            String jacksTextTaker = "JACKS (" + jacksHitTaker + ")";
            Button jacksButtonTaker = (Button) findViewById(R.id.jacksButtonTaker);
            jacksButtonTaker.setText(jacksTextTaker);
            lowCardsNumber = lowCardsNumber - 1;
        }
    }

    /**
     * Increase the score for the Taker by 1 points,
     * Change the text of the button for Hit count.
     * Stop the Hit possibility if All cards already counted
     */
    public void cardsButtonHitTaker(View v) {
        if (lowCardsNumber <= 1) {
            Toast.makeText(this, "All Cards already counted", Toast.LENGTH_SHORT).show();
        } else {
            scoreTaker = scoreTaker + 1;
            displayForTaker(scoreTaker);
            cardsHitTaker = cardsHitTaker + 2;
            String cardsTextTaker = "CARDS (" + cardsHitTaker + ")";
            Button cardsButtonTaker = (Button) findViewById(R.id.cardsButtonTaker);
            cardsButtonTaker.setText(cardsTextTaker);
            lowCardsNumber = lowCardsNumber - 2;
        }
    }

    /**
     * Increase the score for the Taker by 10 points,
     * Change the text of the button for Hit count.
     * Stop the Hit possibility if a petit au bout bonus already counted
     */
    public void petitAuBoutHitTaker(View v) {
        if (petitAuBoutHits == 1) {
            Toast.makeText(this, "One Petit au bout was already counted", Toast.LENGTH_SHORT).show();
        } else {
            scoreTaker = scoreTaker + 10;
            displayForTaker(scoreTaker);
            petitAuBoutHitTaker = petitAuBoutHitTaker + 1;
            petitAuBoutHits = petitAuBoutHits + 1;
            String petitAuBoutTextTaker = "PETIT AU BOUT (" + petitAuBoutHitTaker + ")";
            Button petitAuBoutButtonTaker = (Button) findViewById(R.id.petitAuBoutButtonTaker);
            petitAuBoutButtonTaker.setText(petitAuBoutTextTaker);
        }
    }

    /**
     * Displays the given score for the Defenders.
     */
    public void displayForDefenders(int score) {
        TextView scoreView = (TextView) findViewById(R.id.defenders);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for the Defenders by 5 points,
     * Change the text of the button for Hit count.
     * Stop the Hit possibility if All bouts already counted
     */
    public void boutsButtonHitDefenders(View v) {
        if (boutsHits == 3) {
            Toast.makeText(this, "All Bouts already counted", Toast.LENGTH_SHORT).show();
        } else {
            scoreDefenders = scoreDefenders + 5;
            displayForDefenders(scoreDefenders);
            boutsHitDefenders = boutsHitDefenders + 1;
            boutsHits = boutsHits + 1;
            String boutsTextDefenders = "BOUTS (" + boutsHitDefenders + ")";
            Button boutsButtonDefenders = (Button) findViewById(R.id.boutsButtonDefenders);
            boutsButtonDefenders.setText(boutsTextDefenders);
            lowCardsNumber = lowCardsNumber - 1;
        }
    }

    /**
     * Increase the score for the Defenders by 5 points,
     * Change the text of the button for Hit count.
     * Stop the Hit possibility if All kings already counted
     */
    public void kingsButtonHitDefenders(View v) {
        if (kingsHits == 4) {
            Toast.makeText(this, "All Kings already counted", Toast.LENGTH_SHORT).show();
        } else {
            scoreDefenders = scoreDefenders + 5;
            displayForDefenders(scoreDefenders);
            kingsHitDefenders = kingsHitDefenders + 1;
            kingsHits = kingsHits + 1;
            String kingsTextDefenders = "KINGS (" + kingsHitDefenders + ")";
            Button kingsButtonDefenders = (Button) findViewById(R.id.kingsButtonDefenders);
            kingsButtonDefenders.setText(kingsTextDefenders);
            lowCardsNumber = lowCardsNumber - 1;
        }
    }

    /**
     * Increase the score for the Defenders by 4 points,
     * Change the text of the button for Hit count.
     * Stop the Hit possibility if All queens already counted
     */
    public void queensButtonHitDefenders(View v) {
        if (queensHits == 4) {
            Toast.makeText(this, "All Queens already counted", Toast.LENGTH_SHORT).show();
        } else {
            scoreDefenders = scoreDefenders + 4;
            displayForDefenders(scoreDefenders);
            queensHitDefenders = queensHitDefenders + 1;
            queensHits = queensHits + 1;
            String queensTextDefenders = "QUEENS (" + queensHitDefenders + ")";
            Button queensButtonDefenders = (Button) findViewById(R.id.queensButtonDefenders);
            queensButtonDefenders.setText(queensTextDefenders);
            lowCardsNumber = lowCardsNumber - 1;
        }
    }

    /**
     * Increase the score for the Defenders by 3 points,
     * Change the text of the button for Hit count.
     * Stop the Hit possibility if All knights already counted
     */
    public void knightsButtonHitDefenders(View v) {
        if (knightsHits == 4) {
            Toast.makeText(this, "All Knights already counted", Toast.LENGTH_SHORT).show();
        } else {
            scoreDefenders = scoreDefenders + 3;
            displayForDefenders(scoreDefenders);
            knightsHitDefenders = knightsHitDefenders + 1;
            knightsHits = knightsHits + 1;
            String knightsTextDefenders = "KNIGHTS (" + knightsHitDefenders + ")";
            Button knightsButtonDefenders = (Button) findViewById(R.id.knightsButtonDefenders);
            knightsButtonDefenders.setText(knightsTextDefenders);
            lowCardsNumber = lowCardsNumber - 1;
        }
    }

    /**
     * Increase the score for the Defenders by 2 points,
     * Change the text of the button for Hit count.
     * Stop the Hit possibility if All jacks already counted
     */
    public void jacksButtonHitDefenders(View v) {
        if (jacksHits == 4) {
            Toast.makeText(this, "All Jacks already counted", Toast.LENGTH_SHORT).show();
        } else {
            scoreDefenders = scoreDefenders + 2;
            displayForDefenders(scoreDefenders);
            jacksHitDefenders = jacksHitDefenders + 1;
            jacksHits = jacksHits + 1;
            String jacksTextDefenders = "JACKS (" + jacksHitDefenders + ")";
            Button jacksButtonDefenders = (Button) findViewById(R.id.jacksButtonDefenders);
            jacksButtonDefenders.setText(jacksTextDefenders);
            lowCardsNumber = lowCardsNumber - 1;
        }
    }

    /**
     * Increase the score for the Defenders by 1 points,
     * Change the text of the button for Hit count.
     * Stop the Hit possibility if All cards already counted
     */
    public void cardsButtonHitDefenders(View v) {
        if (lowCardsNumber <= 1) {
            Toast.makeText(this, "All Cards already counted", Toast.LENGTH_SHORT).show();
        } else {
            scoreDefenders = scoreDefenders + 1;
            displayForDefenders(scoreDefenders);
            cardsHitDefenders = cardsHitDefenders + 2;
            String cardsTextDefenders = "CARDS (" + cardsHitDefenders + ")";
            Button cardsButtonDefenders = (Button) findViewById(R.id.cardsButtonDefenders);
            cardsButtonDefenders.setText(cardsTextDefenders);
            lowCardsNumber = lowCardsNumber - 2;
        }
    }

    /**
     * Increase the score for the Defenders by 10 points,
     * Change the text of the button for Hit count.
     * Stop the Hit possibility if a petit au bout bonus already counted
     */
    public void petitAuBoutHitDefenders(View v) {
        if (petitAuBoutHits == 1) {
            Toast.makeText(this, "One Petit au bout was already counted", Toast.LENGTH_SHORT).show();
        } else {
            scoreDefenders = scoreDefenders + 10;
            displayForDefenders(scoreDefenders);
            petitAuBoutHitDefenders = petitAuBoutHitDefenders + 1;
            petitAuBoutHits = petitAuBoutHits + 1;
            String petitAuBoutTextDefenders = "PETIT AU BOUT (" + petitAuBoutHitDefenders + ")";
            Button petitAuBoutButtonDefenders = (Button) findViewById(R.id.petitAuBoutButtonDefenders);
            petitAuBoutButtonDefenders.setText(petitAuBoutTextDefenders);
        }
    }

    /**
     * Reset both Scores to 0 point.
     * Reset every integers and text for all buttons.
     */
    public void resetScore(View v) {
        scoreTaker = 0;
        scoreDefenders = 0;
        displayForTaker(scoreTaker);
        displayForDefenders(scoreDefenders);

        boutsHits = 0;

        boutsHitTaker = 0;
        String boutsTextTaker = "BOUT";
        Button boutsButtonTaker = (Button) findViewById(R.id.boutsButtonTaker);
        boutsButtonTaker.setText(boutsTextTaker);

        boutsHitDefenders = 0;
        String boutsTextDefenders = "BOUT";
        Button boutsButtonDefenders = (Button) findViewById(R.id.boutsButtonDefenders);
        boutsButtonDefenders.setText(boutsTextDefenders);

        kingsHits = 0;

        kingsHitTaker = 0;
        String kingsTextTaker = "KING";
        Button kingsButtonTaker = (Button) findViewById(R.id.kingsButtonTaker);
        kingsButtonTaker.setText(kingsTextTaker);

        kingsHitDefenders = 0;
        String kingsTextDefenders = "KING";
        Button kingsButtonDefenders = (Button) findViewById(R.id.kingsButtonDefenders);
        kingsButtonDefenders.setText(kingsTextDefenders);

        queensHits = 0;

        queensHitTaker = 0;
        String queensTextTaker = "QUEEN";
        Button queensButtonTaker = (Button) findViewById(R.id.queensButtonTaker);
        queensButtonTaker.setText(queensTextTaker);

        queensHitDefenders = 0;
        String queensTextDefenders = "QUEEN";
        Button queensButtonDefenders = (Button) findViewById(R.id.queensButtonDefenders);
        queensButtonDefenders.setText(queensTextDefenders);

        knightsHits = 0;

        knightsHitTaker = 0;
        String knightsTextTaker = "KNIGHT";
        Button knightsButtonTaker = (Button) findViewById(R.id.knightsButtonTaker);
        knightsButtonTaker.setText(knightsTextTaker);

        knightsHitDefenders = 0;
        String knightsTextDefenders = "KNIGHT";
        Button knightsButtonDefenders = (Button) findViewById(R.id.knightsButtonDefenders);
        knightsButtonDefenders.setText(knightsTextDefenders);

        jacksHits = 0;

        jacksHitTaker = 0;
        String jacksTextTaker = "JACK";
        Button jacksButtonTaker = (Button) findViewById(R.id.jacksButtonTaker);
        jacksButtonTaker.setText(jacksTextTaker);

        jacksHitDefenders = 0;
        String jacksTextDefenders = "JACK";
        Button jacksButtonDefenders = (Button) findViewById(R.id.jacksButtonDefenders);
        jacksButtonDefenders.setText(jacksTextDefenders);

        lowCardsNumber = 59;

        cardsHitTaker = 0;
        String cardsTextTaker = "CARD";
        Button cardsButtonTaker = (Button) findViewById(R.id.cardsButtonTaker);
        cardsButtonTaker.setText(cardsTextTaker);

        cardsHitDefenders = 0;
        String cardsTextDefenders = "CARD";
        Button cardsButtonDefenders = (Button) findViewById(R.id.cardsButtonDefenders);
        cardsButtonDefenders.setText(cardsTextDefenders);

        petitAuBoutHits = 0;

        petitAuBoutHitTaker = 0;
        String petitAuBoutTextTaker = "PETIT AU BOUT";
        Button petitAuBoutButtonTaker = (Button) findViewById(R.id.petitAuBoutButtonTaker);
        petitAuBoutButtonTaker.setText(petitAuBoutTextTaker);

        petitAuBoutHitDefenders = 0;
        String petitAuBoutTextDefenders = "PETIT AU BOUT";
        Button petitAuBoutButtonDefenders = (Button) findViewById(R.id.petitAuBoutButtonDefenders);
        petitAuBoutButtonDefenders.setText(petitAuBoutTextDefenders);
    }
}
