public class sumDivisors {
    public static int sumofDivisors(int n){
        int sum=0;
        for(int i=1;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                sum+=i;
                if(i!=n/i){
                    sum+=n/i;
                }
            }
        }
        return sum;
    }
    public static int sumOfAllDivisors(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=sumofDivisors(i);
        }
        return sum;
    }

    public static void main(String args[]){
        int n=5;
        System.out.println(sumOfAllDivisors(n)); // Use sumOfAllDivisors method here
    }
}
