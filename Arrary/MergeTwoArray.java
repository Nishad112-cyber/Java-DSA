public class MergeTwoArray {
    public static int[] MergeArr(int arr1[], int arr2[]){
        int n= arr1.length;
        int m= arr2.length;

        int merge[]= new int[n+m];
        int i=0,j=0,k=0;
        while (i<n && j<m) {
            if(arr1[i]<arr2[j]){
                merge[k]= arr1[i];
                i++;
            }else{
                merge[k]= arr2[j];
                j++;
            }
            k++;
        }

        while (i<n) {
            merge[k]= arr1[i];
            i++;
            k++;
        }
        while (j<m) {
            merge[k]= arr2[j];
            j++;
            k++;
        }
         return merge;
    }
    public static void main(String[] args) {
        int arr1[]= {1,3,5,7,9};
        int arr2[]= {2,4,6,8,10};
        int result[]= MergeArr(arr1, arr2);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
   

}
