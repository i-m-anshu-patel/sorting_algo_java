public class ReverseAString {
    public static void printReverse(String str, int index) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printReverse(str, index - 1);
    }

    public static void main(String args[]) {
        String str = "abcd";
        printReverse(str, str.length() - 1);
    }
}
