package Inheritance.RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {
    public Object getRandomElement(){
        Object toReturn = new Random().nextInt();
        remove(toReturn);
        return toReturn;
    }
}
