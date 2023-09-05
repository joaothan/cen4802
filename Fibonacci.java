package p1;

public class Fibonacci {
    /**
     * Calculates the nth Fibonacci number.
     * 
     * @param n The position of the Fibonacci number to calculate (must be non-negative).
     * @return The nth Fibonacci number.
     */
    public static int calculateFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; 
        int result = calculateFibonacci(n);

        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
