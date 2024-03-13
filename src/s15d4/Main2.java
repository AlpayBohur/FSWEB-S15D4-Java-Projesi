package s15d4;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));
    }

    public static boolean checkForPalindrome(String text) {
        System.out.println("Initial text = " + text);
        text = text.replaceAll("[.,'?\\-\\s]", "").toLowerCase(Locale.ENGLISH);
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        char[] chars = text.toCharArray();
        for (char c : chars) {
            stack.push(c);
            queue.offer(c);
        }

        System.out.println("Stack: " + stack);
        System.out.println("Queue: " + queue);

        while (!queue.isEmpty()) {
            Character character = queue.remove();
            if (character != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
