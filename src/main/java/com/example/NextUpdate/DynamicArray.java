package com.example.NextUpdate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {
        // 1. Initialize
        List<Integer> v0 = new ArrayList<>();
        List<Integer> v1;  // v1 == null

        // 2. cast an array to a vector
        Integer[] a = {0, 1, 2, 3, 4};
        v1 = new ArrayList<>(Arrays.asList(a));

        // 3. make a copy
        List<Integer> v2 = v1;  // another reference to v1
        List<Integer> v3 = new ArrayList<>(v1);  // make an actual copy of v1

        // 4. get length
        System.out.println(v1 .size());

        // 5. access element
        System.out.println(v1.get(2));

        // 6. Iterate the vector
        for (int i = 0; i < v1.size(); i++) {
            System.out.println(v1.get(i));
        }

        // 7. Modify element
        v2.set(0, 5);  // modify v2 will actually modify v1
        System.out.println(v1.get(0)+" The first element in v1 this");
        v3.set(0, -1);
        System.out.println(v1.get(0)+" The first element in v1 this");

        // 8. Sort
        Collections.sort(v1);

        // 9. Add new element at the end of the vector
        v1.add(-1);
        v1.add(1, 6);

        // 10. Delete the last element
        v1.remove(v1.size()-1);




    }
}
