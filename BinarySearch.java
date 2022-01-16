public class BinarySearch {
    public static void main(String[] args) {
          int[] arr = {10,50,85,98,100,110,120,150};
          int target = 50;
          int ans = binarySearch(arr,target);

        System.out.println(ans);

    }
       static  int binarySearch(int[] arr ,int target)  {
        int start = 0;
        int end = arr.length - 1;
          while (start <=end){
              int mid = start + (end - start)/2;
              if(target < arr[mid]){
                  end = mid - 1;
              }
              else if(target > arr[mid]){
                  start = mid + 1;

              }  else{
                  return mid;
              }

          }
               return  -1;


       }
}
