public class empleado {
   public int codigo;
   public String nombre = "";
   public int horas;
   public double valorHora;
   public double retencion;

   public double salarioBruto() {
      return this.valorHora * this.horas;
   }

   public double salarioNeto() {
      return salarioBruto() * (1 - retencion / 100);
   }
}
