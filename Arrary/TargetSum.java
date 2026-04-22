public class TargetSum {
    public static void GetTargetSum(int arr[], int sum){
      
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                if(arr[i]+arr[j]== sum){
             System.out.print("Getting sum= "+"("+arr[i]+" ,"+arr[j]+") => ");
                    break;
                   
                }
            } 
        }
        
        
    }   
    public static void main(String[] args) {
        int arr[]= {6,2,9,5,7};
        int sum= 15;
        GetTargetSum(arr, sum);
        System.out.println(sum);
    }
}
