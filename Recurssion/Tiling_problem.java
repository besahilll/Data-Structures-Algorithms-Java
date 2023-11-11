/*Given a "2*n" board/floor and tiles size 2*1,
count the number of ways to tile the given board using the 2*1 tiles.
A tile can either be placed horizontally or vertically*/
import java.util.*;
class Tiling_problem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the floor(2*n): ");
        int n=sc.nextInt();
        System.out.println(tiling(n));
    }
    public static int tiling(int n){
        if(n==0||n==1){
            return 1;
        }
        int fnm1=tiling(n-1);
        int fnm2=tiling(n-2);
        
        return fnm1 + fnm2;
    }
}
