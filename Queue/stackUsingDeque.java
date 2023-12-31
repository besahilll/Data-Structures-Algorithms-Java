import java.util.*;
class stackUsingDeque{
    static class stack{
        static Deque<Integer> d=new LinkedList<Integer>();

        public static void push(int data){
            d.addLast(data);
        }

        public static int pop(){
            return d.removeLast();
        }

        public static int peek(){
            return d.getLast();
        }
    }

    public static void main(String[] args){
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
