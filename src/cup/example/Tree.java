package cup.example;

import java.util.List;

public class Tree {
    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public void printTree() {
        printNode(root, 0);
    }

    public void printNode(Node node, int depth) {
        if (node == null) {
            return;
        }

        if (node.shouldBeDisplayed() && node.getData() != null && !node.getData().equals("tel")) {
            for (int i = 0; i < depth; i++) {
                System.out.print("  ");
            }
            System.out.println(node.getData());
        }

        List<Node> children = node.getChildren();
        List<Node> brothers = node.getBrotherNodes();
        if (node.getData() == null) {
            children.forEach(child -> printNode(child, depth));
        } else {
            children.forEach(child -> printNode(child, depth + 1));
        }
        brothers.forEach(brother -> printNode(brother, depth));
    }
}