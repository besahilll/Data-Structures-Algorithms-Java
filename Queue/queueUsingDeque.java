import java.util.*;
class queueUsingDeque{
    static class Queue{
        static Deque<Integer> d=new LinkedList<Integer>();

        public static void add(int data){
            d.addLast(data);
        }

        public static int remove(){
            return d.removeFirst();
        }

        public static int peek(){
            return d.getFirst();
        }
    }

    public static void main(String[] args){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
