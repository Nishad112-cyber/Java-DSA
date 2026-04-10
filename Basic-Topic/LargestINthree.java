import java.util.Scanner;
public class LargestINthree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your number a : ");
        int a= sc.nextInt();
         System.out.print("enter your number b : ");
        int b= sc.nextInt();
         System.out.print("enter your number c : ");
        int c= sc.nextInt();
         if(a>b){
            if(a>c){
                System.out.println("greatest number is a : "+a);
            }else{
                 System.out.println("greatest number is c : "+c);
            }
         }else if(b>c){
             System.out.println("greatest number is b : "+b);
         }else{
            System.out.println("greatest number is c : "+c);
         }
        
    }
}
