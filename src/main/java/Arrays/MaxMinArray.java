package Arrays;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[]args){

        //Ввод количества элементов в массив
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ,please, quantity of numbers in Array");
        int arr = scanner.nextInt();
        int[]array=new int[arr];

        //ввод чисел в массив
        int max = arrray[0];
        int min = arrray[0];
        System.out.println("Enter,please,numbers in array: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        //вывод макс и мин значения из массива
                if(array[i] > max)
                    max = array[i];

                if(array[i] < min)
                    min = array[i];
        }
            System.out.println("Maximum number : " + max);
            System.out.println("Minimum number : " + min);
    }
}
