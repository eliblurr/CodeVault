package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagTraversalWithQueue {

    static private Queue<BinaryTree.Node> queue = new LinkedList<>();

    public static void traverse(BinaryTree.Node node, Boolean leftToRight){
        queue.add(node);
        while (!queue.isEmpty()){
            BinaryTree.Node _node = queue.poll();
            System.out.print(_node.getData()+" ");
            if (leftToRight){
                if (_node.getLeft()!=null) queue.add(_node.getLeft());
                if (_node.getRight()!=null) queue.add(_node.getRight());
            } else {
                if (_node.getRight()!=null) queue.add(_node.getRight());
                if (_node.getLeft()!=null) queue.add(_node.getLeft());
            }
            leftToRight=!leftToRight;
        }
    }

}
