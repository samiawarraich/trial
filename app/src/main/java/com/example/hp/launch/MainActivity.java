package com.example.hp.launch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void process(View view){
        Intent intent = null, chooser=null;

        if(view.getId()==R.id.LaunchMap){
            intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:33.5936466,73.1314641"));
            chooser= Intent.createChooser(intent,"Launch Map");    //the app will not crash
            startActivity(chooser);
        }
        if(view.getId()==R.id.LaunchMarket){
            intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=com.ketchapp.stickhero&hl=en"));
            chooser=Intent.createChooser(intent,"Launch Market");
            startActivity(chooser);
        }
        if(view.getId()==R.id.SendEmail){
            intent=new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to={"hmaliknhmalik@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_SUBJECT, "hello, sent by me");
            intent.putExtra(Intent.EXTRA_TEXT, "how u doin");
            intent.setType("message/rfc822");
            chooser= Intent.createChooser(intent,"Send Email");
            startActivity(chooser);


        }
    }
}


