import java.util.Scanner;

public class ASCIIvalues {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the letter : ");
        char str = sc.next().charAt(0);
          int value = (int)str;
        System.out.print("ASCII value of "+str+" is : "+value);

        
    }
}
