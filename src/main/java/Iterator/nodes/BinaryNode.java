package Iterator.nodes;

import java.util.ArrayList;

public class BinaryNode {
    private BinaryNode left;
    private BinaryNode right;
    private Integer data;

    public BinaryNode(int data){
        this.data = data;
    }

    public void insert(BinaryNode node){
        if(node.data<data){
            if(left==null){
                left = node;
            } else {
                left.insert(node);
            }
        } else {
            if(right==null){
                right = node;
            } else {
                right.insert(node);
            }
        }
    }

    public void inorder(BinaryNode R, ArrayList<Integer> inorderHelper){
        if(R!=null){
            inorder(R.left, inorderHelper);
            inorderHelper.add(R.data);
            inorder(R.right, inorderHelper);
        }
    }
}
