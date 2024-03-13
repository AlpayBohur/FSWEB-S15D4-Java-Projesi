package s15d4;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));

    }

    public static boolean checkForPalindrome(String text) {
        System.out.println("Initial text = " + text);
        text = text.replaceAll("[.,'?\\-\\s]","").toLowerCase(Locale.ENGLISH);
        Stack<Character> stackOriginal = new Stack<>();
        Stack<Character> stackTemp = new Stack<>();
        Stack<Character> stackReversed = new Stack<>();
        char[] chars = text.toCharArray();

        for (char c : chars) {
            stackOriginal.push(c);
            stackTemp.push(c);
        }

        for (char c : chars) {
            Character charTemp = stackTemp.pop();
            stackReversed.push(charTemp);
        }

        System.out.println(stackOriginal);
        System.out.println(stackReversed);

        if (stackOriginal.equals(stackReversed)) {
            return true;
        } else {
            return false;
        }
    }
}