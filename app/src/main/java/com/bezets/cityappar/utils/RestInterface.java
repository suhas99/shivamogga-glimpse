package com.bezets.cityappar.utils;

import com.bezets.cityappar.models.address.AddressLoc;
import com.bezets.cityappar.models.elevation.Elevation;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by ihsan_bz on 30/06/2016.
 */

public interface RestInterface {

    String sensor = "false";
    String URL = "http://maps.googleapis.com/maps/api/geocode";

    String ELEV = "http://maps.googleapis.com/maps/api/elevation";

    @GET("/json")
    void getAddress(@Query("address") String key,
                    @Query("sensor") String part,
                    Callback<AddressLoc> cb);

    @GET("/json")
    void getElevation(@Query("locations") String location,
                      @Query("sensor") String sensor,
                      Callback<Elevation> el);
}
