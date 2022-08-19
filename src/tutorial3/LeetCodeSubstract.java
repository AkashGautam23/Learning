package tutorial3;

public class LeetCodeSubstract {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
        public static int subtractProductAndSum(int n) {
            int product=1,sum=0;
            int x=n;
            while(x!=0){
                int digit=x%10;
                sum+=digit;
                product*=digit;
                x/=10;
            }
            return product-sum;
        }
    }

