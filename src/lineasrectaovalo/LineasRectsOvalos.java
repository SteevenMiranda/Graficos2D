package lineasrectaovalo;

import java.awt.Color;
import javax.swing.JFrame;

public class LineasRectsOvalos {
    // ejecuta la aplicación

    public static void main(String args[]) {
        // crea marco para LineasRectsOvalosJPanel
        JFrame marco = new JFrame("Dibujo de lineas, rectangulos y ovalos");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LineasRectsOvalosJPanel lineasRectsOvalosJPanel = new LineasRectsOvalosJPanel();
        lineasRectsOvalosJPanel.setBackground(Color.WHITE);
        marco.add(lineasRectsOvalosJPanel); // agrega el panel al marco
        marco.setSize(400, 210); // establece el tamaño del marco
        marco.setVisible(true); // muestra el marco
    } // fin de main
} // fin de la clase LineasRectsOvalos
