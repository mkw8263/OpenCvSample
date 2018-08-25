package com.project.opencvperson;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * 서버 요청 주소들
 */

public interface Service {
    @FormUrlEncoded
    @POST("/person/count")
    Call<HashMap<String, String>> setCount(@Field("count") String count, @Field("date") String date);


    @GET("/person")
    Call<List<Items>> getCount();
}
