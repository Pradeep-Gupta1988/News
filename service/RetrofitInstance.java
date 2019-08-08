package carousell.com.carousellnews.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    public static Retrofit instance = null;

    public static final String BASE_URL = "https://storage.googleapis.com/";

    public static NewsDataService getNewsService(){

        instance = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return instance.create(NewsDataService.class);
    }




}
