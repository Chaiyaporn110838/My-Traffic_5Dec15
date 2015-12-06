package apppj.chaiyapornp.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler objHandler = new Handler();
        objHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent objIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(objIntent);
                finish();
            }
        }, 8000);

        MediaPlayer introPlayer = MediaPlayer.create(getBaseContext(),R.raw.intro_start_horse);
        introPlayer.start();

    }   //Main Mathod
}   //Main Class
