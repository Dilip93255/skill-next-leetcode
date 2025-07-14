class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashTable = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(hashTable.containsKey(complement)){
                return new int[] { hashTable.get(complement), i };

                
            }
            hashTable.put(nums[i],i);
        }
        return new int[0];
    }
}