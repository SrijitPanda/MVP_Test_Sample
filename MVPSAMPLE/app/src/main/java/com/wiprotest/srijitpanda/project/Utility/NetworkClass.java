package com.wiprotest.srijitpanda.project.Utility;

import com.wiprotest.srijitpanda.project.Model.DataModel;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.GET;

public interface NetworkClass {

    @GET()
    Observable<Response<ResponseBody>> getFeedDataFromApiCall();

}
