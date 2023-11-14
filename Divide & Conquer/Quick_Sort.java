class Quick_sort{
    public static void quickSort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int pidx=partition(arr, si, ei);
        quickSort(arr,si,pidx-1);
        quickSort(arr,pidx+1,ei);
    }
    public static int partition(int arr[], int si, int ei){   
        int pivot=arr[ei];
        int i=si-1; //to make place elements smaller than pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }

        //to set pivot element
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void printArr(int[] arr){
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
        int[] arr={5,3,4,2,7,1};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
