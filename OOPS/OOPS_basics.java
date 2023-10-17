class OOPS{      //OOPS is  class(gorup of entities or objects)
    public static void main(String[] args){
        Pen p1=new Pen();   //Object declaration
        p1.color();
        p1.setTip(5);
        System.out.println(p1.Tip);
    }
}

class Pen{
    int Tip;
    String colour="Blue";
    public void color(){
        System.out.println("Colour of the pen is:" +colour);
    }
    void setTip(int newTip){
    Tip=newTip;
    }
}
