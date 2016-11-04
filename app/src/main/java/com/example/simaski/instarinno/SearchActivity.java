package com.example.simaski.instarinno;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.simaski.instarinno.Pojo.Example;
import com.example.simaski.instarinno.Services.ServiceGenerator;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchActivity extends AppCompatActivity {

    String mAuthToken;
    String mId;
    int j= 0;
    private TextView textUser;
    private ImageView imgUser;
    private final int SPLASH_TIME = 5000;
    public static final String TAG = "INSTA";
    public String[] hola = {"a","b","c","d"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        textUser = (TextView) findViewById(R.id.textUser);
        imgUser = (ImageView) findViewById(R.id.imgUser);


        Intent intent = getIntent();
        mAuthToken = intent.getStringExtra("AUTH_TOKEN");
        mId = intent.getStringExtra("USER_ID");
        //tvToken.setText(mAuthToken);
        //getTagResults();
        Log.d(TAG, "TOKEN: " + mAuthToken);
        Log.d(TAG, "USER ID: " + mId);


        tiempo();


    }


    private void getTagResults() {
       Call<Example> call = ServiceGenerator.createTokenService().getResponse(mAuthToken);
        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if (response.isSuccessful()) {

                    final Example example = response.body();

                                String text = example.getData().get(j).getCaption().getText();
                                textUser.setText(text);


                                String url = example.getData().get(j).getImages().getStandardResolution().getUrl();
                                Glide.with(SearchActivity.this).load(url).centerCrop().into(imgUser);

                    Log.d(TAG, "RESPUESTA 3: " + response.body().getData().get(0).getImages().getStandardResolution().getUrl());

                }else{
                    Log.d(TAG, "RESPUESTA 2: ");
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d(TAG, "ERRRROOORRRR: " );
            }
        });

    }

    public void tiempo(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(j < 4) {
                    getTagResults();
                    j++;
                    if(j == 4){
                        j = 0;
                    }
                }
                Log.d(TAG, "RESPUESTA 20: " + j);
                tiempo();

            }
        }, SPLASH_TIME);
    }

}
