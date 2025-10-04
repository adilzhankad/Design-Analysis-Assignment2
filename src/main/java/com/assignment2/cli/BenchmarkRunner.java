package com.assignment2.cli;

import com.assignment2.algorithms.InsertionSort;
import com.assignment2.metrics.PerformanceTracker;

import java.util.Arrays;
import java.util.Random;

public class BenchmarkRunner {
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 20; // размер массива
        int[] arr = new Random().ints(n, 0, 100).toArray();

        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort sorter = new InsertionSort(tracker);

        System.out.println("Before: " + Arrays.toString(arr));

        long start = System.nanoTime();
        sorter.sort(arr);
        long end = System.nanoTime();

        System.out.println("After:  " + Arrays.toString(arr));
        System.out.println("Time (ns): " + (end - start));
        System.out.println(tracker.report());

        tracker.exportToCSV("benchmark_metrics.csv");
        System.out.println("Metrics saved to benchmark_metrics.csv");
    }
}
