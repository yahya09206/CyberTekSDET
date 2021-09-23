package day56_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) < 4){
                list1.remove(i);
            }
        }

        System.out.println("list1 = " + list1);

        System.out.println("-----------------------------------------------");

        // apply Iterable to arraylist
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()){
            if (it.next() < 4){
                it.remove();
            }
        }
    }
}
