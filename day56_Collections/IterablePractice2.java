package day56_Collections;

import java.util.*;

public class IterablePractice2 {
    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed","ahmed", "aHmEd",
                "John", "Erjon", "Daniel", "Mustafa", "Mohammed",
                "Ahmed", "ahmed","Yuliia", "Chris"));

        // remove all names "ahmed" without using removeIf
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            //String each = it.next();
            if (it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }
        System.out.println("names = " + names);

        System.out.println("-------------------------------------------");
        List<String> names2=new ArrayList<>();
        names2.addAll(Arrays.asList("Ahmed","ahmed", "aHmEd",
                "John", "Erjon", "Daniel", "Mustafa", "Mohammed",
                "Ahmed", "ahmed","Yuliia", "Chris"));

        names2.removeIf(p -> p.equalsIgnoreCase("ahmed"));
        System.out.println("names2 = " + names2);

        System.out.println("-------------------------------------------");
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(10,9,11,1,2,3,4,5,6,7,12,12,14,15,16,18,17,25,20));

        // remove all elements that are less than 17:
        // don't have to use i++ because it will increment itself
        for (Iterator<Integer> i = set.iterator(); i.hasNext();){
            if (i.next() < 17){
                i.remove();
            }
        }
        System.out.println("set = " + set);
    }
}
