package com.example.translationanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView arshadImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arshadImage = (ImageView) findViewById(R.id.imageViewArshad);
    }

    public void imagePressed(View v) {
        arshadImage.animate().translationXBy(1500).setDuration(2000);
        sleep()
        arshadImage.animate().translationXBy(-1500).setDuration(2000);
    }
}
