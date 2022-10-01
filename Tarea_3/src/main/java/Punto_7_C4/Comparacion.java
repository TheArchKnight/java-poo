//package Punto_7_C4;

public class Comparacion {
   public double a, b;

   public boolean iguales() {
      return Double.compare(a, b) == 0;
   }

   public boolean menorQue() {
      return Double.compare(a, b) < 0;
   }

   public boolean mayorQue() {
      return Double.compare(a, b) > 0;
   }

}
