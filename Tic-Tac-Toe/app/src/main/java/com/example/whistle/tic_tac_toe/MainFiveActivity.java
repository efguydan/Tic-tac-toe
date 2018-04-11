package com.example.whistle.tic_tac_toe;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainFiveActivity extends AppCompatActivity {

    boolean mChecked, mChecked2;
    int mWhich = 0, mWhich2 = 0;
    String mName = "player";
    String mP1, mP2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_five);
    }


    public void StartMainActivity(View v){
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
        finish();
    }

    public void StartMainFiveActivity(View v){
        Intent myIntent = new Intent(this, MainFiveActivity.class);
        startActivity(myIntent);
        finish();
    }


    public void VsComp(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setMessage(R.string.dialog_message);
        builder.setTitle(R.string.dialog_title);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setView(R.layout.custom_dialog1);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent myIntent = new Intent(getApplicationContext(), FiveCompActivity.class);

                myIntent.putExtra("NAME_OF_PLAYER", mName);
                myIntent.putExtra("TAG_OF_PLAYER", mWhich);
                startActivity(myIntent);
                finish();
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //User Cancelled the Dialog
            }
        });

//        AlertDialog dialog = builder.create();
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_dialog1);
        TextView button = (TextView) dialog.findViewById(R.id.textView11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) dialog.findViewById(R.id.editText);
                mName = editText.getText().toString();
                if(mName.length()<2)
                    mName = "Player";
                Intent myIntent = new Intent(getApplicationContext(), FiveCompActivity.class);
                myIntent.putExtra("NAME_OF_PLAYER", mName);
                myIntent.putExtra("TAG_OF_PLAYER", mWhich);
                startActivity(myIntent);
                finish();
            }
        });
//        dialog.setCancelable(false);
        dialog.show();

    }

    public void VsPlay(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setMessage(R.string.dialog_message);
        builder.setTitle(R.string.dialog_title);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setView(R.layout.custom_dialog2);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent myIntent = new Intent(getApplicationContext(), FivePlayerActivity.class);
                startActivity(myIntent);
                finish();
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //User Cancelled the Dialog
            }
        });

//        AlertDialog dialog = builder.create();
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_dialog2);
        TextView button = (TextView) dialog.findViewById(R.id.textView12);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText1 = (EditText) dialog.findViewById(R.id.editTextp1);
                EditText editText2 = (EditText) dialog.findViewById(R.id.editTextp2);
                mP1 = editText1.getText().toString();
                if(mP1.length()<2)
                    mP1 = "Player1";
                mP2 = editText2.getText().toString();
                if(mP2.length()<2)
                    mP2 = "Player2";
                Intent myIntent = new Intent(getApplicationContext(), FivePlayerActivity.class);
                myIntent.putExtra("NAME_OF_PLAYER1", mP1);
                myIntent.putExtra("NAME_OF_PLAYER2", mP2);
                myIntent.putExtra("TAG_OF_PLAYERS", mWhich2);
                startActivity(myIntent);
                finish();
            }
        });
//        dialog.setCancelable(false);
        dialog.show();

    }

    public void RBClicked1(View view){
        mChecked = ((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.radioButton1:
                if(mChecked)
                    mWhich = 0;
                break;
            case R.id.radioButton2:
                if(mChecked)
                    mWhich = 1;
                break;
        }
    }

    public void RBClicked2(View view){
        mChecked2 = ((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.radioButton3:
                if(mChecked2) {
                    mWhich2 = 0;
                }
                break;
            case R.id.radioButton4:
                if(mChecked2)
                    mWhich2 = 1;
                break;
        }
    }
}
