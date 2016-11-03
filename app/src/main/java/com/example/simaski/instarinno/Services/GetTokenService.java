package com.example.simaski.instarinno.Services;




import com.example.simaski.instarinno.Pojo.Datum;
import com.example.simaski.instarinno.Pojo.Example;
import com.example.simaski.instarinno.Pojo.TokenResponse;

import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2/22/2016.
 */
public interface GetTokenService {

//    @POST("/oauth/access_token")
//      Call<TokenResponse> getAccessToken(@Body TokenRequest tokenRequest); //so this returns a token response and we need to build a pojo for that.

    @FormUrlEncoded
    @POST("/oauth/access_token")
    Call<TokenResponse> getAccessToken(@Field("client_id") String client_id, @Field("client_secret") String client_secret,
                                       @Field("redirect_uri") String redirect_uri, @Field("grant_type") String grant_type,
                                       @Field("code") String code);

    @GET("/v1/tags/{tag-name}/media/recent")
    Call<Example> getResponse(@Path("tag-name") String tagName, @Query("access_token") String accessToken,
                              @Query("max_id") String maxId, @Query("min_id") String minId);

     /*@GET("/v1/tags/{tag-name}/media/recent")
    Call<ArrayList<Datum>> getResponse(@Path("tag-name") String tagName, @Query("access_token") String accessToken,
                                       @Query("max_id") String maxId, @Query("min_id") String minId);*/


}
