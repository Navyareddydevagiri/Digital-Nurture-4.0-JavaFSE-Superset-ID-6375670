public class FinancialForecasting {
    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base case: if years is 0, return present value
        if (years == 0) {
            return presentValue;
        }
        
        // Recursive case: calculate value for previous year and apply growth rate
        return calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized recursive method using memoization
    private static double[] memo;
    
    public static double calculateFutureValueOptimized(double presentValue, double growthRate, int years) {
        // Initialize memoization array
        memo = new double[years + 1];
        // Set base case
        memo[0] = presentValue;
        return calculateFutureValueMemo(presentValue, growthRate, years);
    }
    
    private static double calculateFutureValueMemo(double presentValue, double growthRate, int years) {
        // If value is already calculated, return it
        if (memo[years] != 0) {
            return memo[years];
        }
        
        // Calculate and store the value
        memo[years] = calculateFutureValueMemo(presentValue, growthRate, years - 1) * (1 + growthRate);
        return memo[years];
    }

    // Method to calculate compound interest
    public static double calculateCompoundInterest(double principal, double rate, int years) {
        // Base case: if years is 0, return principal
        if (years == 0) {
            return principal;
        }
        
        // Recursive case: calculate interest for previous year and add to principal
        double previousAmount = calculateCompoundInterest(principal, rate, years - 1);
        return previousAmount * (1 + rate);
    }
} 