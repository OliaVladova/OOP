package InterfacesAndAbstraction.FoodShortage;


public class Citizen implements Identifiable, Person, Buyer {
    //-	name: String
    private String name;
    //-	age: int
    private int age;
    //-	id: String
    private String id;
    //-	birthDate: String
    private String birthDate;
    private int food = 0;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }



    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
    @Override
    public String toString(){
        return null;
    }

    @Override
    public void buyFood() {
        this.food+=10;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
