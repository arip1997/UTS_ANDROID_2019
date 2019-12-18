package com.example.myapplicationuts;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.AccountManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlerSiswaClicked(View view) {
        Intent intent = new Intent(this, SiswaActivity.class);
        startActivity(intent);
    }

    public void handleChangeAvatar(View view) {
        Intent intent = new Intent(this, ImplicitIntentActivity.class);
        startActivity(intent);
    }

    public void handlergambarClicked(View view) {
        Intent intent = new Intent(this, GambarActivity.class);
        startActivity(intent);
    }

    public void handlerSmsClicked(View view) {
        Intent intent = new Intent(this, SmsActivity.class);
        startActivity(intent);
    }

//    public void handlerBrowserClicked(View view) {
//        Intent intent = new Intent(this, BrowserActivity.class);
//        startActivity(intent);
//    }
    public void handlerBrowserClicked(View view) {
        String url = "www.polinema.ac.id" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }
}
