package Memento;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

class TextEditor extends JFrame {
    private FileLoader fileLoader = new FileLoader(this);
    private FileSaver fileSaver = new FileSaver(this);
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menu = new JMenu("File");
    private JMenuItem loadFileMenuItem = new JMenuItem("Load File");
    private JMenuItem saveFileMenuItem = new JMenuItem("Save File");
    private JButton button1 = new JButton("Bold");
    private JButton button2 = new JButton("Italic");
    private JButton button3 = new JButton("Underline");
    private JTextPane textPane = new JTextPane();
    private ArrayList<Memento> mementos = new ArrayList<>();


    TextEditor() {
        menuBar.add(menu);
        menu.add(saveFileMenuItem);
        menu.add(loadFileMenuItem);
        loadFileMenuItem.addActionListener(fileLoader);
        saveFileMenuItem.addActionListener(fileSaver);
        this.setJMenuBar(menuBar);
        mementos.add(new Memento(""));
        button1.setPreferredSize(new Dimension(200, 25));
        button2.setPreferredSize(new Dimension(200, 25));
        button3.setPreferredSize(new Dimension(200, 25));
        Font font1 = new Font("SansSerif", Font.PLAIN, 20);
        textPane.setFont(font1);

        KeyStroke ctrlZ = KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK);
        ActionListener ctrlVAction = textPane.getActionForKeyStroke(ctrlZ);
        textPane.registerKeyboardAction(new CombinedAction(ctrlVAction, e -> setPrevMemento()), ctrlZ, JComponent.WHEN_FOCUSED);

        textPane.getDocument().addDocumentListener(new MementoOriginator(mementos, textPane));

        add(textPane, BorderLayout.CENTER);

        JPanel panel = new JPanel();

        panel.setLayout(new BorderLayout());
        panel.add(button1, BorderLayout.LINE_START);
        panel.add(button3, BorderLayout.CENTER);
        panel.add(button2, BorderLayout.LINE_END);
        add(panel, BorderLayout.BEFORE_FIRST_LINE);


        button1.addActionListener(e -> changeStyleBold());
        button2.addActionListener(e -> changeStyleItalic());
        button3.addActionListener(e -> changeStyleUnderline());


    }

    public JTextPane getTextPane() {
        return textPane;
    }

    private void setPrevMemento(){
        if(mementos.size()>1){
            mementos.remove(mementos.size()-1);
            textPane.setText(mementos.get(mementos.size()-1).getjTextContent());

        }
    }

    private void changeStyleBold() {
        StyledDocument doc = (StyledDocument) textPane.getDocument();
        int selectionEnd = textPane.getSelectionEnd();
        int selectionStart = textPane.getSelectionStart();
        if (selectionStart == selectionEnd) {
            return;
        }
        Element element = doc.getCharacterElement(selectionStart);
        AttributeSet as = element.getAttributes();

        MutableAttributeSet asNew = new SimpleAttributeSet(as.copyAttributes());
        StyleConstants.setBold(asNew, !StyleConstants.isBold(as));
        doc.setCharacterAttributes(selectionStart, textPane.getSelectedText()
                .length(), asNew, true);
        String text = (StyleConstants.isBold(as) ? "Cancel Bold" : "Bold");
        button1.setText(text);
    }

    private void changeStyleItalic() {
        StyledDocument doc = (StyledDocument) textPane.getDocument();
        int selectionEnd = textPane.getSelectionEnd();
        int selectionStart = textPane.getSelectionStart();
        if (selectionStart == selectionEnd) {
            return;
        }
        Element element = doc.getCharacterElement(selectionStart);
        AttributeSet as = element.getAttributes();

        MutableAttributeSet asNew = new SimpleAttributeSet(as.copyAttributes());
        StyleConstants.setItalic(asNew, !StyleConstants.isItalic(as));
        doc.setCharacterAttributes(selectionStart, textPane.getSelectedText()
                .length(), asNew, true);
        String text = (StyleConstants.isBold(as) ? "Cancel Italic" : "Italic");
        button2.setText(text);
    }

    private void changeStyleUnderline() {
        StyledDocument doc = (StyledDocument) textPane.getDocument();
        int selectionEnd = textPane.getSelectionEnd();
        int selectionStart = textPane.getSelectionStart();
        if (selectionStart == selectionEnd) {
            return;
        }
        Element element = doc.getCharacterElement(selectionStart);
        AttributeSet as = element.getAttributes();

        MutableAttributeSet asNew = new SimpleAttributeSet(as.copyAttributes());
        StyleConstants.setUnderline(asNew, !StyleConstants.isUnderline(as));
        doc.setCharacterAttributes(selectionStart, textPane.getSelectedText()
                .length(), asNew, true);
        String text = (StyleConstants.isUnderline(as) ? "Cancel Underline" : "Underline");
        button3.setText(text);
    }
}

