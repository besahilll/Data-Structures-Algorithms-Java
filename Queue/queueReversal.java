import java.util.*;
class queueReversal{
    public static void Reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<Integer>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Reverse(q);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
