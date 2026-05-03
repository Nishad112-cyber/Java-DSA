public class CountDigit {
    public static int CountDigit(int n){
        if(n<10){
            return 1;
        }
        return 1+ CountDigit(n/10);

    }
    public static void main(String[] args) {
        int n= 123456;
        System.out.print(CountDigit(n));
    }
}
