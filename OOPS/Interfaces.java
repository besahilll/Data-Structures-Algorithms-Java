class Interfaces{
    public static void main(String[] args){
        C ob=new C();
        ob.walks();
    }
}
interface A{
    final String Food="Veg";
    void eats();
}

interface B{
    void walks();
} 
class C implements A,B{//Multiple inheritance
    public void eats(){
        System.out.println("eats grass");
    }
    public void walks(){
        System.out.println("Walks on 4 legs");
    }
}
