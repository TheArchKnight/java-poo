package Ventanas;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Color;

public class Ventana extends JFrame {
   public JPanel panel = new JPanel(); // Creacion de un panel

   public Ventana() {
      setSize(500, 500); // Tamaño de la ventana, ancho y alto
      // setLocation(100, 200); // Ubicacion de aparicion de la ventana
      // setBounds(100, 200, 500, 500); // Establecer posicion y tamaño de la ventana
      setDefaultCloseOperation(EXIT_ON_CLOSE); // Terminar el programa una vez se cierre la ventana
      setLocationRelativeTo(null); // Establecer ubicacion relativo a algo.
      setTitle("Mi ventana"); // Titulo de la ventana
      // getContentPane().setBackground(Color.blue);
      iniciarComponentes();
   }

   private void iniciarComponentes() {
      colocarPaneles();
      // colocarEtiquetas();
      colocarBotones();
   }

   private void colocarPaneles() {
      // panel.setBackground(Color.GREEN); // Establecemos el color del panel
      panel.setLayout(null); // Desactivando el diseño por defecto
      this.getContentPane().add(panel); // Añadimos el panel en la ventana

   }

   private void colocarEtiquetas() {
      // Etiqueta de texto
      JLabel etiqueta = new JLabel(); // Creamos una instancia de etiqueta
      // etiqueta de texto
      etiqueta.setBounds(85, 10, 50, 30);
      etiqueta.setForeground(Color.WHITE); // Color de la letra
      etiqueta.setOpaque(true);
      etiqueta.setBackground(Color.BLACK); // Color del fondo de la letra
      etiqueta.setText("Hola");
      etiqueta.setHorizontalAlignment(SwingConstants.CENTER);

      panel.add(etiqueta);

      // Etiqueta 2 - Etiqueta tipo imagen

      ImageIcon imagen = new ImageIcon("unal.png");
      JLabel etiqueta2 = new JLabel();
      etiqueta2.setBounds(10, 80, 150, 200);

      etiqueta2.setIcon(new ImageIcon(
            imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));

      panel.add(etiqueta2);

   }

   private void colocarBotones() {
      JButton boton1 = new JButton("Boton 1");
      boton1.setBounds(100, 100, 100, 40);
      // boton1.setEnabled(false); //Desactivar el boton
      boton1.setMnemonic('a'); // Establecemos alt + letra
      panel.add(boton1);
   }

}