public class ThreeWaysToPrint {
    public static void main(String[] args) {
        // a. Using 1 System.out.println statement
        System.out.println("1 2 3 4");

        // b. Using 4 System.out.print statements
        System.out.print(1 + " ");
        System.out.print(2 + " ");
        System.out.print(3 + " ");
        System.out.print(4 + "\n");

        // c. Using 1 System.out.printf statement
        System.out.printf("%d %d %d %d%n",1,2,3,4);
    }
}
