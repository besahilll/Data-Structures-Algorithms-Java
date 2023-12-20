class fib{
	public static void main(String args[]){
		int first=0,sec=1,sum=0;
		System.out.println("Sahil Bathla,500091837");
		System.out.println(first);
		System.out.println(sec);
		for(int i=0;i<9;i++){
			sum=first+sec;
			System.out.println(sum);
			first=sec;
			sec=sum;
		
		}
	}
}
