public  class SwappingNumber {

    public static void main(String[] args) {
        int a= 10;
        int b= 23;

        int num= a;
           a= b;
           b= num;

        System.out.println("now a became b : "+a);
        System.out.println("now b became a : "+b);
    }
}