package chapter04.understanding_arrays;

public class ArrayUsingLoop {

    public static void main(String[] args) {

        var numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 5;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }

        // numbers[10] = 3; //ArrayIndexOutOfBoundsException


    }
}
