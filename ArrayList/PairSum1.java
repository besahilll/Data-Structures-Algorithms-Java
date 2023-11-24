//find if any pair in Sorted arraylist has a target sum
import java.util.*;
class PairSum1{
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int lp=0;
        int rp=list.size()-1;
        
        while(lp<rp){
            //cases
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp) + list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }


    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(13);
        list.add(17);
        list.add(21);
        list.add(23);
        int target=11;
        System.out.println(pairSum(list,target));
        

    }
}
