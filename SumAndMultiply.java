package leetcodeQues;

public class SumAndMultiply {
    public static void main(String[] args) {
int n = 12345;
        System.out.println(subtractProductAndSum(n));
    }
    static int subtractProductAndSum(int n){
        int mul = 1;
          int sum = 0;
          while (n!=0){
              int rem = n % 10;

              sum += rem;
              mul *= rem;
              n /= 10;


          }
             return  mul - sum;
    }
}
