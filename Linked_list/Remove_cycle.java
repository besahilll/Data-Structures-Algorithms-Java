class Remove_cycle{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static boolean detect_cycle(Node head){
        Node slow=head;
        Node fast=head; 
        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
            if(slow==fast){ //cycle
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        //Detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next; 
            fast=fast.next; 
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next; 
        }
        //remove cycle
        prev.next=null;
    }

    public static void main(String[] args){
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next=temp;
        //1->2->3->2 
        System.out.println(detect_cycle(head));
        removeCycle(); //Cycle removed
        System.out.println(detect_cycle(head));

    }
}
