package com.game.particleeffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;

import com.plattysoft.leonids.ParticleSystem;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button_effect);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_effect:{
                praticleEffect1();
                praticleEffect2();
                break;
            }
        }
    }
    private void praticleEffect1(){
        new ParticleSystem(this,80,R.mipmap.heart,5000)
                .setSpeedModuleAndAngleRange(0f,0.1f,225,315)
                .setRotationSpeed(180)
                .setAcceleration(0.00005f,270)
                .setScaleRange(0.1f,0.5f)
                .setFadeOut(4000)
                .emit(button,2);
    }
    private void praticleEffect2(){
        new ParticleSystem(this,80,R.mipmap.heart1,5000)
                .setSpeedModuleAndAngleRange(0f,0.1f,225,315)
                .setRotationSpeed(180)
                .setAcceleration(0.00005f,270)
                .setScaleRange(0.1f,0.5f)
                .setFadeOut(4000)
                .emit(button,2);
    }
    private void praticleEffect0(){
        new ParticleSystem(this,100,R.mipmap.heart1,1000)
                .setSpeedModuleAndAngleRange(0.1f,0.2f,225,315)
                .setScaleRange(0,0.5f)
                .setFadeOut(500)
                .oneShot(button,100);
    }

}
