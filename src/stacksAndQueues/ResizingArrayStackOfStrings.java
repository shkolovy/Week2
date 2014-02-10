package stacksAndQueues;

public class ResizingArrayStackOfStrings {
    private int n = 0;
    private String[] strings;

    public ResizingArrayStackOfStrings(){
        strings = new String[1];
    }

    public boolean IsEmpty(){
        return n == 0;
    }

    public void Push(String item){
        if(strings.length == n){
            Resize(strings.length*2);
        }

        strings[n++] = item;
    }

    public String Pop(){
        String item = strings[--n];

        strings[n] = null;

        if(strings.length > 0 && n == strings.length / 4){
            Resize(strings.length / 2);
        }

        return item;
    }

    private void Resize(int capacity){
        String[] newArray = new String[capacity];

        for(int i = 0; i < n; i++){
            newArray[i] = strings[i];
        }

        strings = newArray;
    }
}
