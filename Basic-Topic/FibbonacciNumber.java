public class FibbonacciNumber {
    public static int Fiboo(int n){
        if(n<=1){
            return n;
        
        }
        return Fiboo(n-1) +Fiboo(n-2);
    

    }
    public static void main(String[] args) {
        int n= 10;
        for(int i=0; i<n; i++){
            System.out.print(Fiboo(i)+" ");
        }
    }
}
