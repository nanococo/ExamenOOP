package Memento;/*  www  .  jav a2s. com*/

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new TextEditor();
        frame.setSize(600, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}