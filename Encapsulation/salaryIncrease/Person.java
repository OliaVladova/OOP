package Encapsulation.salaryIncrease;

public class Person {
    //•	firstName: String
    private String firstName;
    //•	lastName: String
    private String lastName;
    //•	age: int
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length()>=3) {
            this.firstName = firstName;
        }else {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length()>=3) {
            this.lastName = lastName;
        }else {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }else {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary>=460) {
            this.salary = salary;
        }else {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
    }

    public void increaseSalary(double bonus) {
        if (this.age < 30) {
            this.salary = this.salary + (this.salary * (bonus / 200));
        } else {
            this.salary = this.salary + (this.salary * (bonus / 100));
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        //Angel Ivanov gets 2640.0 leva

        builder.append(String.format("%s %s gets %f leva", this.firstName, this.lastName, this.salary));
        return builder.toString();
    }

}
