public class Frequency {

    public static void Frequency(int arr[]){
        int count=0;
        int target= 3;
        for(int i=0; i<arr.length; i++){
            if(arr[i]== target){
                count++;
            }
        }
        System.out.print(" frequency of number is : "+count);
    }
   public static void main(String[] args) {
    int arr[]= {1,2,3,4,5,2,3,3,3,5};
    Frequency(arr);
   } 
}
