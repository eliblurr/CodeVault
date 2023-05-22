package org.example.tree;

public class Tree { // Binary

    public Node root;

    public Tree() {
        root = null;
    }

    public static class Node{
        public Node left;
        public Node right;
        public int data;

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }

    }

    public void preOrder(Node node){
        // root -> left -> right
        if(node==null){
            return;
        }
        // Traverse root
        System.out.print(node.data + "->");
        // Traverse left
        preOrder(node.left);
        // Traverse right
        preOrder(node.right);
    }

    public void postOrder(Node node){
        // left -> right -> root
        if (node == null)
            return;
        // Traverse left
        postOrder(node.left);
        // Traverse right
        postOrder(node.right);
        // Traverse root
        System.out.print(node.data + "->");
    }

    public void inOrder(Node node){
        // left -> root -> right
        if (node == null)
            return;
        // Traverse left
        inOrder(node.left);
        // Traverse root
        System.out.print(node.data + "->");
        // Traverse right
        inOrder(node.right);
    }


}
