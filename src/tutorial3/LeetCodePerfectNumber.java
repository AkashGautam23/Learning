package tutorial3;

public class LeetCodePerfectNumber {
    public static void main(String[] args) {
        checkPerfectNumber(28);
    }
    public static boolean checkPerfectNumber(int num) {
        int res = 1;
        for(int i=2;i*i<=num;i++)
            if(num%i==0) res+=i+num/i;
        return num==1? false:res==num;
    }
}
