class count_set_bit{
    public static int count_bit(int n){
        int count=0;
        while(n>0){
            if((n & 1) !=0){  //check LSB
                count++;
            }
            n=n>>1; // right shift
        }
        return count;
    }
    public static void main(String[] args){
        int n=10;
        System.out.println("So the number of count bits is:"+count_bit(n));
    }
}
