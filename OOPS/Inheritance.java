class Inheritance{
    public static void main(String args[]){
        Student s=new Student();
        s.student();   //single level inheritance
    }
}
class College{  //parent class
    int no_of_students=1500;
    void student(){
        System.out.println("Total no. of students in college:"+no_of_students);
    }
    void branches(){
        System.out.println("Total branches: 10");
    }
}
class Student extends College{  //child class
    void CSF(){
        System.out.println("No. of students pursuing Cyber Security & Forensics:150");
    }
}
