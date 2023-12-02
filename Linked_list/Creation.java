class Creation{
    class Node{
        int data;
        Node next;
        public Node(int data){   //parametrized constructor
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){   //adding node in the start
        Node newNode=new Node(data);   //node creation
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){ //adding node in the end
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void addMiddle(int data,int idx){ //adding node in the middle
        if(idx==0){
            addFirst(data);
            return;
        }
        Node temp=head;
        int i=0;
        Node newNode=new Node(data);
        size++;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void removeFirst(){ 
        head=head.next;
        if(size==1){
            head=tail=null;
        }
        size--;
    }

    public void removeLast(){ 
        if(size==0){
            System.out.println("Linkedlist is empty");
        } else if(size==1){
            head=tail=null;
            size=0;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        prev.next=null;
        tail=prev;
        size--;
    }

    public void print(){
        if(head==null){
            System.out.println("linkedlist is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args){
        Creation cr=new Creation();
        cr.addFirst(2);
        cr.addFirst(1);
        cr.addLast(3);
        cr.addLast(4);
        cr.addMiddle(5,4);
        cr.print(); //1->2->3->4->5->null
        cr.removeFirst();
        cr.print();
        cr.removeLast();
        cr.print();
        System.out.println(cr.size);
    }
}
