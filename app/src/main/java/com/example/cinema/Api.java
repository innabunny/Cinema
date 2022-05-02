package com.example.cinema;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
     String BASE_URL = "http://fondermark.ru/apis/weather/hello/";

     @GET("hello")
    Call<List<JsonReader>> getJsonReader();


}
