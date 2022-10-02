public class Trapecio{

   public double b1, b2, lado, altura;

   public double perimetro(){
      return b1+b2+lado+altura;
   }
   public double area(){
      return (b1+b2) * altura / 2;
   }
}
