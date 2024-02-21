/*Given 2 arrays A and B of equal length n. 
Pair each element of A to an element in array B, such that sum S of absolute differeneces of all the pairs is minimum*/
import java.util.*;
class DiffPairs{
    public static void main(String[] args){
        int[] A={1,2,3};
        int[] B={2,1,3};
        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff=0;
        for(int i=0;i<A.length;i++){
            minDiff += Math.abs(A[i]-B[i]);
        }
        System.out.println("Minimum Absolute Difference is: " + minDiff);
    }
}
