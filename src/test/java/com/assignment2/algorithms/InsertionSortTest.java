package com.assignment2.algorithms;

import com.assignment2.metrics.PerformanceTracker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {

    @Test
    public void testSortBasic() {
        int[] arr = {5, 6, 2, 3, 1};
        int[] expected = {1, 2, 3, 5, 6};

        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort sorter = new InsertionSort(tracker);
        sorter.sort(arr);

        assertArrayEquals(expected, arr);
    }
}
