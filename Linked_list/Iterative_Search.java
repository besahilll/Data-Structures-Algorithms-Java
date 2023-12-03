//Search for a key in a linked list. Return the position where it is found. If not found, return -1

class Iterative_Search{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("Linkedlist is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int iterative_search(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i; //key found
            }
            temp=temp.next;
            i++;
        }
        return -1; //key not found
    }

    public static void main(String[] args){
        Iterative_Search it=new Iterative_Search();
        it.addFirst(5);
        it.addFirst(4);
        it.addFirst(3);
        it.addFirst(2);
        it.addFirst(1);
        it.print();
        System.out.println("key found at index: "+ it.iterative_search(3));
    }
}
