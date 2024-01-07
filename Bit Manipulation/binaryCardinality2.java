import java.util.*;
class binaryCardinality2{
    public static int[] sortByBits(int[] arr){
        int n=arr.length;
        Integer[] indices=new Integer[n];

        for(int i=0; i<n; i++){
            indices[i]=arr[i];
        }

        Arrays.sort(indices,Comparator.comparingInt(binaryCardinality2::countBit).thenComparing(Comparator.naturalOrder()));
        for(int i=0; i<n; i++){
            arr[i]=indices[i];
        }

        return arr;
    }

    private static int countBit(int n){
        int res=0;
        while(n>0){
            if((n&1)!=0){
                res++;
            }
            n=n>>1;
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int[] sorted=sortByBits(arr);
        for(int i=0; i<sorted.length; i++){
            System.out.print(sorted[i] + " ");
        }
    }
}