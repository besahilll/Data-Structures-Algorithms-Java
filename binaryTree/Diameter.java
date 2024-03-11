import java.util.*;
class Diameter{
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

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftSubtree=height(root.left);
        int rightSubtree=height(root.right);

        return Math.max(leftSubtree, rightSubtree) + 1;
    }

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3=height(root.left)+height(root.right)+1;

        return Math.max(diam3, Math.max(diam1,diam2));
    }
    public static void main(String args[]){
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree myTree=new BinaryTree();
        Node root=myTree.BuildTree(nodes);
        System.out.println(diameter(root));
    }
}