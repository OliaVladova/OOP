package Inheritance.StackOfStrings;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    //•	Public method: push(String item): void
    public void push(String item){
        data.add(item);
    }
    //•	Public method: pop(): String
    public String pop(){
        return this.data.remove(this.data.size()-1);
    }
    //•	Public method: peek(): String
    public String peek(){
       return this.data.get(this.data.size()-1);
    }
    //•	Public method: isEmpty(): boolean
    public boolean isEmpty(){
        return this.data.isEmpty();
    }
}
