package com.example.simaski.instarinno.Services;



import com.example.simaski.instarinno.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 3/2/2016.
 */
public class ServiceGenerator{

    public static GetTokenService createTokenService(){
        return getRetrofit().create(GetTokenService.class);
    }

    //this is my adapter...
    private static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}

