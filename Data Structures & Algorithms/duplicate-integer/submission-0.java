class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int max:hm.keySet()){
            if(hm.get(max)>1){
                return true;
            }
        }
        return false;
    }
}