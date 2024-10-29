package baitap;

public class FactorialCalculation {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5; // Change this to calculate factorial of any other number
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }

}
