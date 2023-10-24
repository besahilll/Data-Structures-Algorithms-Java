class Method_Overriding{
    public static void main(String args[]){
        Tiger t=new Tiger();
        t.eats();  //Method Overriding
    }
}
class Animal{
    void eats(){
        System.out.println("Eats Anything");
    }
}
class Tiger extends Animal{
    void eats(){   
        System.out.println("Eats Animals");  
    }
}
