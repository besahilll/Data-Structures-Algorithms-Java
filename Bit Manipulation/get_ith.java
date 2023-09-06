class get_ith{

    public static int getith(int n,int i){
        int bitmask= 1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        int n=5;
        int i=2;
        System.out.println(getith(n,i));
    }
}
