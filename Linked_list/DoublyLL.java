class DoublyLL{
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
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
        head.prev=newNode;
        head=newNode;
    }

    public int removeFirst(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    public int removeLast(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=tail.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }

    public void print(){
        if(head==null){
            System.out.println("Linkedlist is empty");
        }
        Node temp=head;
        System.out.print("null<->");
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        DoublyLL ll=new DoublyLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.removeFirst());
        ll.print();
        System.out.println(ll.size);
    }
}
