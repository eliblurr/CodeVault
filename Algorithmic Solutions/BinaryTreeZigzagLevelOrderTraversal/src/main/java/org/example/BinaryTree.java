package org.example;

public class BinaryTree {
    private BinaryTree.Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public static class Node {
        private Node left;
        private Node right;
        private Integer data;

        public Node(Node left, Node right, int data){
            this.left = left;
            this.right = right;
            this.data = data;
        }

        public Integer getData() { return data; }
        public Node getLeft() { return left; }
        public Node getRight() { return right; }

        public void setLeft(Node left) { this.left = left; }
        public void setRight(Node right) { this.right = right; }
        public void setData(Integer data) { this.data = data; }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRightNode(Node node){
        if (node.right == null)
            return null;
        return node.right;
    }

    public Node getLeftNode(Node node){
        if (node.left == null)
            return null;
        return node.left;
    }
}
