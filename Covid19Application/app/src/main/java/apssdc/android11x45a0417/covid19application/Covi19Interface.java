package apssdc.android11x45a0417.covid19application;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Covi19Interface {
    @GET("dayone/country/in")
    Call<String> getDate();
}
