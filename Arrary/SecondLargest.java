public class SecondLargest {
    public static void secondlagest(int num[]){
     int largest= Integer.MIN_VALUE;
     int secondlarge= Integer.MIN_VALUE;
    for(int i=0; i<num.length; i++){
        if(num[i] >largest){
            secondlarge= largest;
            largest= num[i];
        }else if(num[i] >secondlarge && num[i] != largest){
            secondlarge= num[i];
        }
    }
    System.out.print(secondlarge);
    }
    public static void main(String[] args) {
        int num[] ={1,2,3,4,5,6,7,8};
        secondlagest(num);
    }
    

}
