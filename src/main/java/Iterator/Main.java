package Iterator;

import Iterator.structures.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.addValues(25);
        binaryTree.inorder();

        while (binaryTree.hasNext()){
            System.out.println(binaryTree.next());
        }
    }
}
