public class countDigits {
    public static int countDigits(int n){
        int count=0;;
        int curr=n;
        while(curr>0){
            int k=curr%10;
            if(k!=0){
                if(n%k==0){
                    count++;
                }
            }
            curr/=10;
        }
        return count;
    }
    public static void main(String args[]){ 
        int n=336;
        System.out.println(countDigits(n));
    }
}