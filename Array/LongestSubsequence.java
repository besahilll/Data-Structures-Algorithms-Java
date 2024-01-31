import java.util.*;
class LongestSubsequence {
    public static int findLengthOfLCIS(int[] nums) {
        int i=0,j=1;
        int maxCount=1;
        int currCount=1;
        while(j<nums.length){
            if(nums[j]>nums[i]){
                i++;
                j++;
                currCount++;
            }else{
                i=j;
                currCount=1;
                j++;
            }
            if(maxCount<currCount){
                maxCount=currCount;
            }
        }
        return maxCount;
    }

    public static void main(String[] args){
        int[] nums={1,3,5,4,7};
        System.out.println(findLengthOfLCIS(nums));
    }
}