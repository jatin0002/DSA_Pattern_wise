package org.jatin.E_TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};
        int target = -1;
        List<List<Integer>> result = fourSum(arr, target);
        System.out.println(result);
    }

    public static List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < n - 3; i++) {
            if (i != 0 && arr[i] == arr[i - 1])
                continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                int k = j + 1;
                int l = n - 1;

                while (k < l) {
                    long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum == target) {
                        result.add(List.of(arr[i], arr[j], arr[k], arr[l]));
                        k++;

                        while (k < l && arr[k] == arr[k - 1]) {
                            k++;
                        }
                    } else if (sum > target) {
                        l--;
                    } else {
                        k++;
                    }
                }

            }
        }

        return result;
    }
}
