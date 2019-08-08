package carousell.com.carousellnews;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import carousell.com.carousellnews.model.News;
import carousell.com.carousellnews.service.NewsDataService;
import carousell.com.carousellnews.service.RetrofitInstance;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.view.View;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getAllNews();
    }

    private void getAllNews() {

        NewsDataService newsDataService = RetrofitInstance.getNewsService();
        Call<News> call = newsDataService.getNews();

        call.enqueue(new Callback<News>() {
            @Override
            public void onResponse(Call<News> call, Response<News> response) {
                News news = response.body();

                
            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {

            }
        });
    }

}
