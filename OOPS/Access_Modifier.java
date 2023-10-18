public class Access_Modifier{   //public class
    public static void main(String[] args){  
        Student s=new Student();
        s.name();
        System.out.println("Age of the student is:"+s.age);
    }
}

class Student{
    public void name(){
        System.out.println("Name of the student is Sahil");
    }
    private int age=20;  //private access modifier-> only allowed to acess within class
}

