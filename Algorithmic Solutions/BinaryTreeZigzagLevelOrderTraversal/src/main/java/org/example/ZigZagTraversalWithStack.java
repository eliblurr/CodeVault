package org.example;

import java.util.Stack;

public class ZigZagTraversalWithStack {
    static Stack<BinaryTree.Node> s1 = new Stack<>();
    static Stack<BinaryTree.Node> s2 = new Stack<>();

    public static void traverse(BinaryTree.Node node, Boolean leftToRight) {
        // init determines direction
        // [s1 & level==1 -> left to right]
        // [s2 & level==0 -> right to left]
        int level = 0;
        if (leftToRight){
            s1.push(node);
            level = 1;
        } else { s2.push(node);}

        while (!s1.isEmpty() || !s2.isEmpty()) {
            if (level % 2 == 0 && !s2.isEmpty()) {
                BinaryTree.Node n = s2.pop();
                System.out.println(n.getData());
                if (n.getLeft() != null) s1.push(n.getLeft());
                if (n.getRight() != null) s1.push(n.getRight());
            } else if (!s1.isEmpty()) {
                BinaryTree.Node n = s1.pop();
                System.out.println(n.getData());
                if (n.getRight() != null) s2.push(n.getRight());
                if (n.getLeft() != null) s2.push(n.getLeft());
            }
            level++;
        }
    }
}
