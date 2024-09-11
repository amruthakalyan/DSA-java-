import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}
class binary{
    TreeNode root=null;
    void insert(int data) {
        root = insert(root, data);
    }

    TreeNode insert(TreeNode root,int val){
        if(root == null){
          root  = new TreeNode(val);
          return root;
        }
        if(val < root.val){
            root.left = insert(root.left, val);
        }
        if(val > root.val){
            root.right = insert(root.right, val);
        }
        return root;
     }
     void inOrder() {
        inOrderRec(root);
    }
     void inOrderRec(TreeNode root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.val + " ");
            inOrderRec(root.right);
        }
}



public void sum(){
    int sum = 0;
    Queue <TreeNode> queue = new LinkedList<>();
    if(root == null){
        return ;
    }
    queue.offer(root);
    while(!queue.isEmpty()){
        int levelSize = queue.size();
        TreeNode currentNode = queue.poll();
        sum +=currentNode.val;
        for(int i =0;i<levelSize;i++){
              if(currentNode.left !=null){
                queue.offer(currentNode.left);
              }
              if(currentNode.right !=null){
                queue.offer(currentNode.right);
              }
              
        }
        // currentNode = queue.poll();
    }
    System.out.println("\nSum of all nodes is:"+sum);
}

}

public class BinaryTree {
    public static void main(String[] args) {
        binary tree = new binary();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        // tree.insert(60);
        // tree.insert(80);
        
        System.out.println("In-order traversal:");
        tree.inOrder();

        tree.sum();
    }
}
