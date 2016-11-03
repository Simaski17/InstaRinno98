package com.example.simaski.instarinno;

import android.content.Intent;
import android.graphics.Picture;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.simaski.instarinno.Pojo.Datum;
import com.example.simaski.instarinno.Pojo.Example;
import com.example.simaski.instarinno.Pojo.StandardResolution;
import com.example.simaski.instarinno.Services.ServiceGenerator;


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchActivity extends AppCompatActivity {

    String mAuthToken;
    TextView tvToken;
    List<StandardResolution> mPictures;
    private String mMaxId, mMinId;
    public static final String TAG = "INSTA";

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

        tvToken = (TextView) findViewById(R.id.tvToken);

        Intent intent = getIntent();
        mAuthToken = intent.getStringExtra("AUTH_TOKEN");
        tvToken.setText(mAuthToken);
        getTagResults("nba","","");
        Log.d(TAG, "TOKEN: " + mAuthToken);

    }


    private void getTagResults(String query, String minId, String maxId) {
       Call<Example> call = ServiceGenerator.createTokenService().getResponse(query, mAuthToken, minId, maxId);
        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if (response.isSuccessful()) {
                    Example example = response.body();
                    //Datum dt = (Datum) response.body().getData();
                    //String hola = ((Datum) response.body().getData()).getImages().getStandardResolution().getUrl();
                    //List<Datum> data = example.getData();
                    //Log.d(TAG, "RESPUESTA 3: " + hola);

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

}
