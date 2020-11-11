package apssdc.android11x45a0417.covid19application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {
TextView textView;
ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text_view);
        pb=findViewById(R.id.progress);
        Retrofit retrofit=new Retrofit.Builder().
                baseUrl("https://api.covid19api.com/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();
        Covi19Interface covi19Interface=retrofit.create(Covi19Interface.class);

        Call<String> data=covi19Interface.getDate();
        data.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                //Toast.makeText(MainActivity.this, response.body(), Toast.LENGTH_SHORT).show();

                try {
                    JSONArray root=new JSONArray(response.body());
                    for (int i=0;i<root.length();i++){
                        JSONObject data=root.getJSONObject(i);
                        String confirme=data.getString("Confirmed");
                        String active=data.getString("Active");
                        textView.append(confirme+" : "+ active+"\n");


                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Toast.makeText(MainActivity.this, "No data found or no data for this request",
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}