package collections;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateChecker {

    /*
    Problem Statement:
You are given an integer array nums and an integer k. Your task is to write a Java program that checks
if there are two distinct indices i and j in the array such that nums[i] == nums[j] and the absolute difference
between the indices |i - j| is less than or equal to k.
     */

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {

            System.out.println("Enter the value of element " + (i + 1));
            nums[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Enter the value of k");
        int k = scanner.nextInt();
        scanner.nextLine();

        containsNearbyDuplicate(nums,k);
        System.out.println("Does the array contain duplicate elements? " + containsNearbyDuplicate(nums,k));
        scanner.close();

    }
}

