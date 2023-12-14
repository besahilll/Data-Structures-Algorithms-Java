import java.util.*;
class Account{
	public void setInvoice(int a, String n, double b){
	  Scanner s= new Scanner(System.in);
	  System.out.println("Enter your Account no.:");
	  a=s.nextInt();
	  System.out.println("Enter Account Holder name:");
	  n=s.nextString();
          }    
        public void amtDeposit(double amt){
	   System.out.println("Enter the amount you want to deposit:");
 	   amt=s.nextDouble();
	   b=amt+b;
           Showbalance();
	   }
       public void Showbalance(){
	   System.out.println("Balance is:"+b);
	   }
       public void amtWithdrawl(double amt){
	   System.out.println("Enter the amount you want to withdrawl:");
 	   amt=s.nextDouble();
	   b=amt+b;
           Showbalance();
	   }
       public static void main(){
           b=60000;
	   setInvoice(a,n,b);
	   amtDeposit(double amt);
	   amtWithdrawl();
           }
}
