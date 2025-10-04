# Design-Analysis-Assignment2
 Overview

This project implements and analyzes the Insertion Sort algorithm in Java.
It includes:

Performance tracking (comparisons, swaps, and array accesses)

Command-line benchmarking for different input sizes

JUnit test suite with edge-case validation

CSV export for empirical analysis

Follows Git branching strategy (feature/*, main)

    Algorithm Description

Insertion Sort is a simple algorithm that sorts elements by comparing each new element with the ones before it and placing it in the correct position.
It works like sorting playing cards in your hand — you take one card at a time and put it where it belongs.

This algorithm is easy to understand and works well when the list is already almost sorted or small in size.
However, it becomes slow when the list is large or completely unsorted because it has to compare and move many elements.

In short, Insertion Sort is good for small or nearly ordered data but not efficient for large random datasets.

    Project Structure

project is organized into different parts to keep the code clean and easy to manage

**algorithms** part contains the main sorting logic.
**metrics** part keeps track of how many comparisons and swaps happen during sorting.
**cli** part allows you to run the program from the command line and see how the algorithm performs.
**tests** part includes automated checks to make sure the algorithm works correctly in all situations.


This structure makes it easy to build, test, and analyze the algorithm step by step.

    Installation & Build

**Clone the repository:**

git clone https://github.com/adilzhankadyrov/Design-Analysis-Assignment2.git
cd Design-Analysis-Assignment2


Build the Maven project:

_**mvn clean compile**_


_**Run all tests:**_

_**mvn test**_