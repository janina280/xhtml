package cup.example;
import java.util.ArrayList;
import java.util.List;

public class Node {
    private String data;
    private List<Node> children;
    private List<Node> brotherNodes;
    private boolean shouldBeDisplayed = true;

    public Node(String data) {
        this.data = data;
        this.children = new ArrayList<>();
        this.brotherNodes = new ArrayList<>(); 
    }

    public void addChild(Node child) {
        if (child != null) {
            children.add(child);
        }
    }

    public void addBrother(Node child) {
        if (child != null) {
            brotherNodes.add(child);
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Node> getChildren() {
        return children;
    }

    public List<Node> getBrotherNodes() {
        return brotherNodes;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public boolean shouldBeDisplayed() {
        return shouldBeDisplayed;
    }

    public void setShouldBeDisplayed(boolean displayNode) {
        this.shouldBeDisplayed = displayNode;
    }

    public static Node createNode(String nodeName, Node... children) {
        Node node = new Node(nodeName);

        for (Node child : children) {
            if (child != null) {
                node.addChild(child);
            }
        }

        return node;
    }
}