import java.util.*;
class College{
	 String school;
	 int block;
	 String branch;
	public void setdata(){
		Scanner c= new Scanner(System.in);
		System.out.println("Enter your school");
		school=c.next();
		c.next();
		System.out.println("Enter your block");
		block=c.nextInt();
		System.out.println("Enter your branch");
		branch=c.next();
		c.next();
	}
}	
	class Student extends College{
		public static void main(String args[]){
			Student s=new Student();
			System.out.println("School name:"+s.school);
			System.out.println("Block no.:"+s.block);
		    System.out.println("Branch:"+s.branch);
		}
	}
