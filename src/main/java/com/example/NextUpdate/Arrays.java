package com.example.NextUpdate;



public class Arrays {
    public static void main(String[] args) {
        // 1. initialize
        int[] a0 = new int[5];
        int[] a1 = {1, 2, 3};

        // 2. Get length
        System.out.println(a1.length);

        // 3. Access elements
        System.out.println(a1[1]);

        // 4. Iterate all Elements
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }

        for (int item : a1) {
            System.out.println(item);
        }

        // 5. Modify Element
        a1[0] = 9;

        // 6. Array Sort
        java.util.Arrays.sort(a1);
    }
}
