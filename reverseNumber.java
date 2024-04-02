
public class reverseNumber {
	public static long reverseBits(long n) {
		long num=n;
		long price=0;
		while(num!=0){
			long digit=num%10;
			price=price*10+digit;
			num=num/10;
		}
		return price;
	}
}
