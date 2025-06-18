public class SearchComparison {
    public static void main(String[] args) {
        // Create sample products
        Product[] products = {
            new Product(1, "Laptop", "Electronics", 999.99),
            new Product(2, "Smartphone", "Electronics", 699.99),
            new Product(3, "Headphones", "Electronics", 199.99),
            new Product(4, "T-shirt", "Clothing", 29.99),
            new Product(5, "Jeans", "Clothing", 59.99),
            new Product(6, "Shoes", "Footwear", 89.99),
            new Product(7, "Watch", "Accessories", 149.99),
            new Product(8, "Backpack", "Accessories", 49.99)
        };

        // Test search for existing product
        final int searchId1 = 5;
        System.out.println("Searching for product with ID: " + searchId1);
        
        // Linear Search
        long linearTime = SearchAlgorithms.measureExecutionTime(() -> {
            Product result = SearchAlgorithms.linearSearch(products, searchId1);
            System.out.println("Linear Search Result: " + result);
        });
        
        // Binary Search
        long binaryTime = SearchAlgorithms.measureExecutionTime(() -> {
            Product result = SearchAlgorithms.binarySearch(products, searchId1);
            System.out.println("Binary Search Result: " + result);
        });

        // Print performance comparison
        System.out.println("\nPerformance Comparison:");
        System.out.println("Linear Search Time: " + linearTime + " nanoseconds");
        System.out.println("Binary Search Time: " + binaryTime + " nanoseconds");

        // Test search for non-existing product
        final int searchId2 = 10;
        System.out.println("\nSearching for non-existing product with ID: " + searchId2);
        
        // Linear Search
        linearTime = SearchAlgorithms.measureExecutionTime(() -> {
            Product result = SearchAlgorithms.linearSearch(products, searchId2);
            System.out.println("Linear Search Result: " + result);
        });
        
        // Binary Search
        binaryTime = SearchAlgorithms.measureExecutionTime(() -> {
            Product result = SearchAlgorithms.binarySearch(products, searchId2);
            System.out.println("Binary Search Result: " + result);
        });

        // Print performance comparison for non-existing product
        System.out.println("\nPerformance Comparison (Non-existing product):");
        System.out.println("Linear Search Time: " + linearTime + " nanoseconds");
        System.out.println("Binary Search Time: " + binaryTime + " nanoseconds");

        // Print complexity analysis
        System.out.println("\nComplexity Analysis:");
        System.out.println("Linear Search: O(n) - Time complexity grows linearly with input size");
        System.out.println("Binary Search: O(log n) - Time complexity grows logarithmically with input size");
        System.out.println("\nRecommendation:");
        System.out.println("For small datasets or unsorted data: Use Linear Search");
        System.out.println("For large sorted datasets: Use Binary Search");
    }
} 