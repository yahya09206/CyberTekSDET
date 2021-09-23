package day56_Collections;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {

        Queue<Integer> q1 = new PriorityQueue<>();
        q1.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        Queue<Integer> q2 = new ArrayDeque<>();
        q2.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        Queue<Integer> q3 = new LinkedList<>();
        q3.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));


    }
}
