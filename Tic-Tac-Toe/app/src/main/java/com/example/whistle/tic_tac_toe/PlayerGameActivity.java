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

public class PlayerGameActivity extends AppCompatActivity {

    String mP1Name, mP2Name, Game, mWinnerText;
    int mTag, mWhoseTurn, mMovesMade, mWhereWon, mP1Score, mP2Score, mWhereP1Is;
    int [] mGameMat = new int[9];
    int [] mPositionSet = new int[9];
    int [] mWinningPosition = new int[3];
    boolean mGameIsActive;
    TextView mP1Position, mP2Position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_game);

        mP1Name = getIntent().getStringExtra("NAME_OF_PLAYER1");
        mP2Name = getIntent().getStringExtra("NAME_OF_PLAYER2");
        updatePlayername(mP1Name, mP2Name);
        mTag = getIntent().getIntExtra("TAG_OF_PLAYERS", 0);
        mWhereP1Is = mTag;
        updateTags(mTag);
        setTextViews();


        for(int i=0; i<mWinningPosition.length; i++){
            mWinningPosition[i] = 0;
        }


        Game = "";
        mMovesMade = 0;
        mGameIsActive = true;
        mP1Score = 0;
        mP2Score = 0;

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

    public void CPP11(View view) {
        if (mGameIsActive){
            if (mPositionSet[0] == 0) {
                mPositionSet[0] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP11, mWhoseTurn);
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
    public void CPP12(View view){
        if (mGameIsActive) {
            if (mPositionSet[1] == 0) {
                mPositionSet[1] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP12, mWhoseTurn);
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
    public void CPP13(View view){
        if (mGameIsActive) {
            if (mPositionSet[2] == 0) {
                mPositionSet[2] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP13, mWhoseTurn);
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
    public void CPP21(View view){
        if (mGameIsActive) {
            if (mPositionSet[3] == 0) {
                mPositionSet[3] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP21, mWhoseTurn);
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
    public void CPP22(View view){
        if (mGameIsActive) {
            if (mPositionSet[4] == 0) {
                mPositionSet[4] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP22, mWhoseTurn);
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
    public void CPP23(View view){
        if (mGameIsActive) {
            if (mPositionSet[5] == 0) {
                mPositionSet[5] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP23, mWhoseTurn);
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
    public void CPP31(View view){
        if (mGameIsActive) {
            if (mPositionSet[6] == 0) {
                mPositionSet[6] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP31, mWhoseTurn);
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
    public void CPP32(View view){
        if (mGameIsActive) {
            if (mPositionSet[7] == 0) {
                mPositionSet[7] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP32, mWhoseTurn);
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
    public void CPP33(View view){
        if (mGameIsActive) {
            if (mPositionSet[8] == 0) {
                mPositionSet[8] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP33, mWhoseTurn);
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
            mP1Score+=1;
            mWinnerText = mP1Name + " wins the game!";
        }else if(text == "P2"){
            mP2Score+=1;
            mWinnerText = mP2Name + " wins the game!";
        }
        updateTextViews();
    }

    public void updateTextViews(){
        mP1Position.setText(Integer.toString(mP1Score));
        mP2Position.setText(Integer.toString(mP2Score));
    }

    public void clearScreen(){
        for(int i=0; i<mGameMat.length; i++){
            mGameMat[i] = 0;
            mPositionSet[i] = 0;
        }
        mMovesMade = 0;
        mGameIsActive = true;
        insertTag(R.id.PP11, 3);
        insertTag(R.id.PP12, 3);
        insertTag(R.id.PP13, 3);
        insertTag(R.id.PP21, 3);
        insertTag(R.id.PP22, 3);
        insertTag(R.id.PP23, 3);
        insertTag(R.id.PP31, 3);
        insertTag(R.id.PP32, 3);
        insertTag(R.id.PP33, 3);
    }

    public void clearScreen(View view){
        for(int i=0; i<mGameMat.length; i++){
            mGameMat[i] = 0;
            mPositionSet[i] = 0;
        }
        mMovesMade = 0;
        mGameIsActive = true;
        insertTag(R.id.PP11, 3);
        insertTag(R.id.PP12, 3);
        insertTag(R.id.PP13, 3);
        insertTag(R.id.PP21, 3);
        insertTag(R.id.PP22, 3);
        insertTag(R.id.PP23, 3);
        insertTag(R.id.PP31, 3);
        insertTag(R.id.PP32, 3);
        insertTag(R.id.PP33, 3);
    }

    public void setmWinningPosition(int a, int b, int c){
        mWinningPosition[0] = a;
        mWinningPosition[1] = b;
        mWinningPosition[2] = c;
    }

    public void updateGameMat(int tag, int position){
        mGameMat[position] = tag;
        Game = "";
        for(int k=0; k<mGameMat.length; k++){
            Game += String.valueOf(mGameMat[k]);
        }
        Log.d("Mytag", Game);
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

    public void updatePlayername(String P1, String P2){
        TextView textView1 = (TextView) findViewById(R.id.P1Name);
        textView1.setText(P1);
        TextView textView2 = (TextView) findViewById(R.id.textView);
        textView2.setText(P2);

    }

    public void updateTags(int number){
        ImageView imageViewP1 = (ImageView) findViewById(R.id.P1Tag);
        ImageView imageViewP2 = (ImageView) findViewById(R.id.P2Tag);

        if(mTag == 0){
            imageViewP1.setImageResource(R.drawable.tictactoex);
            imageViewP2.setImageResource(R.drawable.tictactoeo);
        }else if(mTag ==1){
            imageViewP1.setImageResource(R.drawable.tictactoeo);
            imageViewP2.setImageResource(R.drawable.tictactoex);
        }
    }

    public void setTextViews(){
        mP1Position = (TextView) findViewById(R.id.P1Score);
        mP2Position = (TextView) findViewById(R.id.P2Score);
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
}
