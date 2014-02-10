package stacksAndQueues;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private class LinkedListIterator implements Iterator<T>{
        private Node current = null;

        @Override
        public boolean hasNext() {
            return current.next != null;
        }

        @Override
        public T next() {
            T item = current.item;
            current = current.next;

            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class Node{
        T item;
        Node next;
    }

    private Node firstNode = null;

    public boolean IsEmpty(){
        return firstNode == null;
    }

    public void Push(T item){
        Node oldFirstNode = firstNode;
        Node newNode = new Node();
        newNode.next = oldFirstNode;
        newNode.item = item;
        firstNode = newNode;
    }

    public T Pop(){
        T item = firstNode.item;
        firstNode = firstNode.next;
        return item;
    }
}
