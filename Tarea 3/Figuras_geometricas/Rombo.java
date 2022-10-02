//package Figuras_geometricas;

import java.lang.Math;

public class Rombo {
   public double D, d;

   public double area() {
      return D * d / 2;
   }

   public double perimetro() {
      return 2 * Math.sqrt(D * D + d * d);
   }
}
