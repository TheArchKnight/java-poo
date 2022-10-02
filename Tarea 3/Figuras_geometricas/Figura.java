/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package Figuras_geometricas;

/**
 *
 * @author anorak
 */
public class Figura {
   public double base, altura;

   public double area() {
      return base * altura;
   }

   public double perimetro() {
      return base * 2 + altura * 2;
   }
}
