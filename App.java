package Lesson8;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    public App() {
        setTitle("First Programm");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 300);

       JButton Knopka = new JButton("0");
      add(Knopka,BorderLayout.NORTH);

      JButton Knopka2 = new JButton("Hello");
      add(Knopka2,BorderLayout.SOUTH);

      ActionBut buttonAction = new ActionBut(Knopka);
        setVisible(true);
    }
        public static void main (String[]args){
            new App();
        }
    }
