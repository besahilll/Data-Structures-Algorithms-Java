public class reverseBits {
    public static long reverseBits(long n) {
        long result=0;
		for(int i=0;i<32;i++){
			long lsb= n & 1;
			long reverseLsb= lsb <<(31-i);
			result= result | reverseLsb;
			n=n>>1;
		}
		return result;
    }
	public static void main(String[] args){
		int n=12;
		System.out.println(reverseBits(n));
	}
}
