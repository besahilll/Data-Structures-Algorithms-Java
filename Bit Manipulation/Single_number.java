class Single_number {
    public static int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            result^=nums[i];
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums={1,2,2,3,4,3,5,4,5};
        System.out.println(singleNumber(nums));
    }
}