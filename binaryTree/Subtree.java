//whether the given tree is the subtree of sample tree
class Subtree{
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

    public static boolean isIdentical(Node root, Node subroot){
        if(root==null && subroot==null){
            return true;
        }
        if(root==null || subroot==null){
            return false;
        }
        if(root.data==subroot.data){
        return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        }
        
        return false;
    }
    public static boolean isSubtree(Node root, Node subroot){
        if(subroot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static void main(String args[]){
        int[] nodes={3,4,5,1,2,-1,-1,-1,-1,0};
        int[] nodes2={4,1,2};
        BinaryTree myTree=new BinaryTree();
        Node root=myTree.BuildTree(nodes);
        Node subroot=myTree.BuildTree(nodes2);
        System.out.println(isSubtree(root,subroot));
    }
}