package com.itsjustfaiq.retrofit_exploration.Network;

import com.itsjustfaiq.retrofit_exploration.Model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
