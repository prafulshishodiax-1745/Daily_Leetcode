class Solution {
    public int sumOfSquares(int[] nums) {
        int l = nums.length;
        int sum = 0;
        
        int temp = l;
        while (temp > 0) {
            if (l % temp == 0) {
                sum += nums[temp - 1] * nums[temp - 1];
            }
            temp--;
        }
        
        return sum;
    }
}
