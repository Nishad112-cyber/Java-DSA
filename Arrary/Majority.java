public class Majority {
    public static void MajorityNbyTwo(int arr[]){
        int maximum= arr.length/2;       
        for(int i=0; i<arr.length; i++){
             int count=0;
            for(int j=0; j<=arr.length-1; j++){
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
        int arr[]= {8,2,8,8,8,8,3,9,1};
        MajorityNbyTwo(arr);
    }
}
