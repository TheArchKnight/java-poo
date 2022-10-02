/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package Punto_41;

/**
 *
 * @author anorak
 */
public class Comparacion {
   private double[] valores;

   public Comparacion(String texto) {
      String[] arrayNumeros = texto.split(",");
      valores = new double[arrayNumeros.length];
      for (int i = 0; i < valores.length; i++) {
         valores[i] = Double.parseDouble(arrayNumeros[i]);
      }
   }

   public double valorMayor() {
      for (int x = 0; x < valores.length; x++) {
         // Aquí "y" se detiene antes de llegar
         // a length - 1 porque dentro del for, accedemos
         // al siguiente elemento con el índice actual + 1
         for (int y = 0; y < valores.length - 1; y++) {
            double elementoActual = valores[y],
                  elementoSiguiente = valores[y + 1];
            if (elementoActual > elementoSiguiente) {
               // Intercambiar
               valores[y] = elementoSiguiente;
               valores[y + 1] = elementoActual;
            }
         }
      }
      return valores[valores.length - 1];
   }
}
