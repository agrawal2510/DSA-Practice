class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int[] result = new int[nums.length - k + 1];
        int i = 0;
        int j = 0;
        Deque<Integer> dq =  new LinkedList<>();
        while(j<nums.length){
            while(!dq.isEmpty() && dq.peekLast() < nums[j]){
                dq.removeLast();
            }
            dq.addLast(nums[j]);
            
            if(j - i + 1 < k){
                j++;
            }
            else if(j-i+1 == k){
                result[i] = dq.peekFirst();
                if(nums[i] == dq.peekFirst()){
                    dq.pollFirst();
                }
                i++;
                j++;

            }

        }return result;

    }
}