class Constructor_overloading{
    public static void main(String args[]){
        Cricket c=new Cricket(11);   //Constructor Overloading
        Cricket c1= new Cricket();
    }   
}
class Cricket{
    int no_of_players;
    Cricket(int players){
        System.out.println("No. of players:"+players);
    }
    Cricket(){
        System.out.println("In 2011, India won the World cup");  
    }
}
