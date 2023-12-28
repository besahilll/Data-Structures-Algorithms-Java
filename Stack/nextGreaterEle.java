import java.util.*;
class nextGreaterEle{
    public static void next_Greater(int[] arr, int[] nxtGreater){
        Stack<Integer> s = new Stack<Integer>();
        for(int i=arr.length-1;i>=0;i--){
            
            while(!s.isEmpty() && arr[s.peek()]<arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGreater[i]=-1;
            }else{
                nxtGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }

    }
    public static void main(String[] args){
        int[] arr={7,9,8,4,6,1,10};
        int[] nxtGreater=new int[arr.length];
        next_Greater(arr,nxtGreater);
        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}
