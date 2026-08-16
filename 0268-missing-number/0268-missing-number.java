class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        int low = 0;
        int high = nums.length-1;
        
        while(low<=high){
            int mid = (low+high)/2;
           
            if(nums[mid] > mid){
                high = mid-1;
            }else{
                
                low = mid+1;
            }
        }return low;
    }
}