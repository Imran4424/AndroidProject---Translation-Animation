package com.example.translationanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
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
        translateLeft();
        SystemClock.sleep(2200);
        translateRight();
        SystemClock.sleep(2200);
        translateRight();
        SystemClock.sleep(2200);
        translateLeft();
        SystemClock.sleep(2200);
        translateUp();
        SystemClock.sleep(2200);
        translateDown();
    }

    public void translateLeft() {
        arshadImage.animate().translationXBy(1500).setDuration(2000);
    }

    public void translateRight() {
        arshadImage.animate().translationXBy(-1500).setDuration(2000);
    }

    public  void translateUp() {
        arshadImage.animate().translationYBy(1500).setDuration(2000);
    }

    public void translateDown() {
        arshadImage.animate().translationYBy(-1500).setDuration(2000);
    }
}
