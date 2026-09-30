public class Frequency {

    public static void Frequency(int arr[]){
        int count=0;
        int target= 4;
        for(int i=0; i<arr.length; i++){
            if(arr[i]== target){
                count++;
            }
        }
        System.out.print(" frequency of number is : "+count);
    }
   public static void main(String[] args) {
    int arr[]= {1,2,3,4,5,2,4,4,4,4,5};
    Frequency(arr);
   } 
}
