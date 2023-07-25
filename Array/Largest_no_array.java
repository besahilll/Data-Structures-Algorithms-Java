class Largest_no_array{
    public static int getlargest(int arr[]){
        int largest=Integer.MIN_VALUE; //-infinity
        int smallest=Integer.MAX_VALUE; //+infinity
        
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }    
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println("The smallest value in array is: " + smallest);
        return largest;
    }

    public static void main(String args[]){ 
        int arr[]={2,7,8,9,10};
        System.out.println("The largest value in array is: " +getlargest(arr));
    }
}
