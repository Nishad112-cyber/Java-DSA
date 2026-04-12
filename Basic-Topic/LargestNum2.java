 import java.util.Scanner;
public class LargestNum2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your first number : ");
        int a= sc.nextInt();
        System.out.print("enter your second number : ");
        int b= sc.nextInt();
        System.out.print("enter your third number : ");
        int c= sc.nextInt();
        
        if(a>b && a>c){
            System.out.print("greatest number is first : ");
        }else if(b>c){
            System.out.print("greatest number is second : ");
        }else{
            System.out.print("greatest number is third : ");
        }
 
    }
}
