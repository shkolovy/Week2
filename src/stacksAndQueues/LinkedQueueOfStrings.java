package stacksAndQueues;

public class LinkedQueueOfStrings {

    private class Node{
        String item;
        Node next;
    }

    private Node firstNode = null;
    private Node lastNode = null;

    public boolean IsEmpty(){
        return firstNode == null;
    }

    public void EnQueue(String item){
        Node oldLastNode = lastNode;

        Node newLastNode = new Node();
        newLastNode.item = item;
        newLastNode.next = null;

        lastNode = newLastNode;

        if(IsEmpty()){
            firstNode = newLastNode;
        }
        else{
            oldLastNode.next = newLastNode;
        }
    }

    public String DeQueue(){
        String item = firstNode.item;

        firstNode = firstNode.next;

        if(IsEmpty()){
            lastNode = null;
        }

        return item;
    }
}
