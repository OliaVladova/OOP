package WorkingWithAbstraction.Hotel;

public enum Season {
    //•	1 during Autumn
    Autumn(1),
    //•	2 during Spring
    Spring(2),
    //•	3 during Winter
    Winter(3),
    //•	4 during Summer
    Summer(4);

    private int multiply;

    Season(int multiply) {
        this.multiply = multiply;
    }

    public int getMultiply() {
        return multiply;
    }
}
