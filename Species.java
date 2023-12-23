class Species{
	public static void main(String args[]){
		Dog obj1=new A();
		obj1.run();
		
}
}
interface Dog{
	public void run();
}
class Animal implements Dog{
	public void run(){
		System.out.println("Animal Running");
}
}
class A extends Animal implements Dog{
	public void run(){
		System.out.println("Animal Running");
}
}
