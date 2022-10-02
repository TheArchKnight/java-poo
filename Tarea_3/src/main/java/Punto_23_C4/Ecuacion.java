
public class Ecuacion {
   public double A, B, C;
   public double X_1, X_2;

   public String solucion() {
      double formula_general = Math.sqrt((B * B) - 4 * (A - C));
      if (formula_general > 0) {
         X_1 = (-B + formula_general) / (2 * A);
         X_2 = (-B - formula_general) / (2 * A);
         return ("Primera solucion: X1=" + X_1 + " Segunda solucion: X2=" + X_2);
      } else if (formula_general == 0) {
         X_1 = (-B) / (2 * A);
         return ("la solucion unica es: " + X_1);
      }
      return ("El conjunto solucion es imaginaria");

   }
}
