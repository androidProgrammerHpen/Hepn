package ir.hpen.android.hepn.Services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jasminb.jsonapi.retrofit.JSONAPIConverterFactory;

import ir.hpen.android.hepn.LogIn;
import retrofit2.Retrofit;

/**
 * Created by zahra on 2/1/2018.
 */
public class ApiClient {
    public static Retrofit getClient() {
        // Create object mapper
        ObjectMapper objectMapper = new ObjectMapper();
// Set serialisation/deserialisation options if needed (property naming strategy, etc...)

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://netyar.net/jsontest/")
                .addConverterFactory(new JSONAPIConverterFactory(objectMapper,LogIn.class))
                .build();

        // Create service using service interface
        return retrofit;
    }
}
