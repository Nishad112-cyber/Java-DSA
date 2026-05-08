 import java.util.*;

public class Parmutation {
   


    public static void permute(int[] arr, int start) {

        if (start == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = start; i < arr.length; i++) {

            // swap
            int temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;

            permute(arr, start + 1);

            // backtrack (swap back)
            temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        permute(arr, 0);
    }
}

