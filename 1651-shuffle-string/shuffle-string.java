class Solution {
    public String restoreString(String s, int[] indices) {
    char[] ss=new  char[s.length()];
    for(int i=0;i<s.length();i++){
        ss[indices[i]]=s.charAt(i);}
    return new String(ss);  
    }}
