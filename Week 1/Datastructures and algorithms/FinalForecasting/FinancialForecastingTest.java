public class FinancialForecastingTest {
    public static void main(String[] args) {
        // Test parameters
        double presentValue = 10000.0;  // Initial investment
        double growthRate = 0.05;       // 5% growth rate
        int years = 10;                 // 10 years forecast

        System.out.println("Financial Forecasting Test");
        System.out.println("=========================");
        System.out.println("Initial Investment: $" + presentValue);
        System.out.println("Annual Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Forecast Period: " + years + " years");
        System.out.println();

        // Test regular recursive calculation
        long startTime = System.nanoTime();
        double futureValue = FinancialForecasting.calculateFutureValue(presentValue, growthRate, years);
        long endTime = System.nanoTime();
        long regularTime = endTime - startTime;

        System.out.println("Regular Recursive Calculation:");
        System.out.println("Future Value: $" + String.format("%.2f", futureValue));
        System.out.println("Calculation Time: " + regularTime + " nanoseconds");
        System.out.println();

        // Test optimized recursive calculation
        startTime = System.nanoTime();
        double futureValueOptimized = FinancialForecasting.calculateFutureValueOptimized(presentValue, growthRate, years);
        endTime = System.nanoTime();
        long optimizedTime = endTime - startTime;

        System.out.println("Optimized Recursive Calculation (with Memoization):");
        System.out.println("Future Value: $" + String.format("%.2f", futureValueOptimized));
        System.out.println("Calculation Time: " + optimizedTime + " nanoseconds");
        System.out.println();

        // Test compound interest calculation
        double principal = 10000.0;     // Initial principal
        double rate = 0.05;             // 5% interest rate
        years = 10;                     // 10 years

        System.out.println("Compound Interest Calculation:");
        System.out.println("Principal: $" + principal);
        System.out.println("Interest Rate: " + (rate * 100) + "%");
        System.out.println("Period: " + years + " years");
        
        double finalAmount = FinancialForecasting.calculateCompoundInterest(principal, rate, years);
        System.out.println("Final Amount: $" + String.format("%.2f", finalAmount));
        System.out.println();

        // Print complexity analysis
        System.out.println("Complexity Analysis:");
        System.out.println("1. Regular Recursive Solution:");
        System.out.println("   - Time Complexity: O(2^n)");
        System.out.println("   - Space Complexity: O(n)");
        System.out.println("   - Drawback: Recalculates same values multiple times");
        System.out.println();
        System.out.println("2. Optimized Recursive Solution (with Memoization):");
        System.out.println("   - Time Complexity: O(n)");
        System.out.println("   - Space Complexity: O(n)");
        System.out.println("   - Advantage: Stores calculated values to avoid recalculation");
    }
} 