package Exceptions.Homework_1;

public class task_01 {
// Реализуйте 3 метода, чтобы в каждом из них получить 
// разные исключения    

public static void main(String[] args) {
   
    division(20, 0);

    int[] arr = new int[5];
    indexOut(arr, 10);

    String str = null;
    sizeOut(str);
}

public static void division(int num1, int num2) {
    double result = num1/num2;
    System.out.printf("%d разделить на %d равно %f", num1, num2, result);
}

public static void indexOut(int[] arr, int index) {
    System.out.printf("Элемент с индексом %d равен %d", index, arr[index]);
    
}

public static void sizeOut(String str) {
    int result = str.length();
    System.out.printf("Длина строки равна %d", result);
}

}
