package Inheritance.animals;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public abstract String produceSound();
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder(26);

        builder.append(this.getClass().getSimpleName());
        builder.append("\r");
        builder.append("\n");

        builder.append(name);
        builder.append(' ');
        builder.append(age);
        builder.append(' ');
        builder.append(gender);
        builder.append("\r");
        builder.append("\n");

        builder.append(this.produceSound());

        return builder.toString();
    }
}
