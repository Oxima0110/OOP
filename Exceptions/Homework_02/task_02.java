package Exceptions.Homework_02;

public class task_02 {
    public static void main(String[] args) {
        int[] intArray = new int[] { 1, 3, 6, 7, 8, 9, 12, 2, 5 };
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

}
