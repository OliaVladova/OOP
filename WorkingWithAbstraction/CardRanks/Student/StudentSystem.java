package WorkingWithAbstraction.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void parseCommand(String[] args) {

        if (args[0].equals("Create")) {
            create(args);

        } else if (args[0].equals("Show")) {
            String name = args[1];
            if (repo.containsKey(name)) {
                String view = show(name);
                System.out.println(view);
            }
        }
    }

    private String show(String name) {
        Student student = repo.get(name);
        String view = String.format("%s is %s years old.", student.getName(), student.getAge());

        if (student.getGrade() >= 5.00) {
            view += " Excellent student.";
        } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
            view += " Average student.";
        } else {
            view += " Very nice person.";
        }
        return view;
    }

    private void create(String[] args) {
        String name = args[1];
        int age = Integer.parseInt(args[2]);
        double grade = Double.parseDouble(args[3]);

        Student student = new Student(name, age, grade);
        this.repo.putIfAbsent(name, student);
    }
}
