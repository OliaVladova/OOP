package InterfacesAndAbstraction.BirthdayCelebrations;

public class Citizen implements Identifiable, Birthable, Person {
    //-	name: String
    private String name;
    //-	age: int
    private int age;
    //-	id: String
    private String id;
    //-	birthDate: String
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
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

}
