class Palindrome{
    public static boolean check_palindrome(String str){  //fuction for checking palindrome
        int n=str.length();   
        for(int i=0; i<n/2; i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){  
                return false;
            }
        }
        System.out.println("The given string is palindrome");
        return true;
        }

    public static void main (String args[]){
        String str="racecar";
        if (check_palindrome(str)) {
            System.out.println("The given string is palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
        }
    }
}
