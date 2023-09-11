//This is the code to clear the last i bits of a number
class clear_last_i{
    public static int clear_bits(int n, int i){
        int bitmask= -1<<i;
        return n & bitmask;
    }
    public static void main(String args[]){
        int n=7,i=2;
        System.out.println(clear_bits(n,i));
    }
}
