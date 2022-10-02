//package Punto_22_C4;

public class Empleado {
   public String nombre;
   public float salh, hor;

   public String texto() {
      if (salh * hor > 450000) {
         return ("nombre: " + nombre + " salario:$" + salh * hor);
      }
      return ("nombre: " + nombre);

   }
}
