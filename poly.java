class poly{
    public static void main(String [] args){
        human human_one = new human();
        human mutant_one = new mutant();

        human_one.run();
        mutant_one.run();

    }
}

class human{
    int speed = 12;
    void run(){
        System.out.println("Human running at speed of "+speed+"kmph");
    }
}

class mutant extends human{
    int speed = 100;
    
    void run(){
        System.out.println("Mutant running at speed of "+speed+"kmph");
    }
}
