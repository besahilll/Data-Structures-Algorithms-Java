import java.util.*;
class threeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int resultSum=nums[0]+nums[1]+nums[2];
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return target;
                }
                if(sum<target){
                    left++;
                }else{
                    right--;
                }
                int DiffToTarget=Math.abs(sum-target);
                if(DiffToTarget<minDiff){
                    resultSum=sum;
                    minDiff=DiffToTarget;
                }
            }
        }
        return resultSum;       
    }

    public static void main(String[] args){
        int[] nums = {-1,2,1,-4};
        int target=1;
        System.out.println(threeSumClosest(nums,target));
    }
}