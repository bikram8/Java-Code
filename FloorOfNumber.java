public class FloorOfNumber {
    public static void main(String[] args) {
          int[] arr = {10,50,60,80,99,100};
          int target = 55;
          int ans = floor(arr, target);
        System.out.println(ans);

    }
       static  int floor(int[] arr , int target){

          int start = 0;
           int end = arr.length - 1;

           while (start<= end){
               int mid  = start + (end-start) / 2;

               if(target < arr[mid]){
                   end = mid - 1;

               }
               else if(target > arr[mid]){
                   start = mid + 1;
               } else{
                   return mid;
               }
           }
           return end;
       }
       }

