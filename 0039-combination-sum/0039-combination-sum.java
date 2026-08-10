class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        solve(0,candidates,target, new ArrayList<>() , result);
        return result;
    }
    void solve(int index , int[]candidates, int target, List<Integer>ans , List<List<Integer>>result){
        if(target == 0){
            result.add(new ArrayList<>(ans));
            return;
        }
        if(target<0 || index == candidates.length){
            return;        
        }
        ans.add(candidates[index]);
        solve(index , candidates,target-candidates[index], ans,result);
        ans.remove(ans.size()-1);
        solve(index+1,candidates,target,ans,result);
    }
}