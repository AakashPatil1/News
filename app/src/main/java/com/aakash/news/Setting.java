package com.aakash.news;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import de.hdodenhof.circleimageview.BuildConfig;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        //Initialize
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.share){
            try {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT,"Share demo");
                String shareMessage = "https://play.google.com/store/apps/details?id="+ BuildConfig.APPLICATION_ID+"\n\n";
                intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
                startActivity(Intent.createChooser(intent,"Share by"));
            }catch (Exception e){
                Toast.makeText(Setting.this, "Error occurred", Toast.LENGTH_SHORT).show();

            }

        }else if(id == R.id.setting){
            Intent i = new Intent(Setting.this,Setting.class);
            startActivity(i);
        }else if(id == R.id.exit){
            System.exit(1);
        }
        return true;
    }

    public void rateus(View view) {

        String rateus = new String("Rate Us");

        Toast.makeText(this, "After the app was uploaded to thr play store "+rateus, Toast.LENGTH_SHORT).show();
    }

    public void feedback(View view) {
        /*
        try {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            String UriText = "mailto :" + Uri.encode("akashap0007@gmail.com") + "?subject="+
                    Uri.encode("Feedback") +"$body="+ Uri.encode("");
            Uri uri = Uri.parse(UriText);
            intent.setData(uri);
            startActivity(Intent.createChooser(intent,"send email"));
        }catch (Exception e){
            Toast.makeText(MainActivity.this, "Error occurred", Toast.LENGTH_SHORT).show();
        }

         */
        String feedback = new String("Feedback");

        Toast.makeText(this, "After the app was uploaded to thr play store "+feedback, Toast.LENGTH_SHORT).show();
    }
}