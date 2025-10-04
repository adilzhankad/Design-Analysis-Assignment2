package com.assignment2.metrics;
import java.io.FileWriter;
import java.io.IOException;

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



    public void exportToCSV(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("comparisons,swaps,arrayAccesses\n");
            writer.write(comparisons + "," + swaps + "," + arrayAccesses + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
