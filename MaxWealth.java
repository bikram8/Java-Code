package com.company;

public class MaxWealth {
    public static void main(String[] args) {
         int[][] accounts = {
                 {2,4,5,6},
                 {8,7,9,5},
                 {9,7,5,6}
         };
        System.out.println(maxW(accounts));
    }
     static int maxW(int[][] accounts){
        int ans = Integer.MIN_VALUE;

        for(int person = 0 ; person < accounts.length ; person++){
              int sum = 0;
            for(int account = 0 ; account < accounts[person].length ; account++){
                sum += accounts[person][account];
            }

             if(sum > ans){
                 ans = sum;
             }
        }
          return ans;
     }
}
