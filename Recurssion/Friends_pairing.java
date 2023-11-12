/*Given n friends, each one can remain single or can be paired up with some other friend.
Each friend can be paired only once. Find out the total no. of ways in which friends can remain single or paired up,*/

class Friends_pairing{
    public static int friends_pair(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1=friends_pair(n-1);
        int fnm2=friends_pair(n-2);
        int pairways=(n-1)*fnm2;
        return fnm1 + pairways;
    }
    public static void main(String[] args){
        int n=3;
        System.out.println("No.of ways:" +friends_pair(n));
    }
}
