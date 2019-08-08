package carousell.com.carousellnews.service;

import carousell.com.carousellnews.model.News;
import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsDataService {

    @GET("carousell-interview-assets/android/carousell_news.json")
    Call<News> getNews();

}
