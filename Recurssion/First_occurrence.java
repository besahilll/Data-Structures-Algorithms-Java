class First_occurence{
    int key=5;
    public static void main(String[] args){
        int[] arr={7,2,5,3,5,7,9};
        System.out.println(First_occurence(arr,0));
    }
    public static int First_occurence(int[] arr, int i){
        if(arr[i]==9){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        else{
            return First_occurence(arr,i+1);
        }
    }

}
