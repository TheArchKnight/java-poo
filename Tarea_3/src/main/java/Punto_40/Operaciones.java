/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package Punto_40;

import java.lang.Math;

/**
 *
 * @author anorak
 */
public class Operaciones {
   private double[] numeros;
   private double[] raices;
   private int[] cubos;
   private int[] cuadrados;

   public Operaciones(String numerosString) {
      String[] arrayNumeros = numerosString.split(",");
      numeros = new double[arrayNumeros.length];
      raices = new double[arrayNumeros.length];
      cubos = new int[arrayNumeros.length];
      cuadrados = new int[arrayNumeros.length];

      for (int i = 0; i < arrayNumeros.length; i++) {
         numeros[i] = Double.parseDouble(arrayNumeros[i]);
      }
   }

   public String juntarNumeros(double[] numerosDouble) {
      String texto = "";
      for (int i = 0; i < numerosDouble.length; i++) {
         texto += "" + numerosDouble[i] + ",";
      }
      return texto;
   }

   public String juntarNumeros(int[] numerosInt) {
      String texto = "";
      for (int i = 0; i < numerosInt.length; i++) {
         texto += "" + numerosInt[i] + ",";
      }
      return texto;

   }

   public double[] raices() {
      for (int i = 0; i < numeros.length; i++) {
         raices[i] = Math.sqrt(numeros[i]);
      }
      return raices;
   }

   public int[] cuadrados() {
      for (int i = 0; i < numeros.length; i++) {
         cuadrados[i] = (int) Math.pow(numeros[i], 2);
      }
      return cuadrados;
   }

   public int[] cubos() {
      for (int i = 0; i < numeros.length; i++) {
         cubos[i] = (int) Math.pow(numeros[i], 3);
      }

      return cubos;
   }
}
