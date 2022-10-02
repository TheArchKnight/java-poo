//package Figuras_geometricas;

import java.lang.Math;

public class Circulo {
   public double radio;

   public double area() {
      return Math.PI * radio * radio;
   }

   public double perimetro() {
      return 4 * Math.PI * radio;
   }
}
