package org.example;

import java.lang.annotation.Documented;
import java.util.SortedMap;

public class TestStrings {
    public static void main(String[] args) {
        String str1 =  "example.doc";
        str1="example.bak";
       // System.out.println(str1);


        String str2 ="the quick brown fox swallowed down the lazy chicken";
        String target = "ow";

        int count = 0;
        for(int i=0;i< str2.length()-1;i++){
            if(str2.substring(i,i+2).equals(target)){
                count++;
            }
        }
        System.out.println("occurances of ow = "+count);


        int[] freq = new int[256];
        for(char c:str2.toCharArray()){
            freq[c]++;
        }
        for(char c: str2.toCharArray()){
            if(freq[c]>1){
                System.out.print(c);
                freq[c]=0;
            }
        }
        System.out.println("");

        String str3="eve";
        String rev ="";

      for(int i=str3.length()-1;i>=0;i--){
          rev=rev+str3.charAt(i);
      }
      String palin = str3.equals(rev) ? "Palindrome" : "Not Palindome";
        System.out.println(palin);

    }
}
