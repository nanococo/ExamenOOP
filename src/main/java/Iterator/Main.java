package Iterator;

import Iterator.nodes.CircularListNode;
import Iterator.nodes.LinkedListNode;
import Iterator.structures.BinaryTree;
import Iterator.structures.CircularLinkedList;
import Iterator.structures.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {

        final int VALUES_TO_INSERT = 5;

        BinaryTree binaryTree = new BinaryTree();
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        binaryTree.addValues(VALUES_TO_INSERT);
        binaryTree.inorder();

        singlyLinkedList.addValues(VALUES_TO_INSERT);
        circularLinkedList.addValues(VALUES_TO_INSERT);

        System.out.println("Binary Tree Inorder: ");
        while (binaryTree.hasNext()){
            System.out.println(binaryTree.next());
        }

        System.out.println("Singly Linked List Traversal: ");
        while (singlyLinkedList.hasNext()){
            System.out.println(((LinkedListNode) singlyLinkedList.next()).getData());
        }

        System.out.println("Circular Linked List Traversal: ");
        while (circularLinkedList.hasNext()){
            System.out.println(((CircularListNode) circularLinkedList.next()).getData());
        }

    }
}
