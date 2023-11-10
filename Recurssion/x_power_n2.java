import java.util.*;
class x_power_n2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x:");    
        int x=sc.nextInt();   //Input
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();  //Input
        System.out.println(pow(x,n));
    }
    public static int pow(int x,int n){
        if(n==0){
            return 1; //base condition
        }
        int halfpower=pow(x,n/2);
        int halfpowersq=halfpower*halfpower;  //O(logn)

        //n is odd
        if(n%2!=0){
            halfpowersq= x * halfpowersq;
        }

        return halfpowersq;
    }
}
