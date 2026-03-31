class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> first=new HashMap<>();
        HashMap<Character,Integer> second=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            first.put(s.charAt(i),first.getOrDefault(s.charAt(i),0)+1);
            second.put(t.charAt(i),second.getOrDefault(t.charAt(i),0)+1);
        }
        if(first.size()!=second.size()){
            return false;
        }
        for(char max:first.keySet()){
            if(!second.containsKey(max)){
                return false;
            }
            int a=first.get(max);
            int b=second.get(max);
            if(a!=b){
                return false;
            }
        }
        return true;
    }
}
