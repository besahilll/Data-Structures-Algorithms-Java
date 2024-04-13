//Java Recursion basic-> changes made
import java.util.*;
public class Recurssionbasic {
    public static int[] printNos(int x) {
        int[] ans=new int[x];

        recursiveFunc(x,ans);
        
        return ans;
    }

    public static void recursiveFunc(int x, int[] ans){
        if(x==0){
            return;
        }

        recursiveFunc(x-1, ans);

        ans[x-1]=x;
    }

    public static void main(String[] args){
        int x=5;
        int[] arr=printNos(x);
        for(int i=0;i<x;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}