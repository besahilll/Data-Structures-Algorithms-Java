class Abstraction {
    public static void main(String[] args){
        Horse h=new Horse();
        System.out.println(h.color);
        h.walks();
    }
}
abstract class Animal{  //abstract class
    String color;
    Animal(){
        color="brown";
    }
    abstract void walks();  //abstract function
}

class Horse extends Animal{
    void changecolor(){
        color="dark brown";
    }
    void walks(){ 
        System.out.println("Walks on 4 legs");
    }
}
