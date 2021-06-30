package uea.ac.uk.shake2021;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class IntroductoryActivity extends AppCompatActivity {

    ImageView logo,splashImg;
    LottieAnimationView lottieAnimationView;
    Timer timer;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);


        logo = findViewById(R.id.logo);
        splashImg = findViewById(R.id.splashImg);
        lottieAnimationView = findViewById(R.id.lottie);

        logo.animate().rotation(400).setDuration(300);
        splashImg.animate().translationY(-4000).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(1400).setDuration(1000).setStartDelay(4000);

        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(IntroductoryActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}