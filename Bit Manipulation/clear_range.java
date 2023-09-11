class clear_range{
    public static int clear_range(int n,int i,int j){
        int a= -1<<(j+1);   // 10000
        int b=(1<<i)-1;  // 00001
        return n & (a|b);  // 10001
    }

    public static void main(String args[]){
        int n=31,i=1,j=3;
        System.out.println(clear_range(n,i,j));
    }
}
