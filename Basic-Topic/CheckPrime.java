import java.util.Scanner;
public class CheckPrime {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("enter your number : ");
    int num= sc.nextInt();
    boolean isPrime= true;
    for(int i=2; i<=num-1; i++ ){
        if(num % i == 0){
            isPrime =false;
            break;
        }
    }
    if(isPrime){
        System.out.print("this is prime number :");
    }else{
        System.out.print("this is not a prime number :");
    }
  }
}