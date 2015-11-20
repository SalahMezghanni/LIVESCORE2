package com.example.com.livescore2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView T1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_main2);
        T1=(TextView)findViewById(R.id.T1) ;

        Bundle extras = getIntent().getExtras() ;

        if( extras != null )
        {

            T1.setText( extras.getString("tof") ) ;
        }

    }
}
