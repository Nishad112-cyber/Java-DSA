import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = sc.nextInt();
        int factorial= 1;
        while (num >=1) {
            factorial = factorial*num;
            num= num-1;
        }
        System.out.print(factorial);
    }
}
