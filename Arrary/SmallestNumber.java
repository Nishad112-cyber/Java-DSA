public class SmallestNumber {
    public static void Large(int arr[]){
       int smallest= Integer.MAX_VALUE;
    for(int i=0; i<arr.length; i++){
        if(smallest>arr[i]){
            smallest= arr[i];  
        } 
    }
    System.out.print("this is samallest number : "+smallest);
  }
    public static void main(String[] args) {
        int arr[]= {2,4,5,7,9,8};
       Large(arr);
    }
}
