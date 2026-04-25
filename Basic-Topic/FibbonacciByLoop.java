public class FibbonacciByLoop {
     public static void main(String[] args) {
        int num=8;
        int first=0, second=1; 
        System.out.print(first+" "+second+" ");
          while (num>2) {
            int last= second+first;
            System.out.print(last+" ");
            first= second;
            second=last;
            num--; 
          }
     }
}
