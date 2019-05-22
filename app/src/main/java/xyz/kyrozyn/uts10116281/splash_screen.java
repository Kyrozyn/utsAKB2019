/*
NIM : 10116281
Nama : Andreas Rizki Rizaldi
Kelas : IF-7
Dibuat : 21-05-2019
 */
package xyz.kyrozyn.uts10116281;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash_screen extends AppCompatActivity {
    private int time = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        goToMain();
    }
    protected void goToMain(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                Intent home=new Intent(splash_screen.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        };
        new Handler().postDelayed(r,time);
    }
}