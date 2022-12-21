package com.example.caculatetestjava;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        intent = new Intent(MainActivity.this, MyIntentService.class);
        String action = MyIntentService.ACTION_MUSIC;
        intent.setAction(action);
        startService(intent);

        ImageButton btn = findViewById(R.id.AnsGameBtn);
        ImageButton btn2 = findViewById(R.id.SymGameBtn);
        ImageButton btn3 = findViewById(R.id.button);

        AnimationDrawable ani =(AnimationDrawable)getResources().getDrawable(R.drawable.symbol_animation);
        ImageView img_frame = findViewById(R.id.imageView3);
        img_frame.setImageDrawable(ani);
        ani.start();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AnsGame.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SymGame.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), caculator.class);
                startActivity(intent);
            }
        });


    }
//    @Override
//    protected void onDestroy(){
//        super.onDestroy();
//        if(intent != null){
//            stopService(intent);
//        }
//    }
}