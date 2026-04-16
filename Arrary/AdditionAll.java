public class AdditionAll {

    public static void addition(int arr[]){
        int sum= 0;
        
        for(int i=0; i<arr.length; i++){
             sum=  sum+arr[i];
           
             
        }
        System.out.print("this is total sum of Arrary : "+sum);
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,9};
        addition(arr);
    }
}
