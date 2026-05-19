class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] pre=new int[n];
        int [] suff=new int[n];
        int []ans =new int[n];
        int p=1;
        int s=1;
        for(int i=0;i<n;i++){
           pre[i]=p;
           p*=nums[i];
           suff[n-1-i]=s;
           s*=nums[n-1-i];
        }
        for(int i=0;i<n;i++){
            ans[i]=pre[i]*suff[i];
        }
        return ans;  
    }
}  
