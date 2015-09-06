package com.theandroiddeveloper.viewholderpattern.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.theandroiddeveloper.viewholderpattern.R;

/***
 * @author jonatan.salas
 */
public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        setTitle(R.string.title);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
