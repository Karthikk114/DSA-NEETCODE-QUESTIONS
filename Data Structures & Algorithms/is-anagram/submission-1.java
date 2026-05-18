class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int [] freq=new int[256];
        for(char ch1:s.toCharArray()){
            freq[ch1]++;
        }
        for(char ch2:t.toCharArray()){
            freq[ch2]--;
        }
        for(int i:freq){
            if(i>=1)return false;
        }
        return true;

    }
}
