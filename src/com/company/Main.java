package com.company;

import java.util.*;

public class Main {
static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        int[] arrays = new int[10];


        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(2));
            linkedList.add(random.nextInt(2));
            arrays[i] = random.nextInt(2);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Array List: " + arrayList.get(i) + ", ");

            System.out.println("Linked List: " + linkedList.get(i) + ", ");

            System.out.println("Arrays: " + arrays[i] + ", ");
        }
        System.out.println("----------After sorting---------------------------");
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        Arrays.sort(arrays);

        for (int sort: arrayList) {
            System.out.println("ArrayList: " + sort + ", ");
        }
        for (int sort: linkedList) {
            System.out.println("LinkedList: " + sort + ", ");
        }

        for (int sort: arrays) {
            System.out.println("Arrays: " + sort + ", ");
        }
        add1(0);
        add2(1);
        add3(0);
        add4(1);

        }


    public static int add1(int a) {
        return a;
    }
    public static double add2(int a) {
        return a;
    }
    public static void add3(int a) {
        System.out.println(a);
    }
    public static void add4(int a) {
        System.out.println(a);
    }

}
