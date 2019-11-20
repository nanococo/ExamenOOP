package Iterator.nodes;

import Iterator.structures.CircularLinkedList;

public class CircularListNode {

    private Integer data;
    private CircularListNode next;

    public CircularListNode(Integer data){
        this.data = data;
    }

    public void insertAtEnd(CircularListNode node, CircularListNode first) {
        if(next==null){
            next = node;
        } else {
            if(next==first){
                next = node;
                node.setNext(first);
            } else {
                next.insertAtEnd(node, first);
            }
        }
    }

    public CircularListNode getNext() {
        return next;
    }

    public void setNext(CircularListNode next) {
        this.next = next;
    }

    public Integer getData() {
        return data;
    }
}
