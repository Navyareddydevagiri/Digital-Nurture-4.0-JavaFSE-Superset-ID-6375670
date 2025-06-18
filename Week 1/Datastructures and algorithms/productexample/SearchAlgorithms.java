import java.util.Arrays;

public class SearchAlgorithms {
    // Linear Search - O(n) time complexity
    public static Product linearSearch(Product[] products, int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search - O(log n) time complexity
    public static Product binarySearch(Product[] products, int productId) {
        // Ensure array is sorted
        Arrays.sort(products);
        
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].getProductId() == productId) {
                return products[mid];
            }

            if (products[mid].getProductId() < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Helper method to measure execution time
    public static long measureExecutionTime(Runnable searchOperation) {
        long startTime = System.nanoTime();
        searchOperation.run();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
} 