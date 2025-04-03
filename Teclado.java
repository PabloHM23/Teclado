package TecladoRGB;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Teclado {

    private JFrame frame;
    private JPanel lastPressedKeyPanel = null;
    private String[] palabras = {
        "casa", "perro", "gato", "arbol", "sol", "luna", "cielo", "mar", "rio", "montaña",
        "libro", "lapiz", "hoja", "flor", "pasto", "nube", "viento", "lluvia", "nieve", "fuego",
        "mesa", "silla", "puerta", "ventana", "pared", "techo", "suelo", "cocina", "baño", "cuarto",
        "computadora", "telefono", "television", "radio", "reloj", "lampara", "espejo", "cuadro", "alfombra", "cortina",
        "bicicleta", "auto", "bus", "tren", "avion", "barco", "moto", "camion", "taxi", "metro",
        "playa", "bosque", "desierto", "selva", "pantano", "valle", "cañon", "volcan", "isla", "oceano",
        "escuela", "hospital", "parque", "tienda", "mercado", "banco", "hotel", "restaurante", "cine", "museo",
        "doctor", "maestro", "ingeniero", "arquitecto", "cocinero", "musico", "pintor", "escritor", "actor", "deportista",
        "familia", "amigo", "vecino", "compañero", "novio", "novia", "esposo", "esposa", "hijo", "hija",
        "felicidad", "amor", "paz", "alegria", "tristeza", "enojo", "miedo", "sorpresa", "esperanza", "sueño"
    };
    private String palabraActual;
    private JLabel lblPalabra;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Teclado window = new Teclado();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Teclado() {
        initialize();
        seleccionarPalabraAleatoria();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 723, 378);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(255, 255, 255)));
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        
        lblPalabra = new JLabel("");
        lblPalabra.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(lblPalabra);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(192, 192, 192));
        panel_2.setBorder(new LineBorder(new Color(255, 255, 255)));
        frame.getContentPane().add(panel_2, BorderLayout.CENTER);
        panel_2.setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(70, 88, 50, 50);
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1);
        
        JLabel lblNewLabel = new JLabel("Q");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1.add(lblNewLabel);
        
        JPanel panel_1_1 = new JPanel();
        panel_1_1.setBackground(new Color(255, 255, 255));
        panel_1_1.setBounds(124, 88, 50, 50);
        panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_1);
        
        JLabel lblW = new JLabel("W");
        lblW.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_1.add(lblW);
        
        JPanel panel_1_2 = new JPanel();
        panel_1_2.setBackground(new Color(255, 255, 255));
        panel_1_2.setBounds(178, 88, 50, 50);
        panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_2);
        
        JLabel lblE = new JLabel("E");
        lblE.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_2.add(lblE);
        
        JPanel panel_1_3 = new JPanel();
        panel_1_3.setBackground(new Color(255, 255, 255));
        panel_1_3.setBounds(232, 88, 50, 50);
        panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_3);
        
        JLabel lblNewLabel_3 = new JLabel("R");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_3.add(lblNewLabel_3);
        
        JPanel panel_1_4 = new JPanel();
        panel_1_4.setBackground(new Color(255, 255, 255));
        panel_1_4.setBounds(285, 88, 50, 50);
        panel_1_4.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_4);
        
        JLabel lblNewLabel_4 = new JLabel("T");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_4.add(lblNewLabel_4);
        
        JPanel panel_1_5 = new JPanel();
        panel_1_5.setBackground(new Color(255, 255, 255));
        panel_1_5.setBounds(339, 88, 50, 50);
        panel_1_5.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_5);
        
        JLabel lblNewLabel_5 = new JLabel("Y");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_5.add(lblNewLabel_5);
        
        JPanel panel_1_6 = new JPanel();
        panel_1_6.setBackground(new Color(255, 255, 255));
        panel_1_6.setBounds(393, 88, 50, 50);
        panel_1_6.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_6);
        
        JLabel lblNewLabel_6 = new JLabel("U");
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_6.add(lblNewLabel_6);
        
        JPanel panel_1_7 = new JPanel();
        panel_1_7.setBackground(new Color(255, 255, 255));
        panel_1_7.setBounds(446, 88, 50, 50);
        panel_1_7.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_7);
        
        JLabel lblNewLabel_7 = new JLabel("I");
        lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_7.add(lblNewLabel_7);
        
        JPanel panel_1_8 = new JPanel();
        panel_1_8.setBackground(new Color(255, 255, 255));
        panel_1_8.setBounds(500, 88, 50, 50);
        panel_1_8.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_8);
        
        JLabel lblNewLabel_8 = new JLabel("O");
        lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_8.add(lblNewLabel_8);
        
        JPanel panel_1_9 = new JPanel();
        panel_1_9.setBackground(new Color(255, 255, 255));
        panel_1_9.setBounds(554, 88, 50, 50);
        panel_1_9.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_9);
        
        JLabel lblNewLabel_9 = new JLabel("P");
        lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_9.add(lblNewLabel_9);
        
        JPanel panel_1_10 = new JPanel();
        panel_1_10.setBackground(new Color(255, 255, 255));
        panel_1_10.setBounds(88, 142, 50, 50);
        panel_1_10.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_10);
        
        JLabel lblA = new JLabel("A");
        lblA.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_10.add(lblA);
        
        JPanel panel_1_11 = new JPanel();
        panel_1_11.setBackground(new Color(255, 255, 255));
        panel_1_11.setBounds(142, 142, 50, 50);
        panel_1_11.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_11);
        
        JLabel lblS = new JLabel("S");
        lblS.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_11.add(lblS);
        
        JPanel panel_1_12 = new JPanel();
        panel_1_12.setBackground(new Color(255, 255, 255));
        panel_1_12.setBounds(196, 142, 50, 50);
        panel_1_12.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_12);
        
        JLabel lblD = new JLabel("D");
        lblD.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_12.add(lblD);
        
        JPanel panel_1_13 = new JPanel();
        panel_1_13.setBackground(new Color(255, 255, 255));
        panel_1_13.setBounds(250, 142, 50, 50);
        panel_1_13.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_13);
        
        JLabel lblNewLabel_11 = new JLabel("F");
        lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_13.add(lblNewLabel_11);
        
        JPanel panel_1_14 = new JPanel();
        panel_1_14.setBackground(new Color(255, 255, 255));
        panel_1_14.setBounds(304, 142, 50, 50);
        panel_1_14.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_14);
        
        JLabel lblNewLabel_12 = new JLabel("G");
        lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_14.add(lblNewLabel_12);
        
        JPanel panel_1_15 = new JPanel();
        panel_1_15.setBackground(new Color(255, 255, 255));
        panel_1_15.setBounds(358, 142, 50, 50);
        panel_1_15.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_15);
        
        JLabel lblNewLabel_13 = new JLabel("H");
        lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_15.add(lblNewLabel_13);
        
        JPanel panel_1_16 = new JPanel();
        panel_1_16.setBackground(new Color(255, 255, 255));
        panel_1_16.setBounds(412, 142, 50, 50);
        panel_1_16.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_16);
        
        JLabel lblNewLabel_14 = new JLabel("J");
        lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_16.add(lblNewLabel_14);
        
        JPanel panel_1_17 = new JPanel();
        panel_1_17.setBackground(new Color(255, 255, 255));
        panel_1_17.setBounds(466, 142, 50, 50);
        panel_1_17.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_17);
        
        JLabel lblNewLabel_15 = new JLabel("K");
        lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_17.add(lblNewLabel_15);
        
        JPanel panel_1_18 = new JPanel();
        panel_1_18.setBackground(new Color(255, 255, 255));
        panel_1_18.setBounds(520, 142, 50, 50);
        panel_1_18.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_18);
        
        JLabel lblNewLabel_16 = new JLabel("L");
        lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_18.add(lblNewLabel_16);
        
        JPanel panel_1_19 = new JPanel();
        panel_1_19.setBackground(new Color(255, 255, 255));
        panel_1_19.setBounds(574, 142, 50, 50);
        panel_1_19.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_19);
        
        JLabel lblNewLabel_17 = new JLabel("Ñ");
        lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_19.add(lblNewLabel_17);
        
        JPanel panel_1_20 = new JPanel();
        panel_1_20.setBackground(new Color(255, 255, 255));
        panel_1_20.setBounds(112, 196, 50, 50);
        panel_1_20.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_20);
        
        JLabel lblZ = new JLabel("Z");
        lblZ.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_20.add(lblZ);
        
        JPanel panel_1_21 = new JPanel();
        panel_1_21.setBackground(new Color(255, 255, 255));
        panel_1_21.setBounds(166, 196, 50, 50);
        panel_1_21.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_21);
        
        JLabel lblNewLabel_1 = new JLabel("X");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_21.add(lblNewLabel_1);
        
        JPanel panel_1_22 = new JPanel();
        panel_1_22.setBackground(new Color(255, 255, 255));
        panel_1_22.setBounds(220, 196, 50, 50);
        panel_1_22.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_22);
        
        JLabel lblNewLabel_2 = new JLabel("C");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_22.add(lblNewLabel_2);
        
        JPanel panel_1_23 = new JPanel();
        panel_1_23.setBackground(new Color(255, 255, 255));
        panel_1_23.setBounds(274, 196, 50, 50);
        panel_1_23.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_23);
        
        JLabel lblNewLabel_10 = new JLabel("V");
        lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_23.add(lblNewLabel_10);
        
        JPanel panel_1_24 = new JPanel();
        panel_1_24.setBackground(new Color(255, 255, 255));
        panel_1_24.setBounds(328, 196, 50, 50);
        panel_1_24.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_24);
        
        JLabel lblNewLabel_18 = new JLabel("B");
        lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_24.add(lblNewLabel_18);
        
        JPanel panel_1_25 = new JPanel();
        panel_1_25.setBackground(new Color(255, 255, 255));
        panel_1_25.setBounds(382, 196, 50, 50);
        panel_1_25.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_25);
        
        JLabel lblNewLabel_19 = new JLabel("N");
        lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_25.add(lblNewLabel_19);
        
        JPanel panel_1_26 = new JPanel();
        panel_1_26.setBackground(new Color(255, 255, 255));
        panel_1_26.setBounds(436, 196, 50, 50);
        panel_1_26.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_1_26);
        
        JLabel lblNewLabel_20 = new JLabel("M");
        lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel_1_26.add(lblNewLabel_20);
        
 
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char tecla = Character.toLowerCase(e.getKeyChar());
                JPanel teclaPanel = encontrarTeclaPorCaracter(panel_2, tecla);
                
                if (teclaPanel != null) {
                    if (lastPressedKeyPanel != null) {
                        lastPressedKeyPanel.setBackground(Color.WHITE);
                    }
                    
                    Color colorAleatorio = generarColorAleatorio();
                    teclaPanel.setBackground(colorAleatorio);
                    lastPressedKeyPanel = teclaPanel;
                }
            }
        });
        
        frame.setFocusable(true);
        frame.requestFocusInWindow();
    }
    
    private JPanel encontrarTeclaPorCaracter(JPanel panelTeclado, char c) {
        String textoBuscado = String.valueOf(Character.toUpperCase(c));
        
        for (java.awt.Component comp : panelTeclado.getComponents()) {
            if (comp instanceof JPanel) {
                JPanel tecla = (JPanel) comp;
                for (java.awt.Component labelComp : tecla.getComponents()) {
                    if (labelComp instanceof JLabel) {
                        JLabel label = (JLabel) labelComp;
                        if (label.getText().equalsIgnoreCase(textoBuscado)) {
                            return tecla;
                        }
                    }
                }
            }
        }
        return null;
    }
    
    private Color generarColorAleatorio() {
        Random rand = new Random();
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }
    
    private void seleccionarPalabraAleatoria() {
        Random rand = new Random();
        palabraActual = palabras[rand.nextInt(palabras.length)];
        lblPalabra.setText(palabraActual);
    }
}