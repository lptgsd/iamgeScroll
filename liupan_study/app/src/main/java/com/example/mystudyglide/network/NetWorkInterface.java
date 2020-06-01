package com.example.mystudyglide.network;

import com.example.mystudyglide.dto.ImageResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NetWorkInterface {

    @GET("j")
    Call<ImageResponse>  getImage(@Query("q") String searchValue,@Query("sn") int  page ,@Query("pn") int  pageNumber);

}
