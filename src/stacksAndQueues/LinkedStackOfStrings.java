package stacksAndQueues;

public class LinkedStackOfStrings {

    private class Node{
        String item;
        Node next;
    }

    private Node firstNode = null;

    public boolean IsEmpty(){
        return firstNode == null;
    }

    public void Push(String item){
        Node oldFirstNode = firstNode;
        Node newNode = new Node();
        newNode.next = oldFirstNode;
        newNode.item = item;
        firstNode = newNode;
    }

    public String Pop(){
        String item = firstNode.item;
        firstNode = firstNode.next;
        return item;
    }
}
