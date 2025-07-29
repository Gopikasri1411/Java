class Solution {
    public int fib(int n) {
        // brute force solution 
        // if(n==0 || n==1){
        //     return n;
        // }
        // return fib(n-1)+fib(n-2);

        //memoization
        int[] arr=new int[n+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
        return helper(n,arr);
    }
    int helper(int n,int[] memo){
        if(n<=1){
            return n;
        }
        if(memo[n]!=-1){
            return memo[n];
        }

        memo[n]=helper(n-1,memo)+helper(n-2,memo);
        return memo[n];
    }
}
