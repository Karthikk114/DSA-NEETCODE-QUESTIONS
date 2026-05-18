class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=Integer.MIN_VALUE;
        for(int i:nums){
            if(i==n){
                return true;
            }
            n=i;
        }
        return false;
    }
}