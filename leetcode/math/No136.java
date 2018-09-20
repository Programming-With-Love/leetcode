class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        for(int i = 0;i < nums.length;i++){
            if(i == 0){
                if(nums[0] != nums[1]){
                    return nums[0];
                }
            }else if(i == nums.length - 1){
                if(nums[nums.length - 2] != nums[nums.length - 1]){
                    return nums[nums.length - 1];
                }
            }else if(nums[i] != nums[i-1] && nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }
}
class OtherSolution {
    public int singleNumber(int[] nums) {
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum ^= nums[i];
        }
        return sum;
    }
}
