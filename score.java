package com.example.sandeep.justmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

class ScoreActivity extends AppCompatActivity {

    ImageButton  btnMathShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        btnMathShare= (ImageButton) findViewById(R.id.btnMathShare);

        TextView tv = (TextView) findViewById(R.id.score);
        int score = getIntent().getIntExtra("score", 0);
        tv.setText("Current Score : " + score);

        btnMathShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                 *  Example of Implict Intent
                 *  When you click Share Button on the screen
                 *  Android will find the activities that allow to share messages.
                 */

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Just Maths - Fun way to learn Maths. http://www.play.google.com");
                startActivity(intent);
            }
        });
    }
}

