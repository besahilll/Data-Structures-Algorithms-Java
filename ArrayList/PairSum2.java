//find if any pair in a sorted and rotated arraylist has a target sum.
import java.util.*;
class PairSum2{
    public static boolean pairSum(ArrayList<Integer> list, int target){
            int n=list.size();
            int bp=-1;
            for(int i=0; i<n; i++){
                if(list.get(i)>list.get(i+1)){
                    bp=i;
                    break;
                }
            }
            int lp=bp+1;
            int rp=bp;
            while(lp<rp){
                //cases
                if(list.get(lp)+list.get(rp)==target){
                    return true;
                }
                if(list.get(lp)+list.get(rp)<target){
                    lp=(lp+1)%n;
                }
                else{
                    rp=(n+rp-1)%n;
                }
            }
            return false;
        }
    public static void main(String[] args){
    
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=14;
        System.out.println(pairSum(list,target)); 
    }
}
