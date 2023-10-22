class constructor{
    public static void main(String[] args){
        Company c= new Company();    //non parameterized constructor is called
        School s=new School("UPES"); // parameterized constructor of School is called
    }
}
class School{
    int classes;
    String name;

    School(String name){
        System.out.println("College name:"+name);
    }
}
class Company{
    String name;
    Company(){
        System.out.println("Name of the company is Samsung");
    }
}
