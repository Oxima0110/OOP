package Exceptions.Homework_1;

// Реализуйте метод, принимающий в качестве аргументов 
// два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен разности элементов двух 
// входящих массивов в той же ячейке. Если длины массивов 
// не равны, необходимо как-то оповестить пользователя.

public class task_02 {
    public static void main(String[] args) {
       
        int[] arr1 = new int[] {1, 3, 5, 8, 2};
        int[] arr2 = new int[] {2, 8, 3, 4, 5};
        int[] arr3 = new int[] {2, 8, 3, 4, 5, 9};

        difference(arr1, arr2);
        difference(arr2, arr3); // исключение (разная длина)
    }

    public static void difference(int[] mas1, int[] mas2) {
        if (mas1.length != mas2.length){
            throw new RuntimeException("У массивов разная длина!");
        }
        int[] result = new int[mas1.length];
        for (int i = 0; i < mas1.length; i++) {
            result[i] = mas1[i] - mas2[i];
        }
        for (int item : result) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
