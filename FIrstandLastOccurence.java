public class FIrstandLastOccurence {
    /**
     * @param str
     * @param first
     * @param last
     * @param index
     * @param ch
     */
    public static void findOccurences(String str, int first, int last, int index, char ch) {
        if (str.length() - 1 == index) {
            if (str.charAt(index) == ch) {
                last = index;
            }
            System.out.print("First and last indices are " + first + " and " + last);
            return;
        }
        if (str.charAt(index) == ch) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findOccurences(str, first, last, ++index, ch);
    }

    public static void main(String args[]) {
        String str = "abaaaadfedewwsfgvafa";
        findOccurences(str, -1, -1, 0, 'a');

    }
}