package org.example;

public class Main {
    public static void main(String[] args) {

        String targetTree =  """
        Target Tree
            [1]
           /   \\
        [2]     [3]
               /   \\
            [4]     [5]
        """;

        System.out.println(
                targetTree+
                "Possible Expected outputs"+
                "\n[1] 1 - 2 - 3 - 5 - 4 {start left to right}"+
                "\n[2] 1 - 3 - 2 - 4 - 5 {start right to left}"
        );

        BinaryTree.Node node5 = new BinaryTree.Node(null, null, 5);
        BinaryTree.Node node4 = new BinaryTree.Node(null, null, 4);
        BinaryTree.Node node3 = new BinaryTree.Node(node4, node5, 3);
        BinaryTree.Node node2 = new BinaryTree.Node(null, null, 2);
        BinaryTree.Node root = new BinaryTree.Node(node2, node3, 1);
        BinaryTree tree = new BinaryTree(root);
        System.out.print("left to right [Stack]: \n");
        ZigZagTraversalWithStack.traverse(tree.getRoot(), true);
        System.out.print("left to right [Queue] ->");
        ZigZagTraversalWithQueue.traverse(tree.getRoot(), true);
        System.out.print("\nright to left [Queue] -> ");
        ZigZagTraversalWithQueue.traverse(tree.getRoot(), false);
    }
}