class x_power_n{
    public static void main(String args[]){ 
        int x=5;
        int n=4;
        System.out.println(pow(x,n)); 
    }
    public static int pow(int x,int n){
        if(n==0){
            return 1;   //base condition
        }
        int xnm1=pow(x,n-1);
        int xnm=x*xnm1;
        return xnm;
    }
}
