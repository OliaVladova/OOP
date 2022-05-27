package InterfacesAndAbstraction.BorderControl;

public class Main {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        List<Citizen> citizens = new ArrayList<>();
        List<Robot> robots = new ArrayList<>();
        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] lineInput = line.split("\\s+");
            if (lineInput.length > 2) {
                String name = lineInput[0];
                int age = Integer.parseInt(lineInput[1]);
                String id = lineInput[2];
                Citizen citizen = new Citizen(name, age, id);
                citizens.add(citizen);
            } else {
                String model = lineInput[0];
                String id = lineInput[1];
                Robot robot = new Robot(id, model);
                robots.add(robot);
            }
            line = scanner.nextLine();
        }
        String idToRemove = scanner.nextLine();

        for (Citizen cit: citizens) {
            if (cit.getId().endsWith(idToRemove)){
                System.out.println(cit.getId());
            }
        }
        for (Robot robot:robots ) {
            if (robot.getId().endsWith(idToRemove)){
                System.out.println(robot.getId());
            }
        }*/
    }
}
