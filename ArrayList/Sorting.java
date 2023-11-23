import java.util.*;
class Sorting{
    public static void Sorting(ArrayList<Integer> list){
        Collections.sort(list); //ascending order
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());  //descending order
        System.out.println(list);
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(10);
        list.add(9);
        list.add(7);
        Sorting(list);
    }
}
