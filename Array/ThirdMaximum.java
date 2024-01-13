class ThirdMaximum{
    public static int thirdMax(int[] nums) {
        long max1=Long.MIN_VALUE;
        long max2=Long.MIN_VALUE;
        long max3=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max1=Math.max(max1,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max1){
                max2=Math.max(max2,nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max1 && nums[i]!=max2){
                max3=Math.max(max3,nums[i]);
            }
        }
        if(max3!=Long.MIN_VALUE){
            return (int)max3;
        }
        return (int)max1;
    }

    public static void main(String[] args){
        int[] nums={5,7,3,2,1,10};
        System.out.println(thirdMax(nums));
    }
}
