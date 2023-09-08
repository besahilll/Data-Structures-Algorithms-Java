class clear_ith{
    public static int clear_bit(int n, int i){
        int bitmask= ~(1<<i);    
        return n & bitmask;  // 1010 & 1101
    }
    public static void main(String args[]){
        int n=10,i=1;
        System.out.println(clear_bit(n,i));
    }
}
