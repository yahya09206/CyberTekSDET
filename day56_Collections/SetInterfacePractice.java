package day56_Collections;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone",
                        "Wooden Spoon", "Wooden Spoon", "Wooden Spoon",
                        "Milk", "Eggs", "Coke", "Paper Towels"};

        Set<String> items1 = new HashSet<>();
        items1.addAll(Arrays.asList(arr));
        items1.add(null);

        Set<String> items2 = new LinkedHashSet<>();
        items2.addAll(Arrays.asList(arr));
        items2.add(null);

        Set<String> items3 = new TreeSet<>();
        items3.addAll(Arrays.asList(arr));
        //items3.add(null); // tree set does not accept null

        System.out.println("Items1 = " + items1);
        System.out.println("Items2 = " + items2);
        System.out.println("Items3 = " + items3);

//        String str = null;
//        str.equals("Cybertek");
//        System.out.println(str);

        System.out.println("-------------------------------------------");
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,12,3,4,5,6,1,2,3,4,5));

        list = new ArrayList<>(new LinkedHashSet<Integer>(list));
        System.out.println(list);

        System.out.println("-------------------------------------------");

        String str = "abcabcabcabc";
        //str = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString().substring(1).replace(",",
          //      "").replace("]", "");
        str = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        System.out.println(str);

        System.out.println("-------------------------------------------");

        Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        // return the fifth element after removing duplicates
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(nums));
        System.out.println(linkedHashSet);
        // convert to arraylist to get specific index
        System.out.println(new ArrayList<>(linkedHashSet).get(4));

        System.out.println("-------------------------------------------");
        // return first unique element

        String s = "aaabbcdddeeeee";
        // var to store result
        String result = "";
        // iterate thru linkedhashset(removes duplicates)
        for (String ch : new LinkedHashSet<>(Arrays.asList(s.split("")))) {
            // call collections class frequency method and compare and store into result
            result += ch + Collections.frequency(Arrays.asList(s.split("")), ch);
        }
        System.out.println("result = " + result);
    }
}
