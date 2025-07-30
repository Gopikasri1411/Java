class Solution {

    //this solution got time limit exceeded error. so well apply memoization.
    public int rob(int[] nums) {
        return helper(nums);
    }
    int helper(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==0){
            return 0;
        }
        return Math.max(
    nums[0] + helper(Arrays.copyOfRange(nums, 2, nums.length)),
    helper(Arrays.copyOfRange(nums, 1, nums.length))
);
    }
}

//memoization solution
public int rob(int[] nums) {
        HashMap<Integer,Integer> memo=new HashMap<>();
        return helper(nums,0,memo);
    }
    int helper(int[] nums,int index,HashMap<Integer,Integer> memo){
        if(index>=nums.length){
            return 0;
        }
        if(memo.containsKey(index)){
            return memo.get(index);
        }
        int ans=Math.max(nums[index]+helper(nums,index+2,memo),helper(nums,index+1,memo));
        memo.put(index,ans);
        return ans;
    }
