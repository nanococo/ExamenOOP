package Memento;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.ArrayList;

class MementoOriginator implements DocumentListener {

    private JTextPane displayArea;
    private ArrayList<Memento> mementos;

    MementoOriginator(ArrayList<Memento> mementos, JTextPane displayArea){
        this.mementos = mementos;
        this.displayArea = displayArea;
    }

    public JTextPane getDisplayArea() {
        return displayArea;
    }

    public void setDisplayArea(JTextPane displayArea) {
        this.displayArea = displayArea;
    }

    public ArrayList<Memento> getMementos() {
        return mementos;
    }

    public void setMementos(ArrayList<Memento> mementos) {
        this.mementos = mementos;
    }

    static void printMementos(ArrayList<Memento> mementos){
        System.out.println("--------------------------------------");
        System.out.println(mementos.size());
        for(Memento m : mementos){
            System.out.println(mementos.indexOf(m) + ";" + m.getjTextContent());
        }
    }

    //final String newline = "\n";


    private void insertMemento(Memento m){
        if (mementos.size()<=11){
            if(mementos.isEmpty()){
                mementos.add(m);
            } else {
                if(!mementos.get(mementos.size()-1).getjTextContent().equals(m.getjTextContent())){
                    mementos.add(m);
                }
            }
        } else {
            mementos.remove(0);
            mementos.add(m);
            System.out.println("Full Memento.Memento");
        }
        printMementos(mementos);
    }

    public void insertUpdate(DocumentEvent e) {
        //updateLog(e, "inserted into");
        if (!displayArea.getText().equals("")) {
            insertMemento(new Memento(displayArea.getText()));
        }
    }
    public void removeUpdate(DocumentEvent e) {
        //updateLog(e, "removed from");
        if (!displayArea.getText().equals("")) {
            insertMemento(new Memento(displayArea.getText()));
        }
    }
    public void changedUpdate(DocumentEvent e) {
        //Plain text components don't fire these events.
    }
}