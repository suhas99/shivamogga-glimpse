package com.bezets.cityappar.models.address;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ihsan_bz on 19/11/2016.
 */

public class Southwest_ {

   @SerializedName("lat")
   @Expose
   private Double lat;
   @SerializedName("lng")
   @Expose
   private Double lng;

   /**
    * @return The lat
    */
   public Double getLat() {
      return lat;
   }

   /**
    * @param lat The lat
    */
   public void setLat(Double lat) {
      this.lat = lat;
   }

   /**
    * @return The lng
    */
   public Double getLng() {
      return lng;
   }

   /**
    * @param lng The lng
    */
   public void setLng(Double lng) {
      this.lng = lng;
   }

}
