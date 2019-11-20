package Iterator.nodes;

public class LinkedListNode {

    private Integer data;
    private LinkedListNode next;

    public LinkedListNode(Integer data){
        this.data = data;
    }

    public void insertAtEnd(LinkedListNode node) {
        if(next==null){
            next = node;
        } else {
            next.insertAtEnd(node);
        }
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public Integer getData() {
        return data;
    }
}
