class check_pow_of_2{

    public static boolean check_pow(int n){
        return (n&(n-1))==0;
    }
    public static void main(String args[]){
        int n=9;
        System.out.println(check_pow(n));
    }
}
