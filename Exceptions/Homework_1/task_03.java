package Exceptions.Homework_1;

public class task_03 {

    public static void main(String[] args) {

        int[] arr1 = new int[] { 1, 3, 5, 8, 2 };
        int[] arr2 = new int[] { 2, 8, 3, 4, 5 };
        int[] arr3 = new int[] { 2, 1, 3, 4, 5, 9 };
        int[] arr4 = new int[] { 2, 1, 0, 4, 5 };

        try {
            division(arr1, arr2); 
            division(arr1, arr3); // исключение(разная длина)
            division(arr1, arr4); // исключение(деление на ноль)

        } catch (RuntimeException e) {
            System.out.println("Исключение:" + e);
        }

    }

    public static void division(int[] mas1, int[] mas2) {
        if (mas1.length != mas2.length) {
            throw new RuntimeException("У массивов разная длина!");
        }
        double[] result = new double[mas1.length];
        for (int i = 0; i < mas1.length; i++) {
            if (mas2[i] == 0) {
                throw new RuntimeException("Элемент " + i + " массива равен 0!");
            }
            result[i] = (double) mas1[i] / (double) mas2[i];
        }
        for (double item : result) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
