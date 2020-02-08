package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Secondactivity extends AppCompatActivity {
    private TextView mReply1;
    private TextView mReply2;
    private TextView mReply3;
    private static final String LOG_TAG = Secondactivity.class.getSimpleName();
    public static final String EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        mReply1 = findViewById(R.id.textView11);
        mReply2 = findViewById(R.id.textView12);
        mReply3 = findViewById(R.id.textView13);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


    }

    public void Return1(View view) {
        Intent replyIntent = new Intent();
        String reply = mReply1.getText().toString();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
        //if(s[0].getText().toString()!=null){
            //a.setText("apple");
      //  }


    }
    public void Return2(View view) {
        Intent replyIntent = new Intent();
        String reply = mReply2.getText().toString();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
    public void Return3(View view) {
        Intent replyIntent = new Intent();
        String reply = mReply3.getText().toString();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d(LOG_TAG, "onResume");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }



}

