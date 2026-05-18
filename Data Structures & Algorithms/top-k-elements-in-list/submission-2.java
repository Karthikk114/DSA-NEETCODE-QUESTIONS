class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int []freq=new int[2000];
        for(int i:nums){
            freq[i+1000]++;
        }
        int a[]=new int[k];
        int v=0;
        for(int i=0;i<k;i++){
            int maxValue=-1;
            int maxFreq=-1;
            for(int j=0;j<freq.length;j++){
                if(freq[j]>maxFreq){
                    maxFreq=freq[j];
                    maxValue=j;
                }
            }
            a[i]=maxValue-1000;
            freq[maxValue]=0;
        }

        return a;
        
    }
}
