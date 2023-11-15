// Input-> Sorted,rotated array with distinct numbers(in ascending order). It is rotated at pivot point. Find the index of element.
class Rotated_Sorted_arr{
    public static int Search(int arr[], int tar, int si, int ei){
        int mid=si + (ei-si)/2;
        if(si>ei){  //base condition
            return -1; //target not found
        }
        //cases
        if(arr[mid]==tar){
            return mid;
        }
        if(arr[si]<=arr[mid]){  //mid on line 1 
            //case a:left part
            if(arr[si]<=tar && tar<=arr[mid]){
                return Search(arr,tar,si,mid);
            }
            else{
                //case b:right part
                return Search(arr,tar,mid+1,ei);
            }
        }
        else{ //mid on  Line 2
            //case c:right part
            if(arr[mid]<=tar && tar<=arr[ei]){
                return Search(arr,tar,mid+1,ei);
            }
            else{
                //case d: left part
                return Search(arr,tar,si,mid-1);
            }

        }
    }
    public static void main(String[] args){
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(Search(arr,1,0,arr.length-1));
    }
}
