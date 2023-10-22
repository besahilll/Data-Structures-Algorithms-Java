class Getter_setter{
    public static void main(String[] args){
        college c=new college();
        c.setName("UPES");
        System.out.println(c.getName());
        c.setRank(47);
        System.out.println(c.getRank());
    }
}
class college{
    private String name;
    private int rank;

    //setters
    void setName(String name){
        this.name = name;
    }
    void setRank(int rank){
        this.rank = rank;
    }
    //getters
    String getName(){
        return this.name;
    }
    int getRank(){
        return this.rank;
    }
}
