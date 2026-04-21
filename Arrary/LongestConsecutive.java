public class LongestConsecutive {

    public static void LongestSequence(int arr[]){
        int currSeq=1;
        int maxSeq=1;
    
        for(int i=1; i<arr.length; i++){
          if(arr[i]== arr[i-1]+1 ) {
           currSeq++;
          
           }else if(arr[i]==arr[i-1]  ){
            continue;
            
          }else{
            currSeq=1;
          }
             maxSeq= Math.max(maxSeq, currSeq);
            
        }
       
                System.out.print(maxSeq);
       
    }
    public static void main(String[] args) {
        int arr[]= {9,10,11,22,45,46,47,48};
        LongestSequence(arr);
    }
}