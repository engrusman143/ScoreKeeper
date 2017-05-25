
package com.example.android.courtcounter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreRealMadrid = 0;
    int scoreAtlMadrid = 0;
    int foulRealMadrid = 0;
    int foulAtlMadrid = 0;
    int cornerRealMadrid= 0;
    int cornerAtlMadrid= 0;
    int yellowCardRealMadrid= 0;
    int yellowCardAtlMadrid= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamA1(0);
        displayForTeamA2(0);
        displayForTeamA3(0);
        displayForTeamB(0);
        displayForTeamB1(0);
        displayForTeamB2(0);
        displayForTeamB3(0);
    }
    public void GoalForRealMadrid(View v) {
       scoreRealMadrid = scoreRealMadrid +1;
        displayForTeamA(scoreRealMadrid);
    }

    public void realMadridFouls(View v) {
        foulRealMadrid = foulRealMadrid +1;
        displayForTeamA1(foulRealMadrid);
    }

    public void cornerKicks(View v) {
        cornerRealMadrid = cornerRealMadrid +1;
        displayForTeamA2(cornerRealMadrid);
    }
    public void yellowCardsRealMadrid(View v) {
        yellowCardRealMadrid = yellowCardRealMadrid +1;
        displayForTeamA3(yellowCardRealMadrid);
    }
    public void GoalForAtlMadrid(View v) {
        scoreAtlMadrid = scoreAtlMadrid +1;
        displayForTeamB(scoreAtlMadrid);
    }
    public void atlMadridFouls(View v) {
        foulAtlMadrid = foulAtlMadrid +1;
        displayForTeamB1(foulAtlMadrid);
    }
    public void CornerKicks(View v) {
        cornerAtlMadrid = cornerAtlMadrid +1;
        displayForTeamB2(cornerAtlMadrid);
    }
    public void yellowCardsAtlMadrid(View v) {
        yellowCardAtlMadrid = yellowCardAtlMadrid +1;
        displayForTeamB3(yellowCardAtlMadrid);
    }
    public void resetScore(View v) {
         scoreRealMadrid = 0;
         scoreAtlMadrid = 0;
         foulRealMadrid = 0;
         foulAtlMadrid = 0;
         cornerRealMadrid=0;
         cornerAtlMadrid=0;
         yellowCardRealMadrid=0;
         yellowCardAtlMadrid=0;
         displayForTeamA(scoreRealMadrid);
         displayForTeamB(scoreAtlMadrid);
         displayForTeamA1(foulRealMadrid);
         displayForTeamB1(foulAtlMadrid);
         displayForTeamA2(cornerRealMadrid);
         displayForTeamB2(cornerAtlMadrid);
        displayForTeamA3(yellowCardRealMadrid);
        displayForTeamB3(yellowCardAtlMadrid);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
}
    /**
     * Displays the given foul for Team A1.
     */
    public void displayForTeamA1(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(foul));
    }
    /**
     * Displays the given corner for Team A2.
     */
    public void displayForTeamA2(int corner) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corner);
        scoreView.setText(String.valueOf(corner));
    }
    /**
     * Displays the given yellow Card for Team A3.
     */
    public void displayForTeamA3(int yellowCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellowCard);
        scoreView.setText(String.valueOf(yellowCard));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given foul for Team B1.
     */
    public void displayForTeamB1(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(foul));
    }
    /**
     * Displays the given corner for Team B2.
     */
    public void displayForTeamB2(int corner) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_corner);
        scoreView.setText(String.valueOf(corner));
    }
    /**
     * Displays the given yellow Cards for Team B3.
     */
    public void displayForTeamB3(int yellowCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellowCard);
        scoreView.setText(String.valueOf(yellowCard));
    }

}
