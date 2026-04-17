public class Getindex {
    public static int Getelement(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
               return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,9,8,6,44};
        int key= 6;
        
        int index=Getelement(arr, key);
        if(index== -1){
            System.out.print("index not foud : ");
        }else{
            System.out.print("this is index : "+index);
        }
    }
}
