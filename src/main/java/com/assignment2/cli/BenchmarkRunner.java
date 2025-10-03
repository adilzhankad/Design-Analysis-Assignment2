package com.assignment2.cli;

import com.assignment2.algorithms.InsertionSort;
import com.assignment2.metrics.PerformanceTracker;

import java.util.Arrays;
import java.util.Random;

public class BenchmarkRunner {
    public static void main(String[] args) {
        int n = 10; // потом можно менять
        int[] arr = new Random().ints(n, 0, 100).toArray();

        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort sorter = new InsertionSort(tracker);

        System.out.println("Before: " + Arrays.toString(arr));
        sorter.sort(arr);
        System.out.println("After: " + Arrays.toString(arr));
        System.out.println(tracker.report());
    }
}
