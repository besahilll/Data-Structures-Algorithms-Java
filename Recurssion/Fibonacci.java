class fibonacci{
    public static void main(String[] args){
        int n=10;
        System.out.println(print_fib(n));
    }
    //printing fibonacci series using recurssion
    public static int print_fib(int n){
        if(n==0 || n==1){  
            return n;
        }
        int fibnm1=print_fib(n-1);
        int fibnm2=print_fib(n-2);
        int fibn=fibnm1+fibnm2;
        return fibn;
    }
}
