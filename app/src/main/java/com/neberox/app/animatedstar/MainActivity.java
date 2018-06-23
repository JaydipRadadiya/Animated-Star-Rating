package com.neberox.app.animatedstar;

import android.graphics.Color;
import android.support.annotation.ColorRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.neberox.library.animatedstar.StarRatingBar;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StarRatingBar bar = new StarRatingBar(this);
        bar.setAnimDuration(200);
        bar.setFillColor(Color.WHITE);
        bar.setRating(3);
        bar.setSelectedColor(Color.parseColor("#FF00000"));
        bar.setStrokeColor(Color.TRANSPARENT);
        bar.setStrokeWidth(1);

        bar.regenerateStar();
    }
}
