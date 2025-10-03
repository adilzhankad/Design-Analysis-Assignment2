package com.assignment2.metrics;

public class PerformanceTracker {
    private long comparisons = 0;
    private long swaps = 0;
    private long arrayAccesses = 0;

    public void incrementComparisons() { comparisons++; }
    public void incrementSwaps() { swaps++; }
    public void incrementArrayAccesses() { arrayAccesses++; }

    public void reset() {
        comparisons = swaps = arrayAccesses = 0;
    }

    public String report() {
        return "Comparisons=" + comparisons +
                ", Swaps=" + swaps +
                ", ArrayAccesses=" + arrayAccesses;
    }
}
