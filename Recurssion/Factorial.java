class Factorial{
    public static void main(String args[]){
        int n=5;
        System.out.println(Print_Fact(n));
    }

    public static int Print_Fact(int n){
        if(n==0){
            return 1;
        }
        int factnm1=Print_Fact(n-1);
        int factn=n*factnm1;
        return factn;
    }
}
