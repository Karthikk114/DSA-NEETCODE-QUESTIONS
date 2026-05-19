class Solution {

    public String encode(List<String> strs) {
        StringBuilder str=new StringBuilder();
        for(String s:strs){
            str.append(s+"-");
        }
        return str.toString(); 
    }

    public List<String> decode(String str) {
        System.out.print(str);
        String st="";
        List<String>ls=new ArrayList<>();
        for(char ch:str.toCharArray()){
            if(ch=='-'){
                ls.add(st);
                st="";
            }else{
                st+=ch;
            }
        }
        return ls;
    }
}
