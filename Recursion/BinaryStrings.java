public class BinaryStrings {

    public static void generate(int n, String ans) {
        // base case
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        // place 0
        generate(n - 1, ans + "0");

        // place 1
        generate(n - 1, ans + "1");
    }

    public static void main(String[] args) {
        int n = 3;
        generate(n, "");
    }
}
