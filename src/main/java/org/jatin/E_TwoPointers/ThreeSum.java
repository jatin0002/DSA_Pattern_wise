package org.jatin.E_TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(arr);
        System.out.println(result);
    }

//    Intiution
//    1. first sort it, so it will easier to skip duplicate
//    2. then fix one value at time and use 2 pointers

    private static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            if (i != 0 && arr[i] == arr[i - 1]) // checking duplicate first time
                continue;

            int j = i + 1;
            int k = n - 1;
            while (j < n) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    result.add(List.of(arr[i], arr[j], arr[k]));
                    j++;

                    while (j < k && arr[j] == arr[j - 1]) {
                        // checking duplicate when increasing index in 2 pointer
                        j++;
                    }
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return result;
    }

}
