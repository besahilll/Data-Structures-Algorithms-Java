class Merge_Sort{
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

    public Node Merge(Node head1, Node head2){
        Node mergedLL=new Node(-1); 
        Node temp=mergedLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        //leftover left part
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        //leftover right part
        while(head2!=null){
          temp.next=head2;
          head2=head2.next;
          temp=temp.next;  
        }

        return mergedLL.next;
    }

    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; //Mid
    }

    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid=getMid(head);
        //left & right MS
        Node rightHead= mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head); //Sorted left part
        Node newRight=mergeSort(rightHead); //Sorted right part

        //Merge Sort
        return Merge(newLeft, newRight);

    }

    public static void main(String[] args){
        Merge_Sort ms=new Merge_Sort();
        ms.addFirst(1);
        ms.addFirst(2);
        ms.addFirst(3);
        ms.addFirst(4);
        ms.addFirst(5);
        ms.print();
        ms.head=ms.mergeSort(ms.head);
        ms.print();
    }
}
