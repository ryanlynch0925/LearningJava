//<variablelenArgumentList.java> -- Calculates the product of variable length list of numbers
//CSIS 212-<WEEK 5>
public class variablelenArgumentList {
    public static void main(String[] args) {
        // Class related print statement
        System.out.println("David Ryan Lynch - Variable-Length Argument List");

        // Calling method with no arguments
        System.out.println("Product of : " + product());

        // Calling method with Zero as argument
        System.out.println("Product of 0: " + product(0)); // Should return 0

        // Calling method with 1 to 8 arguments
        System.out.println("Product of 2: " + product(2));
        System.out.println("Product of 2, 3: " + product(2, 3));
        System.out.println("Product of 2, 3, 4: " + product(2, 3, 4));
        System.out.println("Product of 2, 3, 4, 5: " + product(2, 3, 4, 5));
        System.out.println("Product of 2, 3, 4, 5, 6: " + product(2, 3, 4, 5, 6));
        System.out.println("Product of 2, 3, 4, 5, 6, 8: " + product(2, 3, 4, 5, 6, 8));
        System.out.println("Product of 2, 3, 4, 5, 6, 8, 9: " + product(2, 3, 4, 5, 6, 8, 9));
        System.out.println("Product of 2, 3, 4, 5, 6, 8, 9, 10: " + product(2, 3, 4, 5, 6, 8, 9, 10));

        // Calling method with negative arguments
        System.out.println("Product of 2, -3, 4: " + product(2, -3, 4)); // Should be negative
        System.out.println("Product of 2, -3, -4, -5: " + product(2, -3, -4, -5)); // Should be negative
        System.out.println("Product of 2, -3, -4, -5, -6: " + product(2, -3, -4, -5, -6)); // Should be positive

    }

    public static int product(int... nums) {
        // Initialize the product variable
        int prod = 1;

        // Check to see if nothing is entered
        if (nums.length == 0) {
            return 0;
        }
        // Calculate the product
        for (int num : nums) {
            prod *= num;
        }
        // Return the product
        return prod;
    }
}
