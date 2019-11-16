package Memento;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;

public class FileSaver implements ActionListener {
    private TextEditor textEditor;

    FileSaver(TextEditor textEditor){
        this.textEditor = textEditor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            PrintWriter out = new PrintWriter("src/main/java/Memento/MementoFile.txt");
            out.println(textEditor.getTextPane().getText());
            out.flush();
            out.close();
            JOptionPane.showMessageDialog(null, "File saved successfully");
        }catch (IOException fileException){
            JOptionPane.showMessageDialog(null, "Could not Save File");
        }
    }
}
