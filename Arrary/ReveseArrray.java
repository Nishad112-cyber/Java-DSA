public class ReveseArrray {
    public static void Reverse(int arr[]){
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7};
        System.out.print("this is reverse array :  ");
        Reverse(arr);
    }
}


// public class ReveseArrray {

//     public static void Reverse(int arr[]){
//         int i= 0,  j=arr.length-1;
//         while (i<j) {
//               int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                   i++;
//                   j--;
//         }
       
        

//     }
//     public static void main(String[] args) {
//         int arr[]= {1,2,3,4,5,6,7};
//         Reverse(arr);
//         for (int k = 0; k < arr.length; k++) {
//             System.out.print(arr[k] + " ");
//         }
      
//     }
// }