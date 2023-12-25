class remove_nth_node{
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

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void deleteNthfromEnd(int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return;
        }
        
        Node prev=head;
        int i=1;
        int iToFind=size-n;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
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
        System.out.println("Null");
    }
    
    public static void main(String[] args){
        remove_nth_node it=new remove_nth_node();
        it.addFirst(5);
        it.addFirst(4);
        it.addFirst(3);
        it.addFirst(2);
        it.addFirst(1);
        it.print();
        it.deleteNthfromEnd(2);
        it.print();
    }
}
