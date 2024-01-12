class MoveZeroes{
    public static void moveZeroes(int[] nums) {
        int j=0;
        int n=nums.length;
        if(n==1){
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<n){
            nums[j]=0;
            j++;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
    
    public static void main(String[] args){
        int nums[]={0,0,0,3,5,7,13};
        moveZeroes(nums);
    }
}
