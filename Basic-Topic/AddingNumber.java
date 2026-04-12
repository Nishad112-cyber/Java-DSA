import java.util.Scanner;

public class AddingNumber {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = sc.nextInt();
       int add=0;
       while (num>0) {
         int lastdigit= num%10;
         add= add+lastdigit;
         num= num/10;
       }
       System.out.print(add);
    }
}

 

