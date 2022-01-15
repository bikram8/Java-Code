package com.company;

import java.net.SocketOption;

public class LinearSearch {
     static int Linear(int[] arr , int target){
          if(arr.length ==0 ){
               return -1;
          }
          for(int i=0;i<arr.length ; i++) {

               if (arr[i] == target) {
                    return i;
               }
          }
//          System.out.println("The target does not exists in the given arrays");
          return -1;
     }
     public static void main(String[] args) {
           int[] nums = {20,22,52,85,75,85};
           int target = 85;
          int ans =  Linear(nums,target );
          System.out.println(ans);
     }
}
