import java.util.*;
class DiameterTree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node BuildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);

            return newNode;
        }
    }
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }

    public static TreeInfo diameter2(Node root){

        if(root==null){
            return new TreeInfo(0, 0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);
        int myHeight=Math.max(left.ht,right.ht) + 1;
        
        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht + right.ht +1;

        int mydiam=Math.max(Math.max(diam1,diam2),diam3);

        TreeInfo myInfo=new TreeInfo(myHeight, mydiam);

        return myInfo;

    }
    public static void main(String args[]){
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree myTree=new BinaryTree();
        Node root=myTree.BuildTree(nodes);
        System.out.println(diameter2(root).diam);
    }

}