import java.util.*;
class majorityElement{
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args){
        int nums[]={1,2,3,1,1};
        System.out.println(majorityElement(nums));
    }
}