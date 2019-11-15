/*  www  .  jav a2s. com*/
import java.awt.*;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.Element;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new TextStyleTestFrame();
        frame.setSize(600, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}

class TextStyleTestFrame extends JFrame {
    private JButton button1 = new JButton("Bold");
    private JButton button2 = new JButton("Italic");
    private JButton button3 = new JButton("Underline");
    private JTextPane textPane = new JTextPane();

    public TextStyleTestFrame() {
        button1.setPreferredSize(new Dimension(200, 25));
        button2.setPreferredSize(new Dimension(200, 25));
        button3.setPreferredSize(new Dimension(200, 25));
        textPane.setText("this is a test.");
        Font font1 = new Font("SansSerif", Font.PLAIN, 20);
        textPane.setFont(font1);
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