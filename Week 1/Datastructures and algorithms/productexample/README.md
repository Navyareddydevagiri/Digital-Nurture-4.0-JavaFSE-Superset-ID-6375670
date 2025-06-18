# E-commerce Platform Search Function

This project demonstrates and compares different search algorithms (Linear Search and Binary Search) for an e-commerce platform.

## Project Structure
- `Product.java`: Class representing a product with attributes
- `SearchAlgorithms.java`: Implementation of Linear and Binary search algorithms
- `SearchComparison.java`: Test class demonstrating and comparing the algorithms

## How to Run

1. Compile all Java files:
```bash
javac *.java
```

2. Run the comparison program:
```bash
java SearchComparison
```

## Algorithm Analysis

### Big O Notation
- Big O notation describes the performance or complexity of an algorithm
- It helps us understand how the algorithm's execution time grows with input size
- Common notations:
  - O(1): Constant time
  - O(log n): Logarithmic time
  - O(n): Linear time
  - O(n log n): Linearithmic time
  - O(n²): Quadratic time

### Search Algorithms Comparison

#### Linear Search
- Time Complexity: O(n)
- Best Case: O(1) - Element found at first position
- Average Case: O(n/2) - Element found in middle
- Worst Case: O(n) - Element not found or at last position
- Advantages:
  - Works with unsorted data
  - Simple to implement
- Disadvantages:
  - Slower for large datasets
  - Must check every element in worst case

#### Binary Search
- Time Complexity: O(log n)
- Best Case: O(1) - Element found at middle
- Average Case: O(log n)
- Worst Case: O(log n) - Element not found
- Advantages:
  - Much faster for large datasets
  - Efficient for sorted data
- Disadvantages:
  - Requires sorted data
  - More complex implementation

## Recommendations for E-commerce Platform

1. For Small Datasets (< 1000 items):
   - Use Linear Search
   - Simpler to implement and maintain
   - No need for sorting

2. For Large Datasets (> 1000 items):
   - Use Binary Search
   - Keep data sorted by product ID
   - Significantly better performance

3. Hybrid Approach:
   - Use Binary Search for product ID searches
   - Use Linear Search for text-based searches (product name, category)
   - Consider implementing a search index for better performance 