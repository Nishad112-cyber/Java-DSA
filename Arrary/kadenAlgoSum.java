public class kadenAlgoSum {
    public static void MaxSum(int arr[]){
        int currSum=arr[0];
        int maxSum=arr[0];
        for(int i=1; i<arr.length; i++){
            currSum= Math.max(arr[i], currSum+arr[i]);
            maxSum= Math.max(currSum,maxSum);

        }
        System.out.print("max-sum = : "+maxSum);
    }
    public static void main(String[] args) {
        int arr[]= {-2,-3,1};
        MaxSum(arr);
    }
}
