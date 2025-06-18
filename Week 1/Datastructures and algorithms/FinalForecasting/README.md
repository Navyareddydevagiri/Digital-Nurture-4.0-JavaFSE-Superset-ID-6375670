# Financial Forecasting Tool

This project demonstrates the implementation of a financial forecasting tool using recursive algorithms.

## Project Structure
- `FinancialForecasting.java`: Contains the main forecasting algorithms
- `FinancialForecastingTest.java`: Test class demonstrating the implementation

## How to Run

1. Compile all Java files:
```bash
javac *.java
```

2. Run the test program:
```bash
java FinancialForecastingTest
```

## Implementation Details

### Recursive Algorithms
1. Regular Recursive Solution:
   - Uses simple recursion to calculate future values
   - Time Complexity: O(2^n)
   - Space Complexity: O(n)
   - Drawback: Recalculates same values multiple times

2. Optimized Recursive Solution (with Memoization):
   - Uses memoization to store calculated values
   - Time Complexity: O(n)
   - Space Complexity: O(n)
   - Advantage: Avoids recalculation of previously computed values

### Features
1. Future Value Calculation:
   - Calculates future value based on present value and growth rate
   - Supports both regular and optimized recursive approaches

2. Compound Interest Calculation:
   - Calculates compound interest over a specified period
   - Uses recursive approach for calculation

## Complexity Analysis

### Time Complexity
- Regular Recursive Solution: O(2^n)
  - Each recursive call branches into two more calls
  - Leads to exponential growth in computation time

- Optimized Recursive Solution: O(n)
  - Each value is calculated only once
  - Stored in memoization array for future use

### Space Complexity
- Both Solutions: O(n)
  - Regular: Due to recursion stack
  - Optimized: Due to memoization array

## Optimization Techniques
1. Memoization:
   - Stores previously calculated values
   - Avoids redundant calculations
   - Significantly improves performance

2. Base Case Handling:
   - Proper termination conditions
   - Prevents infinite recursion

## Usage Example
```java
// Calculate future value
double futureValue = FinancialForecasting.calculateFutureValue(10000.0, 0.05, 10);

// Calculate compound interest
double finalAmount = FinancialForecasting.calculateCompoundInterest(10000.0, 0.05, 10);
``` 