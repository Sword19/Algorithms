/**
 * Created by deadlydragon00 on 7/8/2015.
 */
public class LinkedStringStack {

    Node currentNode = null;

    class Node {
        public String name;
        public Node node;
    }

    public static void main(String[] args) {
        
    }


    boolean isEmpty() {
        return currentNode == null;
    }

    public String pop() {
        String name = currentNode.name;
        currentNode = currentNode.node;
        return name;
    }

    public void push(String name) {
        Node hold = currentNode;
        currentNode = new Node();
        currentNode.name = name;
        currentNode.node = hold;
    }

}
