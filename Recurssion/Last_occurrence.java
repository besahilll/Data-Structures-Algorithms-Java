class Last_occurrence{
    public static void main(String args[]){
        int arr[]={2,5,7,9,8,7,9};
        int key=7;
        System.out.println(Last_occurrence(arr,0,key));
    }
    public static int Last_occurrence(int[] arr,int i,int key){
        if(i==arr.length-1){
            return -1;
        }
        int isFound=Last_occurrence(arr,i+1,key);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
}
