import java.util.Scanner;
public class HCF {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number a : ");
        int a= sc.nextInt();
        System.out.print("enter number b : ");
        int b= sc.nextInt();
        int hcf= 1;
        for(int i=1; i<=Math.min(a, b);  i++){
            if(a%i == 0 && b%i== 0){
                 hcf= i;
            }
        }
        System.out.println(hcf);

    }
}