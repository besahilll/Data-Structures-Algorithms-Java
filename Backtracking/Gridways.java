class Gridways{
    public static int gridways(int i, int j, int n, int m){
        if(i==n-1 && j==m-1){
            return 1;
        } else if(i==n || j==n){
            return 0;
        }
        int w1=gridways(i+1,j,n,m);//down
        int w2=gridways(i,j+1,n,m);//right
        return w1 + w2;
    }

    public static void main(String[] args){
        int n=3,m=3;
        System.out.println("Total no. of ways: "+gridways(0,0,n,m));
    }
}
/*This problem has a time complexity of O(2^(n+m)) which is a very poor time complexity
There is a Math trick to solve this problem in linear time by using permutations
no. of ways= (n-1 + m-1)!/(n-1)! (m-1)!
