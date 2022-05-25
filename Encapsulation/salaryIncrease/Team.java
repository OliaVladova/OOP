package Encapsulation.salaryIncrease;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    //•	name: String
    private String name;
    //•	firstTeam: List<Encapsulation.Person>
    private List<Person> firstTeam;
    //•	reserveTeam: List<Encapsulation.Person>
    private List<Person> reserveTeam;

    public Team(String name) {
        setName(name);
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    private void setName(String name) {
        this.name = name;
    }
    //•	getName(): String

    public String getName() {
        return name;
    }

    //•	addPlayer(Encapsulation.Person person): void
    public void addPlayer(Person person){
        if (person.getAge()<40){
            this.firstTeam.add(person);
        }else {
            this.reserveTeam.add(person);
        }
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(this.firstTeam);
    }

    //•	getReserveTeam(): List<Encapsulation.Person> (Collections.unmodifiableList)
    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(this.reserveTeam);
    }
}
