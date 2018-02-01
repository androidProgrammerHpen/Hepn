package ir.hpen.android.hepn.Services;

import com.github.jasminb.jsonapi.JSONAPIDocument;

import java.util.List;

import ir.hpen.android.hepn.LogIn;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by zahra on 2/1/2018.
 */
public interface MyServices {
    @POST("LogIn/")
    Call<JSONAPIDocument<List<LogIn>>> sendDta(@Body LogIn logIn);
}
