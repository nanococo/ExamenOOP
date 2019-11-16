package Memento;

import org.apache.commons.io.FileUtils;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class FileLoader implements ActionListener {
    private TextEditor textEditor;
    private String absolutePathToFile;

    FileLoader(TextEditor textEditor){
        this.textEditor = textEditor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            int r = j.showSaveDialog(null);

            if(r == JFileChooser.APPROVE_OPTION){
                absolutePathToFile = j.getSelectedFile().getAbsolutePath();
            }
            File file = new File(absolutePathToFile);
            String fileAsString = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            textEditor.getTextPane().setText(fileAsString);

        }catch (IOException fileException){
            JOptionPane.showMessageDialog(null, "Could not open file");
        }
    }
}
