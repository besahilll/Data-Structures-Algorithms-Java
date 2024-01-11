/*A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. 
That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
*/
import java.util.*;
class SummaryRanges{
    public static List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int n=nums.length;
        int i=0;
        while(i<n){
            int j=i;
            while(j<n-1 && nums[j+1]==nums[j]+1){
                j++;
            }
            if(i==j){
                list.add(nums[i] + "");
            }else{
                list.add(nums[i]+"->"+nums[j]);
            }
            i=j+1;
        }
        return list;
    }
    public static void main(String[] args){
        int nums[]={0,1,2,5,7,8,9,11};
        System.out.println(summaryRanges(nums));
    }
}