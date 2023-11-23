import java.util.*;
class reverse{
    public static void main(String args[]){ 
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(10);
        list.add(9);
        list.add(7);
        System.out.println(list);
        System.out.println("Print list in reverse order");
        for(int i=list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }
    }
}
