package Iterator.structures;

import Iterator.nodes.CircularListNode;
import Iterator.nodes.LinkedListNode;

import java.util.Iterator;

public class CircularLinkedList implements Iterator {

    private CircularListNode first;
    private CircularListNode aux;
    private boolean hasOne = true;

    private void insert(CircularListNode node){
        if (first==null){
            first = aux = node;
            node.setNext(first);
        } else {
            first.insertAtEnd(node, first);
        }
    }

    public void addValues(int i) {
        int count = 0;
        while (count<i){
            insert(new CircularListNode(count));
            count++;
        }
    }

    @Override
    public boolean hasNext() {
        if(aux!=first || hasOne){
            hasOne = false;
            return true;
        } else {
            if(aux.getNext()==first && hasOne){
                hasOne = false;
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public Object next() {
        CircularListNode tmp = aux;
        aux = aux.getNext();
        return tmp;
    }
}
