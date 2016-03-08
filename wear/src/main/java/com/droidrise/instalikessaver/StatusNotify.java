package com.droidrise.instalikessaver;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class StatusNotify extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_notify);
        mTextView = (TextView) findViewById(R.id.text);
    }
}
