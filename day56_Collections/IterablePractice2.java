package day56_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
        System.out.println(names);

    }
}
