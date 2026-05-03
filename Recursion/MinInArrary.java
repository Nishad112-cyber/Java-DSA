public class MinInArrary {
    public static int findMin(int arr[], int index){
        if(index== arr.length-1){
            return arr[index];
        }
        int minRest= findMin(arr, index+1);
        return Math.min(arr[index], minRest);

    }
    public static void main(String[] args) {
        int arr[]= {14,5,6,8,9};
        int result= findMin(arr, 0);
        System.out.print("minimum element : =  "+ result);
    }
}
