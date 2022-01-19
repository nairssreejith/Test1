package com.sreejithsnair.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.sreejithsnair.test1.samples.DragonView;
import com.sreejithsnair.test1.samples.PlayVideo;
import com.sreejithsnair.test1.samples.TapAndPlace;

public class MainActivity extends AppCompatActivity {

    Button btnDragonView;
    Button btnTapAndPlace;
    Button btnPlayVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnDragonView = findViewById(R.id.btn_dragon_view);
        btnDragonView.setOnClickListener(v -> goToDragonView());

        btnTapAndPlace = findViewById(R.id.btn_tap_and_place);
        btnTapAndPlace.setOnClickListener(v -> goToTapAndPlace());

        btnPlayVideo = findViewById(R.id.btn_play_video);
        btnPlayVideo.setOnClickListener(v -> goToPlayVideo());
    }

    private void goToPlayVideo() {
        Intent intent = new Intent(this, PlayVideo.class);
        startActivity(intent);
    }

    private void goToTapAndPlace() {
        Intent intent = new Intent(this, TapAndPlace.class);
        startActivity(intent);
    }

    private void goToDragonView() {
        Intent intent = new Intent(this, DragonView.class);
        startActivity(intent);
    }
}