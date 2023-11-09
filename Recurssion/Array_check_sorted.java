class Array_check_sorted{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};    //Sorted
        int[] arr2={3,4,2,5,7};   //unsorted
        System.out.println(isSorted(arr,0));  
        System.out.println(isSorted(arr2,0));

    }
    public static boolean isSorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<=arr[i+1]){
            return isSorted(arr,i+1);
        }
        else{
            return false;
        }
    }
}
