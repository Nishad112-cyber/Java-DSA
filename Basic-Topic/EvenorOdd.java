 import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your number : ");
        int number = sc.nextInt();
        if(number/2 == 0){
            System.out.print("this is even number :");
        }else{
            System.out.print("this is odd number :");
        }
    }
}
