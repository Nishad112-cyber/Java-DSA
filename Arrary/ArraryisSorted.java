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
        if(sorted || dsorted){
            System.out.print("this is sorted arrary : ");
        }else{
            System.out.print("this is not sorted array");
        }
        
    }
    public static void main(String[] args) {
        int arr[]= {5,4,3,2,1};
        isSorted(arr);
    }
}
