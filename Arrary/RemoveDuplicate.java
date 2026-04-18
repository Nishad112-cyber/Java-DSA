public class RemoveDuplicate {
    public static void removeDuplicate(int arr[]){
        for(int i=0; i<arr.length; i++){
           if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                  System.out.print(" " + arr[i]);
         }
        }
        
       
    }
   
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,4,4,5,5,5,6,7,7,7,9};
       
        removeDuplicate(arr);
        
        
    }
}
