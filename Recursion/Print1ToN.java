public class Print1ToN {

    public static void  PrintInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        int n=5;
        PrintInc(n);
    }
}