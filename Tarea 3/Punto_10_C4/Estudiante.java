//package Punto_10_C4;

public class Estudiante {
   public double patrimonio;
   public int estrato, numeroInscripcion;
   public String nombre;

   private double pago() {
      if (patrimonio > 2000000 && estrato > 3) {
         return (50000 + patrimonio * 0.03);
      }
      return 50000;
   }

   public String texto() {
      return ("El estudiante " + nombre + " con numero de inscripcion " + numeroInscripcion + " debe de pagar "
            + pago());
   }
}
