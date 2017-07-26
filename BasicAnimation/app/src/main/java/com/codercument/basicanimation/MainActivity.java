package com.codercument.basicanimation;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menuEkraninaGec();
    }

    private void menuEkraninaGec() {

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        ImageView girisLogo = (ImageView) findViewById(R.id.girisLogoImageView);
        anim.reset();
        girisLogo.clearAnimation();
        girisLogo.startAnimation(anim);

    }
}
