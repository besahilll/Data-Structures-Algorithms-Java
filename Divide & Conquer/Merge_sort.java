class Merge_sort{
    public static void Mergesort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=si + (ei-si)/2;
        Mergesort(arr,si,mid);
        Mergesort(arr,mid+1,ei);
        Merge(arr,si,mid,ei);
    }
    
    public static void Merge(int[] arr, int si, int mid, int ei) {
        int[] temp=new int[ei-si+1];
        int i=si; //iterator for left part
        int j=mid+1; //iterator for right part
        int k=0; //iterator for temporary array

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //for left leftover part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //for right leftover part
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //copy temp arr to original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    //printing the sorted array
    public static void printarr(int[] arr){
        System.out.println("Printing the elements of array in  ascending order");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Printing the elements of array in  descending order");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr={5,2,3,4,5,6,7,9};
        int si=0,ei=arr.length-1;
        Mergesort(arr,si,ei);
        printarr(arr);
    }
}
