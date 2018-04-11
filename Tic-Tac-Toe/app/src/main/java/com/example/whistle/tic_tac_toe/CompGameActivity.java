package com.example.whistle.tic_tac_toe;

import android.app.Dialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class CompGameActivity extends AppCompatActivity {

    String mPlayerName, mWinnerText, mAllPlayed;
    int mTag, mWhoseTurn, mMovesMade, mWhereWon, mPlayerScore, mCompScore, mWhereP1Is, mCompTurn;
    int [] mGameMat = new int[9];
    int [] mPositionSet = new int[9];
    int [] mWinningPosition = new int[3];
    boolean mGameIsActive;
    TextView mPlayerPosition, mCompPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_game);

        mPlayerName = getIntent().getStringExtra("NAME_OF_PLAYER");
        updatePlayername(mPlayerName);
        mTag = getIntent().getIntExtra("TAG_OF_PLAYER", 0);
        mWhereP1Is = mTag;
        updateTags(mTag);
        setTextViews();

        for(int i=0; i<mWinningPosition.length; i++){
            mWinningPosition[i] = 0;
        }

        mAllPlayed = "";
        mCompTurn = 1;
        mMovesMade = 0;
        mGameIsActive = true;
        mPlayerScore = 0;
        mCompScore = 0;

        mWhoseTurn = mTag + 1;
        for(int i=0; i<mGameMat.length; i++){
            mGameMat[i] = 0;
            mPositionSet[i] = 0;
        }

    }

    /*
                         [0 3 6]
     mGameMat[i] is like [1 4 7]
                         [2 5 8]

     */

    public void slot11C(View view) {
        if (mGameIsActive){
            if (mPositionSet[0] == 0) {
                mPositionSet[0] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot11, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 0);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        compTurn();
                    }
                }, 1000);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void slot12C(View view){
        if (mGameIsActive) {
            if (mPositionSet[1] == 0) {
                mPositionSet[1] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot12, mWhoseTurn);
                mAllPlayed += "1";
                updateGameMat(mWhoseTurn, 1);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        compTurn();
                    }
                }, 1000);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void slot13C(View view){
        if (mGameIsActive) {
            if (mPositionSet[2] == 0) {
                mPositionSet[2] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot13, mWhoseTurn);
                mAllPlayed += "2";
                updateGameMat(mWhoseTurn, 2);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        compTurn();
                    }
                }, 1000);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void slot21C(View view){
        if (mGameIsActive) {
            if (mPositionSet[3] == 0) {
                mPositionSet[3] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot21, mWhoseTurn);
                mAllPlayed += "3";
                updateGameMat(mWhoseTurn, 3);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        compTurn();
                    }
                }, 1000);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void slot22C(View view){
        if (mGameIsActive) {
            if (mPositionSet[4] == 0) {
                mPositionSet[4] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot22, mWhoseTurn);
                mAllPlayed += "4";
                updateGameMat(mWhoseTurn, 4);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        compTurn();
                    }
                }, 1000);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void slot23C(View view){
        if (mGameIsActive) {
            if (mPositionSet[5] == 0) {
                mPositionSet[5] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot23, mWhoseTurn);
                mAllPlayed += "5";
                updateGameMat(mWhoseTurn, 5);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        compTurn();
                    }
                }, 1000);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void slot31C(View view){
        if (mGameIsActive) {
            if (mPositionSet[6] == 0) {
                mPositionSet[6] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot31, mWhoseTurn);
                mAllPlayed += "6";
                updateGameMat(mWhoseTurn, 6);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        compTurn();
                    }
                }, 1000);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void slot32C(View view){
        if (mGameIsActive) {
            if (mPositionSet[7] == 0) {
                mPositionSet[7] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot32, mWhoseTurn);
                mAllPlayed += "7";
                updateGameMat(mWhoseTurn, 7);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        compTurn();
                    }
                }, 1000);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void slot33C(View view){
        if (mGameIsActive) {
            if (mPositionSet[8] == 0) {
                mPositionSet[8] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot33, mWhoseTurn);
                mAllPlayed += "8";
                updateGameMat(mWhoseTurn, 8);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        compTurn();
                    }
                }, 1000);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }

    public void slot11C() {
        if (mGameIsActive){
            if (mPositionSet[0] == 0) {
                mPositionSet[0] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot11, mWhoseTurn);
                updateGameMat(mWhoseTurn, 0);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void slot12C(){
        if (mGameIsActive) {
            if (mPositionSet[1] == 0) {
                mPositionSet[1] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot12, mWhoseTurn);
                updateGameMat(mWhoseTurn, 1);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void slot13C(){
        if (mGameIsActive) {
            if (mPositionSet[2] == 0) {
                mPositionSet[2] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot13, mWhoseTurn);
                updateGameMat(mWhoseTurn, 2);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void slot21C(){
        if (mGameIsActive) {
            if (mPositionSet[3] == 0) {
                mPositionSet[3] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot21, mWhoseTurn);
                updateGameMat(mWhoseTurn, 3);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void slot22C(){
        if (mGameIsActive) {
            if (mPositionSet[4] == 0) {
                mPositionSet[4] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot22, mWhoseTurn);
                updateGameMat(mWhoseTurn, 4);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void slot23C(){
        if (mGameIsActive) {
            if (mPositionSet[5] == 0) {
                mPositionSet[5] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot23, mWhoseTurn);
                updateGameMat(mWhoseTurn, 5);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void slot31C(){
        if (mGameIsActive) {
            if (mPositionSet[6] == 0) {
                mPositionSet[6] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot31, mWhoseTurn);
                updateGameMat(mWhoseTurn, 6);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void slot32C(){
        if (mGameIsActive) {
            if (mPositionSet[7] == 0) {
                mPositionSet[7] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot32, mWhoseTurn);
                updateGameMat(mWhoseTurn, 7);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void slot33C(){
        if (mGameIsActive) {
            if (mPositionSet[8] == 0) {
                mPositionSet[8] = 1;
                mMovesMade += 1;
                insertTag(R.id.slot33, mWhoseTurn);
                updateGameMat(mWhoseTurn, 8);
                if (mMovesMade >= 4) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }

    public void compTurn(){
        if(mCompTurn == 1) {
            Random random = new Random();
            int n = 0;
            String nStr = "";
            boolean playedBefore = true;
            while(playedBefore) {
                n = random.nextInt(9);
                nStr = Integer.toString(n);
                if(mPositionSet[n] == 0)
                    playedBefore = false;
            }
            mAllPlayed += nStr;
            CompPlay(n);
            mCompTurn = 1;
        }
    }

    public void CompPlay(int n){
        if(n == 0)
            slot11C();
        else if(n == 1)
            slot12C();
        else if(n == 2)
            slot13C();
        else if(n == 3)
            slot21C();
        else if(n == 4)
            slot22C();
        else if(n == 5)
            slot23C();
        else if(n == 6)
            slot31C();
        else if(n == 7)
            slot32C();
        else if(n == 8)
            slot33C();
    }

    public void checkWin(){
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[0], mGameMat[3], mGameMat[6]);
            checkWinning(mWhoseTurn, 1);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[1], mGameMat[4], mGameMat[7]);
            checkWinning(mWhoseTurn, 2);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[2], mGameMat[5], mGameMat[8]);
            checkWinning(mWhoseTurn, 3);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[0], mGameMat[1], mGameMat[2]);
            checkWinning(mWhoseTurn, 4);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[3], mGameMat[4], mGameMat[5]);
            checkWinning(mWhoseTurn, 5);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[6], mGameMat[7], mGameMat[8]);
            checkWinning(mWhoseTurn, 6);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[0], mGameMat[4], mGameMat[8]);
            checkWinning(mWhoseTurn, 7);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[6], mGameMat[4], mGameMat[2]);
            checkWinning(mWhoseTurn, 8);
        }
        if(mGameIsActive && mMovesMade == 9){
            drawAction();
        }
    }

    public void checkWinning(int a, int position){
        if(mWinningPosition[0] == a && mWinningPosition[1] == a && mWinningPosition[2] == a){
            mGameIsActive = false;
            mWhereWon = position;
        }
        if(!mGameIsActive){
            updateScore();
            Toast.makeText(this, mWinnerText, Toast.LENGTH_SHORT).show();
            showAlert();
            clearScreen();

        }
    }

    public void drawAction(){
        mWinnerText = "Draw!";
        Toast.makeText(this, mWinnerText, Toast.LENGTH_SHORT).show();
        showAlert();
        clearScreen();
    }

    public void showAlert(){
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_dialog3);
        TextView yesText = (TextView) dialog.findViewById(R.id.yesText);
        TextView noText = (TextView) dialog.findViewById(R.id.noText);
        TextView winText = (TextView) dialog.findViewById(R.id.winnerText);
        winText.setText(mWinnerText);
        yesText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        noText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(myIntent);
                finish();
            }
        });

        dialog.setCancelable(false);
        dialog.show();
    }

    public void updateScore(){
        if(mWhereP1Is == 0){
            if(mWhoseTurn == 1)
                incScore("P1");
            else if(mWhoseTurn == 2)
                incScore("P2");
        }else if(mWhereP1Is == 1){
            if(mWhoseTurn == 1)
                incScore("P2");
            else if(mWhoseTurn == 2)
                incScore("P1");
        }
    }

    public void incScore(String text){
        if(text == "P1"){
            mPlayerScore+=1;
            mWinnerText = mPlayerName + " wins the game!";
        }else if(text == "P2"){
            mCompScore+=1;
            mWinnerText = "Computer" + " wins the game!";
        }
        updateTextViews();
    }

    public void updateTextViews(){
        mPlayerPosition.setText(Integer.toString(mPlayerScore));
        mCompPosition.setText(Integer.toString(mCompScore));
    }

    public void clearScreen(){
        for(int i=0; i<mGameMat.length; i++){
            mGameMat[i] = 0;
            mPositionSet[i] = 0;
        }
        mAllPlayed = "";
        mMovesMade = 0;
        mGameIsActive = true;
        insertTag(R.id.slot11, 3);
        insertTag(R.id.slot12, 3);
        insertTag(R.id.slot13, 3);
        insertTag(R.id.slot21, 3);
        insertTag(R.id.slot22, 3);
        insertTag(R.id.slot23, 3);
        insertTag(R.id.slot31, 3);
        insertTag(R.id.slot32, 3);
        insertTag(R.id.slot33, 3);
    }

    public void clearScreen(View view){
        for(int i=0; i<mGameMat.length; i++){
            mGameMat[i] = 0;
            mPositionSet[i] = 0;
        }
        mAllPlayed = "";
        mMovesMade = 0;
        mGameIsActive = true;
        insertTag(R.id.slot11, 3);
        insertTag(R.id.slot12, 3);
        insertTag(R.id.slot13, 3);
        insertTag(R.id.slot21, 3);
        insertTag(R.id.slot22, 3);
        insertTag(R.id.slot23, 3);
        insertTag(R.id.slot31, 3);
        insertTag(R.id.slot32, 3);
        insertTag(R.id.slot33, 3);
    }

    public void setmWinningPosition(int a, int b, int c){
        mWinningPosition[0] = a;
        mWinningPosition[1] = b;
        mWinningPosition[2] = c;
    }

    public void updateGameMat(int tag, int position){
        mGameMat[position] = tag;
    }

    private void Toggle(int number) {
        if (number == 1) {
            mWhoseTurn = 2;
        }else if(number == 2){
            mWhoseTurn = 1;
        }
    }


    public void insertTag(int id, int whichTag){
        ImageView imageView = (ImageView) findViewById(id);
        if(whichTag == 1) {
            imageView.setImageResource(R.drawable.tictactoex);
        }else if(whichTag == 2){
            imageView.setImageResource(R.drawable.tictactoeo);
        }else if(whichTag == 3){
            imageView.setImageResource(R.drawable.tictactoee);
        }
    }



    public void ToastThis(String message){
        final Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, 500);
    }

    public void exit(View view){
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
        finish();
    }

    public void setTextViews(){
        mPlayerPosition = (TextView) findViewById(R.id.playerScore);
        mCompPosition = (TextView) findViewById(R.id.compScore);
    }

    public void updatePlayername(String name){
        if(name == "")
            name = "Player";
        TextView textView = (TextView) findViewById(R.id.playerName);
        textView.setText(name);

    }

    public void updateTags(int number){
        ImageView imageViewPlayer = (ImageView) findViewById(R.id.playerTag);
        ImageView imageViewComp = (ImageView) findViewById(R.id.compTag);

        if(number == 0){
            imageViewComp.setImageResource(R.drawable.tictactoeo);
            imageViewPlayer.setImageResource(R.drawable.tictactoex);
        }else if(number ==1){
            imageViewComp.setImageResource(R.drawable.tictactoex);
            imageViewPlayer.setImageResource(R.drawable.tictactoeo);
        }
    }
}
