package com.bezets.cityappar.models.address;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ihsan_bz on 19/11/2016.
 */

public class Viewport {

   @SerializedName("northeast")
   @Expose
   private Northeast_ northeast;
   @SerializedName("southwest")
   @Expose
   private Southwest_ southwest;

   /**
    * @return The northeast
    */
   public Northeast_ getNortheast() {
      return northeast;
   }

   /**
    * @param northeast The northeast
    */
   public void setNortheast(Northeast_ northeast) {
      this.northeast = northeast;
   }

   /**
    * @return The southwest
    */
   public Southwest_ getSouthwest() {
      return southwest;
   }

   /**
    * @param southwest The southwest
    */
   public void setSouthwest(Southwest_ southwest) {
      this.southwest = southwest;
   }

}
