class Reverse_list{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void reverse(){  //reversing the linked list
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
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

    public static void main(String[] args){
        Reverse_list rl= new Reverse_list();
        rl.addFirst(5);
        rl.addFirst(4);
        rl.addFirst(3);
        rl.addFirst(2);
        rl.addFirst(1);
        rl.print();
        System.out.println("Reversing the linked list:");
        rl.reverse();
        rl.print();

    }
}
