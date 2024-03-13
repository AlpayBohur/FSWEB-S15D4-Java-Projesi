package s15d4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner decimal = new Scanner(System.in);
        System.out.print("Enter decimal number: ");

        int number = decimal.nextInt();
        System.out.println(decimalToBinary(number));
    }

    public static LinkedList<Integer> decimalToBinary(int number) {
        Stack<Integer> reminderStack = new Stack<>();
        LinkedList<Integer> result = new LinkedList<>();

        while (number > 0) {
            int reminder = number % 2;
            reminderStack.push(reminder);
            number = number / 2;
        }
        Iterator<Integer> iterator = reminderStack.iterator();
        while (iterator.hasNext()) {
            Integer binaryNumber = iterator.next();
            result.push(binaryNumber);
        }
        return result;
    }
}
