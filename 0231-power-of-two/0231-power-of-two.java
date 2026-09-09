class Solution {
    public boolean isPowerOfTwo(int n) {
        
        while(n>0){
            if((n & (n-1)) == 0){
                return true;
            }
            else{
                return false;
            }
        }return false;
    }
}