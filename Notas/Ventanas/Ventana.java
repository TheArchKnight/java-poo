import javax.swing.JFrame;

public class Ventana extends JFrame {
   public Ventana() {
      setSize(500, 500); // Tamaño de la ventana, ancho y alto
      // setLocation(100, 200); // Ubicacion de aparicion de la ventana
      // setBounds(100, 200, 500, 500); // Establecer posicion y tamaño de la ventana
      setDefaultCloseOperation(EXIT_ON_CLOSE); // Terminar el programa una vez se cierre la ventana
      setLocationRelativeTo(null); // Establecer ubicacion relativo a algo.
      setTitle("Mi ventana"); // Titulo de la ventana

   }
}
