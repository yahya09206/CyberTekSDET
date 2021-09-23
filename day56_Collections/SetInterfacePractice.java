package day56_Collections;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper Towels"};

        Set<String> items1 = new HashSet<>(Arrays.asList(arr));
        items1.add(null);

        Set<String> items2 = new LinkedHashSet<>(Arrays.asList(arr));
        items2.add(null);

        Set<String> items3 = new TreeSet<>(Arrays.asList(arr));
        //items3.add(null); // tree set does not accept null

        System.out.println("Items1 = " + items1);
        System.out.println("Items2 = " + items2);
        System.out.println("Items3 = " + items3);
    }
}
