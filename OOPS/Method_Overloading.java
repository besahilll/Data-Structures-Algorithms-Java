class Method_Overloading{
    public static void main(String args[]){
        Calculator c= new Calculator();
        c.sum(4,8);
        c.sum(5,7.5);
    }
}
class Calculator{
    //Multiple fuctions with the same name
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(double a, double b, double c){
        System.out.println(a+b+c);
    }
    void sum(int a, double b){
        System.out.println(a+b);
    }
}
