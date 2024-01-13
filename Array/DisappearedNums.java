import java.util.*;
class DisappearedNums{
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args){
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}

