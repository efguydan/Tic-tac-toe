package com.example.whistle.tic_tac_toe;

import android.app.Dialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FiveCompActivity extends AppCompatActivity {

    String mPlayerName, mWinnerText, mAllPlayed;
    int mTag, mWhoseTurn, mMovesMade, mWhereWon, mPlayerScore, mCompScore, mWhereP1Is, mCompTurn;
    int [] mGameMat = new int[25];
    int [] mPositionSet = new int[25];
    int [] mWinningPosition = new int[9];
    boolean mGameIsActive;
    TextView mPlayerPosition, mCompPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_comp);

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
                         [0 5 10 15 20]
                         [1 6 11 16 21]
     mGameMat[i] is like [2 7 12 17 22]
                         [3 8 13 18 23]
                         [4 9 14 19 24]

     */

    public void CPP11(View view) {
        if (mGameIsActive){
            if (mPositionSet[0] == 0) {
                mPositionSet[0] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP11, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 0);
                if (mMovesMade >= 9) {
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
    public void CPP12(View view) {
        if (mGameIsActive){
            if (mPositionSet[1] == 0) {
                mPositionSet[1] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP12, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 1);
                if (mMovesMade >= 9) {
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
    public void CPP13(View view) {
        if (mGameIsActive){
            if (mPositionSet[2] == 0) {
                mPositionSet[2] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP13, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 2);
                if (mMovesMade >= 9) {
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
    public void CPP14(View view) {
        if (mGameIsActive){
            if (mPositionSet[3] == 0) {
                mPositionSet[3] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP14, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 3);
                if (mMovesMade >= 9) {
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
    public void CPP15(View view) {
        if (mGameIsActive){
            if (mPositionSet[4] == 0) {
                mPositionSet[4] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP15, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 4);
                if (mMovesMade >= 9) {
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
    public void CPP21(View view) {
        if (mGameIsActive){
            if (mPositionSet[5] == 0) {
                mPositionSet[5] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP21, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 5);
                if (mMovesMade >= 9) {
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
    public void CPP22(View view) {
        if (mGameIsActive){
            if (mPositionSet[6] == 0) {
                mPositionSet[6] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP22, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 6);
                if (mMovesMade >= 9) {
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
    public void CPP23(View view) {
        if (mGameIsActive){
            if (mPositionSet[7] == 0) {
                mPositionSet[7] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP23, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 7);
                if (mMovesMade >= 9) {
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
    public void CPP24(View view) {
        if (mGameIsActive){
            if (mPositionSet[8] == 0) {
                mPositionSet[8] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP24, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 8);
                if (mMovesMade >= 9) {
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
    public void CPP25(View view) {
        if (mGameIsActive){
            if (mPositionSet[9] == 0) {
                mPositionSet[9] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP25, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 9);
                if (mMovesMade >= 9) {
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
    public void CPP31(View view) {
        if (mGameIsActive){
            if (mPositionSet[10] == 0) {
                mPositionSet[10] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP31, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 10);
                if (mMovesMade >= 9) {
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
    public void CPP32(View view) {
        if (mGameIsActive){
            if (mPositionSet[11] == 0) {
                mPositionSet[11] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP32, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 11);
                if (mMovesMade >= 9) {
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
    public void CPP33(View view) {
        if (mGameIsActive){
            if (mPositionSet[12] == 0) {
                mPositionSet[12] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP33, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 12);
                if (mMovesMade >= 9) {
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
    public void CPP34(View view) {
        if (mGameIsActive){
            if (mPositionSet[13] == 0) {
                mPositionSet[13] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP34, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 13);
                if (mMovesMade >= 9) {
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
    public void CPP35(View view) {
        if (mGameIsActive){
            if (mPositionSet[14] == 0) {
                mPositionSet[14] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP35, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 14);
                if (mMovesMade >= 9) {
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
    public void CPP41(View view) {
        if (mGameIsActive){
            if (mPositionSet[15] == 0) {
                mPositionSet[15] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP41, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 15);
                if (mMovesMade >= 9) {
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
    public void CPP42(View view) {
        if (mGameIsActive){
            if (mPositionSet[16] == 0) {
                mPositionSet[16] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP42, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 16);
                if (mMovesMade >= 9) {
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
    public void CPP43(View view) {
        if (mGameIsActive){
            if (mPositionSet[17] == 0) {
                mPositionSet[17] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP43, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 17);
                if (mMovesMade >= 9) {
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
    public void CPP44(View view) {
        if (mGameIsActive){
            if (mPositionSet[18] == 0) {
                mPositionSet[18] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP44, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 18);
                if (mMovesMade >= 9) {
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
    public void CPP45(View view) {
        if (mGameIsActive){
            if (mPositionSet[19] == 0) {
                mPositionSet[19] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP45, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 19);
                if (mMovesMade >= 9) {
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
    public void CPP51(View view) {
        if (mGameIsActive){
            if (mPositionSet[20] == 0) {
                mPositionSet[20] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP51, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 20);
                if (mMovesMade >= 9) {
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
    public void CPP52(View view) {
        if (mGameIsActive){
            if (mPositionSet[21] == 0) {
                mPositionSet[21] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP52, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 21);
                if (mMovesMade >= 9) {
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
    public void CPP53(View view) {
        if (mGameIsActive){
            if (mPositionSet[22] == 0) {
                mPositionSet[22] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP53, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 22);
                if (mMovesMade >= 9) {
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
    public void CPP54(View view) {
        if (mGameIsActive){
            if (mPositionSet[23] == 0) {
                mPositionSet[23] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP54, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 23);
                if (mMovesMade >= 9) {
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
    public void CPP55(View view) {
        if (mGameIsActive){
            if (mPositionSet[24] == 0) {
                mPositionSet[24] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP55, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 24);
                if (mMovesMade >= 9) {
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
    public void CPP11() {
        if (mGameIsActive){
            if (mPositionSet[0] == 0) {
                mPositionSet[0] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP11, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 0);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP12() {
        if (mGameIsActive){
            if (mPositionSet[1] == 0) {
                mPositionSet[1] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP12, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 1);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP13() {
        if (mGameIsActive){
            if (mPositionSet[2] == 0) {
                mPositionSet[2] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP13, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 2);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP14() {
        if (mGameIsActive){
            if (mPositionSet[3] == 0) {
                mPositionSet[3] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP14, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 3);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP15() {
        if (mGameIsActive){
            if (mPositionSet[4] == 0) {
                mPositionSet[4] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP15, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 4);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP21() {
        if (mGameIsActive){
            if (mPositionSet[5] == 0) {
                mPositionSet[5] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP21, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 5);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP22() {
        if (mGameIsActive){
            if (mPositionSet[6] == 0) {
                mPositionSet[6] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP22, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 6);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP23() {
        if (mGameIsActive){
            if (mPositionSet[7] == 0) {
                mPositionSet[7] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP23, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 7);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP24() {
        if (mGameIsActive){
            if (mPositionSet[8] == 0) {
                mPositionSet[8] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP24, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 8);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP25() {
        if (mGameIsActive){
            if (mPositionSet[9] == 0) {
                mPositionSet[9] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP25, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 9);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP31() {
        if (mGameIsActive){
            if (mPositionSet[10] == 0) {
                mPositionSet[10] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP31, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 10);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP32() {
        if (mGameIsActive){
            if (mPositionSet[11] == 0) {
                mPositionSet[11] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP32, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 11);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP33() {
        if (mGameIsActive){
            if (mPositionSet[12] == 0) {
                mPositionSet[12] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP33, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 12);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP34() {
        if (mGameIsActive){
            if (mPositionSet[13] == 0) {
                mPositionSet[13] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP34, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 13);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP35() {
        if (mGameIsActive){
            if (mPositionSet[14] == 0) {
                mPositionSet[14] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP35, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 14);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP41() {
        if (mGameIsActive){
            if (mPositionSet[15] == 0) {
                mPositionSet[15] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP41, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 15);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP42() {
        if (mGameIsActive){
            if (mPositionSet[16] == 0) {
                mPositionSet[16] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP42, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 16);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP43() {
        if (mGameIsActive){
            if (mPositionSet[17] == 0) {
                mPositionSet[17] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP43, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 17);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP44() {
        if (mGameIsActive){
            if (mPositionSet[18] == 0) {
                mPositionSet[18] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP44, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 18);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP45() {
        if (mGameIsActive){
            if (mPositionSet[19] == 0) {
                mPositionSet[19] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP45, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 19);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP51() {
        if (mGameIsActive){
            if (mPositionSet[20] == 0) {
                mPositionSet[20] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP51, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 20);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP52() {
        if (mGameIsActive){
            if (mPositionSet[21] == 0) {
                mPositionSet[21] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP52, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 21);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP53() {
        if (mGameIsActive){
            if (mPositionSet[22] == 0) {
                mPositionSet[22] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP53, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 22);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP54() {
        if (mGameIsActive){
            if (mPositionSet[23] == 0) {
                mPositionSet[23] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP54, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 23);
                if (mMovesMade >= 9) {
                    checkWin();
                }
                Toggle(mWhoseTurn);
            } else {
                ToastThis("Already Played, Play Elsewhere");
            }
        }
    }
    public void CPP55() {
        if (mGameIsActive){
            if (mPositionSet[24] == 0) {
                mPositionSet[24] = 1;
                mMovesMade += 1;
                insertTag(R.id.PP55, mWhoseTurn);
                mAllPlayed += "0";
                updateGameMat(mWhoseTurn, 24);
                if (mMovesMade >= 9) {
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
                n = random.nextInt(25);
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
            CPP11();
        else if(n == 1)
            CPP12();
        else if(n == 2)
            CPP13();
        else if(n == 3)
            CPP14();
        else if(n == 4)
            CPP15();
        else if(n == 5)
            CPP21();
        else if(n == 6)
            CPP22();
        else if(n == 7)
            CPP23();
        else if(n == 8)
            CPP24();
        else if(n == 9)
            CPP25();
        else if(n == 10)
            CPP31();
        else if(n == 11)
            CPP32();
        else if(n == 12)
            CPP33();
        else if(n == 13)
            CPP34();
        else if(n == 14)
            CPP35();
        else if(n == 15)
            CPP41();
        else if(n == 16)
            CPP42();
        else if(n == 17)
            CPP43();
        else if(n == 18)
            CPP44();
        else if(n == 19)
            CPP45();
        else if(n == 20)
            CPP51();
        else if(n == 21)
            CPP52();
        else if(n == 22)
            CPP53();
        else if(n == 23)
            CPP54();
        else if(n == 24)
            CPP55();
    }

    public void checkWin(){
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[0], mGameMat[5], mGameMat[10], mGameMat[15], mGameMat[20]);
            checkWinning(mWhoseTurn, 1);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[1], mGameMat[6], mGameMat[11], mGameMat[16], mGameMat[21]);
            checkWinning(mWhoseTurn, 2);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[2], mGameMat[7], mGameMat[12], mGameMat[17], mGameMat[22]);
            checkWinning(mWhoseTurn, 3);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[3], mGameMat[8], mGameMat[13], mGameMat[18], mGameMat[23]);
            checkWinning(mWhoseTurn, 4);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[4], mGameMat[9], mGameMat[14], mGameMat[19], mGameMat[24]);
            checkWinning(mWhoseTurn, 5);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[0], mGameMat[1], mGameMat[2], mGameMat[3], mGameMat[4]);
            checkWinning(mWhoseTurn, 6);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[5], mGameMat[6], mGameMat[7], mGameMat[8], mGameMat[9]);
            checkWinning(mWhoseTurn, 7);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[10], mGameMat[11], mGameMat[12], mGameMat[13], mGameMat[14]);
            checkWinning(mWhoseTurn, 8);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[15], mGameMat[16], mGameMat[17], mGameMat[18], mGameMat[19]);
            checkWinning(mWhoseTurn, 9);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[20], mGameMat[21], mGameMat[22], mGameMat[23], mGameMat[24]);
            checkWinning(mWhoseTurn, 10);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[0], mGameMat[6], mGameMat[12], mGameMat[18], mGameMat[24]);
            checkWinning(mWhoseTurn, 11);
        }
        if(mGameIsActive) {
            setmWinningPosition(mGameMat[20], mGameMat[16], mGameMat[12], mGameMat[8], mGameMat[4]);
            checkWinning(mWhoseTurn, 12);
        }
        if(mGameIsActive && mMovesMade == 25){
            drawAction();
        }
    }

    public void checkWinning(int a, int position){
        if(mWinningPosition[0] == a && mWinningPosition[1] == a && mWinningPosition[2] == a && mWinningPosition[3] == a && mWinningPosition[4] == a){
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
        insertTag(R.id.PP11, 3);
        insertTag(R.id.PP12, 3);
        insertTag(R.id.PP13, 3);
        insertTag(R.id.PP14, 3);
        insertTag(R.id.PP15, 3);
        insertTag(R.id.PP21, 3);
        insertTag(R.id.PP22, 3);
        insertTag(R.id.PP23, 3);
        insertTag(R.id.PP24, 3);
        insertTag(R.id.PP25, 3);
        insertTag(R.id.PP31, 3);
        insertTag(R.id.PP32, 3);
        insertTag(R.id.PP33, 3);
        insertTag(R.id.PP34, 3);
        insertTag(R.id.PP35, 3);
        insertTag(R.id.PP41, 3);
        insertTag(R.id.PP42, 3);
        insertTag(R.id.PP43, 3);
        insertTag(R.id.PP44, 3);
        insertTag(R.id.PP45, 3);
        insertTag(R.id.PP51, 3);
        insertTag(R.id.PP52, 3);
        insertTag(R.id.PP53, 3);
        insertTag(R.id.PP54, 3);
        insertTag(R.id.PP55, 3);
    }

    public void clearScreen(View view){
        for(int i=0; i<mGameMat.length; i++){
            mGameMat[i] = 0;
            mPositionSet[i] = 0;
        }
        mAllPlayed = "";
        mMovesMade = 0;
        mGameIsActive = true;
        insertTag(R.id.PP11, 3);
        insertTag(R.id.PP12, 3);
        insertTag(R.id.PP13, 3);
        insertTag(R.id.PP14, 3);
        insertTag(R.id.PP15, 3);
        insertTag(R.id.PP21, 3);
        insertTag(R.id.PP22, 3);
        insertTag(R.id.PP23, 3);
        insertTag(R.id.PP24, 3);
        insertTag(R.id.PP25, 3);
        insertTag(R.id.PP31, 3);
        insertTag(R.id.PP32, 3);
        insertTag(R.id.PP33, 3);
        insertTag(R.id.PP34, 3);
        insertTag(R.id.PP35, 3);
        insertTag(R.id.PP41, 3);
        insertTag(R.id.PP42, 3);
        insertTag(R.id.PP43, 3);
        insertTag(R.id.PP44, 3);
        insertTag(R.id.PP45, 3);
        insertTag(R.id.PP51, 3);
        insertTag(R.id.PP52, 3);
        insertTag(R.id.PP53, 3);
        insertTag(R.id.PP54, 3);
        insertTag(R.id.PP55, 3);
    }

    public void setmWinningPosition(int a, int b, int c, int d, int e){
        mWinningPosition[0] = a;
        mWinningPosition[1] = b;
        mWinningPosition[2] = c;
        mWinningPosition[3] = d;
        mWinningPosition[4] = e;
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
