package com.hakim.ecommerce;

public class Dimension {
   private final int height;
   private final int length;
   private final int width;

   public Dimension(int height,int width,int length){
       this.height=height;
       this.width=width;
       this.length=length;
   }

   public int getVolume(){
       return this.height*length*width;
   }
}
