import java.util.*;
class maxProduct {
    public static int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int curr_product=nums[n-1]*nums[n-2]*nums[n-3];
        int curr_product2=nums[0]*nums[1]*nums[n-1];
        int max_product=Math.max(curr_product,curr_product2);
        return max_product;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4};
        System.out.println(maximumProduct(nums));
    }
}