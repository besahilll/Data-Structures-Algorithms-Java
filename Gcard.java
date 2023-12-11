import java.util.Scanner;
public class Gcard {
    public static void main(String [] args){
        Student one = new Student();
        one.setData();
        one.get_result();
    }
    
}


class Student {
    Scanner input = new Scanner(System.in);
    String name;
    int rollno;
    Double math;
    Double phy;
    Double chem;
    Double sum;
    Double ;

    public void setData( ){
        System.out.print("Name : ");
        name = input.nextLine();
        System.out.print("Roll no : ");
        rollno = input.nextInt();
        System.out.println("Provide Marks : ");
        System.out.print("Math : ");
        math = input.nextDouble();
        System.out.print("Phy : ");
        phy = input.nextDouble();
        System.out.print("Chem : ");
        chem = input.nextDouble();
    }

    public void get_result(){
        System.out.print(math);
        aggre = ((math+phy+chem)/300)*100;
        System.out.println("\n\nStudent Name : "+name+"\nRoll no.:"+rollno+"\n\n");
        System.out.println("Aggregate : "+aggre);

        if(aggre < 40){
            System.out.println("Fail");
        }else if(aggre >= 40 && aggre <50 ){
            System.out.println("Third Division = Pass");
        }else if(aggre >=50 && aggre <60){
            System.out.println("SEcond Division = Pass");
        }else if (aggre >=60 && aggre <=75){
            System.out.println("First Division = Pass");
        }else{
            System.out.println("Distinction = Pass");
        }
    }
}
