class isPalindrome {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        boolean flag=false;
        int num=x;
        int reverse=0;
        while(num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
        
        return reverse==x;
    }
    public static void main(String[] args){
        int x= 343;
        System.out.println(isPalindrome(x));

    }
}