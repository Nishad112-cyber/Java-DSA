public class Majority {
    public static void MajorityNbyTwo(int arr[]){
        int maximum= arr.length/2;
       
        for(int i=0; i<arr.length; i++){
             int count=0;
            for(int j=0; j<=i; j++){
                if(arr[i]== arr[j]){
                    count++;
                }
            }
            if(count>maximum){
                System.out.print("majority element => "+arr[i]);
                break;
            }
        }
          
    }
    public static void main(String[] args) {
        int arr[]= {1,2,1,1,1,1,3,1,1};
        MajorityNbyTwo(arr);
    }
}
