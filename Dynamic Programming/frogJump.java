public class Solution {
    public static int frogJump(int n, int heights[]) {
      //space optimization method; space(O(1)) time (O(n))
        if (n == 1) {
            return 0;
        }
        int energy1 = 0;
        int energy2 = Math.abs(heights[1] - heights[0]);
        int energy3 = energy2;
        for (int i = 2; i < n; i++) {
            int e1 = energy1 + Math.abs(heights[i] - heights[i - 2]);
            int e2 = energy2 + Math.abs(heights[i] - heights[i - 1]);
            energy3 = Math.min(e1, e2);
            energy1 = energy2;
            energy2 = energy3;
        }
        return energy3;
    }

}


public int maxJump(int[] stones) {
        int n=stones.length-1;
        //brute force using recursion
        //return helper(n,stones);
    }
    int helper(int n,int[] stones){
        if(n==0){
            return 0;
        }
        int step1=helper(n-1,stones)+Math.abs(stones[n]-stones[n-1]);
        int step2=Integer.MAX_VALUE;
        if(n>1){
            step2= helper(n-2,stones)+Math.abs(stones[n]-stones[n-2]); 
        }
        return Math.min(step1,step2);
    }
//optimized
public int maxJump(int[] stones) {
        int[] dp=new int[stones.length];
        dp.fill(-1);
        int n=stones.length-1;
        return helper(n,stones,dp);
    }
    int helper(int n,int[] stones,int[] dp){
        if(n==0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int step1=helper(n-1,stones,dp)+Math.abs(stones[n]-stones[n-1]);
        int step2=Integer.MAX_VALUE;
        if(n>1){
            step2= helper(n-2,stones,dp)+Math.abs(stones[n]-stones[n-2]); 
        }
        dp[n]=Math.min(step1,step2);
        return dp[n];
    }
