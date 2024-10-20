package Arrays;

class Array {

    public static int[] generateFibonacci(int n) {
        int[] evenFib = new int[n];
        int a = 0, b = 1, count = 0;

        while (count < n) {
            int next = a + b;
            a = b;
            b = next;

            if (next % 2 == 0) {
                evenFib[count] = next;
                count++;
            }
        }
        return evenFib;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array of " + i + "is:" + array[i]);
        }

    }
}

public class ArrayFibonaci {

    public static void main(String args[]) {

        int[] evenFibArray = Array.generateFibonacci(20);

        int sum = Array.sumArray(evenFibArray);
        System.out.println("sum of elements:" + sum);

        Array.printArray(evenFibArray);

    }
}
