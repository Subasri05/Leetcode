class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0, CurrCount = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 1){
                CurrCount++;
                max = max > CurrCount ? max : CurrCount;
            }else{
                CurrCount = 0;
            }
        }
        return max;
    }
}
