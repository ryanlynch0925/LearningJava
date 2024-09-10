
public class ProductofOddIntegers {
    public static void main(String[] args) {
        //Initialize total variable as double for large numbers.
        double total = 1;

        //Create a loop that iterates from range 1 to 15 only odd numbers.
        for (double number = 1; number <= 15; number +=2) {
            //Calculate the product
            total *= number;            
        }
        
        //Print out statement with total number
        System.out.printf("Product is %, .0f%n", total); //Format total to include commas
    }
}
