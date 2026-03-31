class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int complement=0;
        for(int i=0;i<nums.length;i++){
            complement=target-nums[i];
            if(hm.containsKey(complement)){
                return new int[]{hm.get(complement),i};
            }else{
                hm.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
