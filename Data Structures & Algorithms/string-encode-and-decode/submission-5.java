class Solution {

    public String encode(List<String> strs) {
        StringBuilder str=new StringBuilder();
        for(String s:strs){
            str.append(s+"-");
        }
        return str.toString(); 
    }

    public List<String> decode(String str) {
        StringBuilder st=new StringBuilder("");
        List<String>ls=new ArrayList<>();
        for(char ch:str.toCharArray()){
            if(ch=='-'){
                ls.add(st.toString());
                st.setLength(0);
            }else{
                st.append(ch);
            }
        }
        return ls;
    }
}
