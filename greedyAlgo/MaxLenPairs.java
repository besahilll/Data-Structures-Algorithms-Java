/*You are given n pairs of numbers. In every pair, the first number is 
always smaller than the second number. A pair(c,d) can come after (a,b) if b<c. 
find the longest chain which can be formed from a given set of pairs*/
import java.util.*;
class MaxLenPairs{
    public static void main(String args[]){
        int[][] pairs={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int chain=1;
        int maxlen=1;
        int lastEnd=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>lastEnd){
                maxlen++;
                lastEnd=pairs[i][1];
            }
        }
        System.out.println(maxlen);
    }
}