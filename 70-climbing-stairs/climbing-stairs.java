class Solution {
    public int climbStairs(int n) {
        if(n==0)return 0;
        if (n==1)return 1;
        int f0=0;
        int f1=1;
        int sum=0;
        for(int i = 1;i<=n;i++){
            sum = f0+f1;
            f0=f1;
            f1=sum;
        }
        return sum;
    }
}