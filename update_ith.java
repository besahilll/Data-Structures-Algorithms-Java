class update_ith{

    public static int set_bit(int n, int i){
        int bitmask=1<<i;
        return n | bitmask;     // 1010 | 0100
    }
    public static int clear_bit(int n, int i){
        int bitmask= ~(1<<i);    
        return n & bitmask;  // 1010 & 1101
    }
    public static int update_bit(int n, int i, int newbit){
        if(newbit==0){
            return clear_bit(n, i);
        }
        else{
            return set_bit(n, i);
        }

    }
    public static void main(String args[]){
        int n=10,i=2,newbit=1;
        System.out.println(update_bit(n,i,newbit));
    }
}
