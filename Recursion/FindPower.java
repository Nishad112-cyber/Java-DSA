public class FindPower {
    public static int power(int a, int n){
        if( n==0){
         return 1;
        }
        int halfPower= power(a, n/2)*power(a, n/2);
        if(n%2 !=0){
            halfPower= a*halfPower;
        }
        return halfPower;
    }
    public static void main(String[] args) {
        System.out.print(power(2, 30));
    }
}
