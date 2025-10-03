package com.assignment2.algorithms;

import com.assignment2.metrics.PerformanceTracker;

public class InsertionSort {
    private PerformanceTracker tracker;

    public InsertionSort(PerformanceTracker tracker) {
        this.tracker = tracker;
    }

    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            tracker.incrementArrayAccesses();

            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                tracker.incrementComparisons();
                arr[j + 1] = arr[j];
                tracker.incrementArrayAccesses();
                tracker.incrementSwaps();
                j--;
            }
            arr[j + 1] = key;
            tracker.incrementArrayAccesses();
        }
    }
}
