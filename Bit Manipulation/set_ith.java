class set_ith{

    public static int set_bit(int n, int i){
        int bitmask=1<<i;
        return n | bitmask;     // 1010 | 0100
    }
    public static void main(String args[]){
        int n=10;
        int i=2;
        System.out.println(set_bit(n,i));
    }
}
