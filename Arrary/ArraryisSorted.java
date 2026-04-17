public class ArraryisSorted {
    public static void isSorted(int arr[]){
        boolean sorted= true;
        boolean dsorted= true;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]  ){
                sorted=false;
                 
            }else if (arr[i]<arr[i+1]){
                dsorted=false; 
            }
        }
        if(!sorted && !dsorted){
            System.out.print("this is not sorted : ");
        }else{
            System.out.print("this is sorted arrary");
        }
        
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7};
        isSorted(arr);
    }
}
