
package WorkingWithAbstraction.greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());
        String[] itemsSequence = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, LinkedHashMap<String, Long>> bag = new LinkedHashMap<>();
        long gold = 0;
        long gems = 0;
        long money = 0;

        for (int i = 0; i < itemsSequence.length; i += 2) {
            String name = itemsSequence[i];
            long quantity = Long.parseLong(itemsSequence[i + 1]);

            String itemName = "";

            if (name.length() == 3) {
                itemName = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                itemName = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                itemName = "Gold";
            }

            if (itemName.equals("")) {
                continue;
            } else if (capacity < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + quantity) {
                continue;
            }

            switch (itemName) {
                case "Gem":
                    if (sumQuantity(bag, quantity, itemName, "Gold")) continue;
                    break;
                case "Cash":
                    if (sumQuantity(bag, quantity, itemName, "Gem")) continue;
                    break;
            }

            if (!bag.containsKey(itemName)) {
                bag.put((itemName), new LinkedHashMap<String, Long>());
            }

            if (!bag.get(itemName).containsKey(name)) {
                bag.get(itemName).put(name, 0L);
            }


            bag.get(itemName).put(name, bag.get(itemName).get(name) + quantity);
            if (itemName.equals("Gold")) {
                gold += quantity;
            } else if (itemName.equals("Gem")) {
                gems += quantity;
            } else if (itemName.equals("Cash")) {
                money += quantity;
            }
        }

        printItemsInBag(bag);
    }

    private static boolean sumQuantity(LinkedHashMap<String, LinkedHashMap<String, Long>> bag, long quantity, String itemName, String gold2) {
        if (!bag.containsKey(itemName)) {
            if (bag.containsKey(gold2)) {
                if (quantity > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                    return true;
                }
            } else {
                return true;
            }
        } else if (bag.get(itemName).values().stream().mapToLong(e -> e).sum() + quantity > bag.get(gold2).values().stream().mapToLong(e -> e).sum()) {
            return true;
        }
        return false;
    }

    private static void printItemsInBag(LinkedHashMap<String, LinkedHashMap<String, Long>> bag) {
        for (Map.Entry<String ,LinkedHashMap<String, Long>>itemOfBag : bag.entrySet()) {
            Long sumValues = itemOfBag.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", itemOfBag.getKey(), sumValues));

            itemOfBag.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}