import  java.util.*;
public  class Practice {

    public  static boolean Anagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        char [] a = s1.toCharArray();
         char [] b = s1.toCharArray();

         Arrays.sort(a);
         Arrays.sort(b);


          return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

         if (Anagram(s1, s2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}