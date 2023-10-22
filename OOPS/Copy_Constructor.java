class copy_constructor{
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Sahil";
        s1.roll=673;
        s1.password="abc";
        s1.marks[0]=97;
        s1.marks[1]=92;
        s1.marks[2]=93;
        Student s2=new Student(s1);  //copy constructor
        s2.password="xyz";
        s1.marks[1]=95;

        for(int i=0; i<3;i++){
            System.out.println(s2.marks[i]);  
        }
        System.out.println(s1.password);    
        System.out.println(s2.password);

    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    
    //Shallow copy
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;  //copy by reference
    }
    /*Deep copy
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<3;i++){
        this.marks[i]=s1.marks[i];
        }
    } */
    
    Student(){
        marks=new int[3];
        System.out.println("Constructor is called");
    }
    Student(String name){
        marks=new int[3];
        this.name=name;
    }
    Student(int roll){
        marks=new int[3];
        this.roll=roll;
    }

}
