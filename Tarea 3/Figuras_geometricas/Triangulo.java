//package Figuras_geometricas;

import java.lang.Math;

public class Triangulo extends Figura {

   public double hipotenusa() {
      return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

   }

   public String tipo() {

      if (hipotenusa() == base && base == altura) {
         return "Equilatero";
      } else if (hipotenusa() != base && base != altura) {
         return "Escaleno";
      }
      return "Isosceles";
   }

   public double perimetro() {
      return base + hipotenusa() * 2;
   }

   public double area() {
      return base * altura / 2;
   }

}
