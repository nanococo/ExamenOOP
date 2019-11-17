package Iterator.structures;

import Iterator.nodes.BinaryNode;

import java.util.ArrayList;
import java.util.Iterator;

public class BinaryTree implements Iterator {
    private ArrayList<Integer> inorderHolder = new ArrayList<>();
    private int currentIndex = 0;

    private BinaryNode root;

    private void insert(int index){
        if(root==null){
            root = new BinaryNode(index);
        } else {
            root.insert(new BinaryNode(index));
        }
    }

    public void inorder(){
        root.inorder(root, inorderHolder);
    }


    @Override
    public boolean hasNext() {
        return currentIndex < inorderHolder.size();
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return inorderHolder.get(currentIndex++);
        }
        return null;
    }

    public void addValues(int i) {
        int count = 0;
        while (count<i){
            insert(count);
            count++;
        }
    }
}
