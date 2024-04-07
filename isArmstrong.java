import java.util.*;
public class isArmstrong {
	public static boolean isarmstrong(int n){
		int curr=n;
		int count=0;
		while(curr>0){
			count++;
			curr/=10;
		}
		int arm=0;
		curr=n;
		while(curr>0){
			int k=curr%10;
			arm+=Math.pow(k,count);
			curr/=10;
		}

		return arm==n;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isarmstrong(n));
		
	}
}
