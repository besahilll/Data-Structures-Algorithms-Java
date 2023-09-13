class fast_exponentiation{
    public static int exponent(int n, int a){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        int n=5,a=3;
        System.out.println(exponent(n,a)); // a^n
    }
}
