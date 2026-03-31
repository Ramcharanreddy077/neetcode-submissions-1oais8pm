class Solution {
    public void ans(int[] nums,List<Integer> processed,int target,List<List<Integer>> result,int index){
        if(target==0){
            result.add(new ArrayList<>(processed));
            return;
        }
        if(target<1){
            return;
        }
        for(int i=index;i<nums.length;i++){
           processed.add(nums[i]);
           ans(nums,processed,target-nums[i],result,i);
           processed.remove(processed.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        ans(nums,new ArrayList<>(),target,result,0);
        return result;
    }
}
