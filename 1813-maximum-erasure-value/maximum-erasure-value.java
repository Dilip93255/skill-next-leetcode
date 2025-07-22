import java.util.HashSet;
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int left = 0, right = 0, sum = 0,maxScore= 0;
        while (right < nums.length) {
            while (seen.contains(nums[right])){
                seen.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            seen.add(nums[right]);
            sum += nums[right];
            maxScore = Math.max(maxScore, sum);
            right++;
        }
        return maxScore;
    }
}