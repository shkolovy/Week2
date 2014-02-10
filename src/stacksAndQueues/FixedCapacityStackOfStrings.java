package stacksAndQueues;

/**
 * Created by Superman on 2/8/14.
 */

public class FixedCapacityStackOfStrings {
    private int n = 0;
    private String[] strings;

    public FixedCapacityStackOfStrings(int capacity){
        strings = new String[capacity];
    }

    public boolean IsEmpty(){
        return n == 0;
    }

    public void Push(String item){
        strings[n++] = item;
    }

    public String Pop(){
        return strings[--n];
    }
}

