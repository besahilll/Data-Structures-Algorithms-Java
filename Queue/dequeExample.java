import java.util.*;
class dequeExample{
    public static void main(String[] args){
        Deque<Integer> d=new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2); //2 1
        d.addLast(3);// 2 1 3
        d.addLast(4);// 2 1 3 4
        d.removeFirst(); 
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
        System.out.println("First ele:" + d.getFirst());
        System.out.println("Last ele:" + d.getLast());
    }
}
