package Iterator.structures;

import Iterator.nodes.LinkedListNode;

import java.util.Iterator;

public class SinglyLinkedList implements Iterator {

    private LinkedListNode first;
    private LinkedListNode aux;

    private void insert(LinkedListNode node){
        if(first==null){
            first = aux = node;
        } else {
            first.insertAtEnd(node);
        }
    }

    public void addValues(int i) {
        int count = 0;
        while (count<i){
            insert(new LinkedListNode(count));
            count++;
        }
    }

    @Override
    public boolean hasNext() {
        return aux != null;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            LinkedListNode tmp = aux;
            aux = aux.getNext();
            return tmp;
        }
        return null;
    }
}
