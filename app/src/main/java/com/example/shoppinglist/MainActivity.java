package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = Secondactivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";
    private TextView mReplyHeadTextView;
    public static final int TEXT_REQUEST = 1;
    private TextView[] s=new TextView[10];
    private ArrayList<TextView>a=new ArrayList<TextView>();
    private int[] c=new int[100];
    private int i=0;
    private int count=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");
        s[0]=findViewById(R.id.textView1);
        s[1]=findViewById(R.id.textView2);
        s[2]=findViewById(R.id.textView3);
        s[3]=findViewById(R.id.textView4);
        s[4]=findViewById(R.id.textView5);
        s[5]=findViewById(R.id.textView6);
        s[6]=findViewById(R.id.textView7);
        s[7]=findViewById(R.id.textView8);
        s[8]=findViewById(R.id.textView9);
        s[9]=findViewById(R.id.textView10);
        if(count==0){
            mReplyHeadTextView=s[0];
        }
        else if(count==1){
            mReplyHeadTextView=s[1];
        }
        //for(int i=0;i<s.length;i++){
            //if(s[i].getVisibility() != View.VISIBLE){
                //mReplyHeadTextView=s[i];
                //break;
            //}
        //}
        if (savedInstanceState != null) {
            boolean isVisible =
                    savedInstanceState.getBoolean("reply_visible");
            // Show both the header and the message views. If isVisible is
            // false or missing from the bundle, use the default layout.
            if (isVisible) {
                mReplyHeadTextView.setVisibility(View.VISIBLE);
                mReplyHeadTextView.setText(savedInstanceState.getString("reply_text"));

            }
        }

    }

    public void add(View view) {
        Intent intent = new Intent(this, Secondactivity.class);
        String message = mReplyHeadTextView.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra("count",count);
        startActivityForResult(intent, TEXT_REQUEST);

        count++;

    }

    @Override
    public void onActivityResult(int requestCode,int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST){
            if (resultCode == RESULT_OK) {
                    String reply = data.getStringExtra(Secondactivity.EXTRA_REPLY);
                    mReplyHeadTextView.setVisibility(View.VISIBLE);
                    mReplyHeadTextView.setText(reply);


                }
            }
        }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text",mReplyHeadTextView.getText().toString());

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
