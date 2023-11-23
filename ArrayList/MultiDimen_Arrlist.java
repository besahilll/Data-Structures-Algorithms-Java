import java.util.*;
class MultiDimen_Arrlist{
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
        ArrayList<Integer> list3=new ArrayList<Integer>();

        for(int i=1; i<6;i++){
            list.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainlist.add(list);
        mainlist.add(list2);
        mainlist.add(list3);

        System.out.println(mainlist);

    }
}
