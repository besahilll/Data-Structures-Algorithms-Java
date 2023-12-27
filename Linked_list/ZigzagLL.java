class zigzagLL{
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

  public Node findMidNode(Node head){
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;
    }

  public void zigzag(){
        Node mid =findMidNode(head);
        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            right=nextR;
            left=nextL;
        }
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
        zigzagLL zz=new zigzagLL();
        zz.addFirst(1);
        zz.addFirst(2);
        zz.addFirst(3);
        zz.addFirst(4);
        zz.addFirst(5);
        zz.print();
        zz.zigzag();
        System.out.println("Printing zigzag Linkedlist");
        zz.print();
    }
}
