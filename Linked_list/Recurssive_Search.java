class Recurssive_Search{
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

    public int Recurssive_Search(Node head, int key){
        if(head==null){   
            return -1;
        }
        if(head.data==key){ //base condition
            return 0;
        }
        int idx=Recurssive_Search(head.next,key);   
        if(idx==-1){
            return -1;
        }
        
        return idx+1;
    }

    public static void main(String[] args){
        Recurssive_Search rs=new Recurssive_Search();
        rs.addFirst(5);
        rs.addFirst(4);
        rs.addFirst(3);
        rs.addFirst(2);
        rs.addFirst(1);
        rs.print();
        System.out.println("key found at index: "+ rs.Recurssive_Search(head,2));
    }
}
