package net.publicisgroupe.mohm1.rotation;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animation  = AnimationUtils.loadAnimation(  MainActivity.this,R.anim.abc );
    }

    public void Sapient(View view) {
       view.startAnimation(animation);
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
       startActivity(intent);
    }
}
