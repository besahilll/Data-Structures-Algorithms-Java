class Add{
	void addition(){
	int a=10,b=3;
	int c= a+b;
	System.out.println(c);
	}
	}
	class Calculation extends Add{
		int x=4,y=1;
		int z=x-y;
		
		public static void main(String args[]){
			Calculation n=new Calculation();
			System.out.println("Addition of two numbers is:"+n.addition);
			System.out.println("Subtraction of two numbers is:"+n.z);
		}
	}
