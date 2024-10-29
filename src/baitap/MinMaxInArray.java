
package baitap;


public class MinMaxInArray {

    public static void findMinMax(int[] arr) {
        
        int min = arr[0];
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 9, 2};
        findMinMax(numbers);

    }
        
}
