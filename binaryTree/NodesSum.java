class NodesSum{
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
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
            Node newNode= new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);

            return newNode;
        }
    }
    public static int sum(Node root){  //sum of nodes
        if(root==null){
            return 0;
        }
        int leftSubtree=sum(root.left);
        int rightSubtree=sum(root.right);
        
        return leftSubtree + rightSubtree + root.data;
    }

    public static void main(String[] args){
        int[] nodes={1,2,3,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree myTree=new BinaryTree();
        Node root=myTree.BuildTree(nodes);
        System.out.println(sum(root));
    }
}