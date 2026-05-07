public class SubSequenc {

    public static void printSubseq(String str, int index, String current) {
        
        // base case
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        char ch = str.charAt(index);

        // include character
        printSubseq(str, index + 1, current + ch);

        // exclude character
        printSubseq(str, index + 1, current);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubseq(str, 0, "");
    }
}