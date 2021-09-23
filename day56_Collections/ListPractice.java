package day56_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class ListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.size();

        Vector<Integer> vector = new Vector<>();
        System.out.println(vector.size());


        // last in first out
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        int a = stack.pop();
        
        int a2 = stack.pop();

        System.out.println("a = " + a);
        System.out.println("a2 = " + a2);

        for (int i = 0; i < stack.size(); i++){
            stack.pop();
            System.out.println(stack);
        }
    }

    public void method1(){

    }

    public synchronized void method2(){

    }


}
