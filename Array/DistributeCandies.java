import java.util.*;
class DistributeCandies {
    public static int distributeCandies(int[] candyType) {
        Set<Integer> set=new HashSet<>();
        int halflength=candyType.length/2;
        for(int i: candyType){
            if(set.size()>=halflength){
                return halflength;
            }
            set.add(i);
        }
        return Math.min(halflength,set.size());
    }

    public static void main(String[] args){
        int[] candyType={1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }
}