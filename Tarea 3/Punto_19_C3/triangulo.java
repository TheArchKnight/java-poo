//package Punto_19_C3;

import java.lang.Math;
import java.util.Scanner;

public class triangulo {
   public double lado;

   public double perimetro() {
      return this.lado * 3;
   }

   public double altura() {
      return Math.sqrt(Math.pow(this.lado, 2) - Math.pow(this.lado / 2, 2));
   }

   public double area() {
      return this.lado * this.altura() / 2;
   }
}
