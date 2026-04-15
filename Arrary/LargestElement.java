public class LargestElement {
  public static void Large(int arr[]){
       int largest= Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        if(largest<arr[i]){
            largest= arr[i];  
        } 
    }
    System.out.print("this is largest number : "+largest);
  }
    public static void main(String[] args) {
        int arr[]= {2,4,5,7,9,8};
       Large(arr);
    }
}