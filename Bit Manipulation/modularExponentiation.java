class modular_exponentiation{
     public static int modular(int n, int a, int x){
         int ans=1;
          while(n>0){
            if((n&1)!=0){  // n->10 , 11 & 01 -> 01
                ans=ans*a; 
            } 
            a=a*a; n=n>>1;
        } 
        return ans %x ;
    }
    public static void main(String args[]){
        int n=3,a=3,x=2;
        System.out.println(modular(n,a,x));
    }
}