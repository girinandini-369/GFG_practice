class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;
        int max=-1;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]<=nums[j])
                {
                    int diff=j-i;
                    max=Math.max(max,diff);
                }
            }
        }
        return max;
        
    }
}