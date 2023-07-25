class Linear_Search{

    public static int LinearSearch(int arr[],int key){
        for(int i=0; i<arr.length;i++){  //loop to iterate through every element of array
            if(key==arr[i]){
                return i;
            }
        }
        return -1;  //key element not found
    }
    public static void main(String[] args){
        int arr[]={3,5,7,9,2,4,8};  //initialized array
        int key=2;
        int index=LinearSearch(arr , key);
        if(index==-1){
            System.out.println("The key element " + key + " is not present in the array");
        }
        else{
            System.out.println("The key element is found at index " + index);
        }
    }
}
