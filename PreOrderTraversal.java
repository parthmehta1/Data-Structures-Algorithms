package java2Blog;
import java2Blog.TreeNode;
public class PreOrderTraversal {

	public void preOrder(TreeNode root){
		if(root!=null){
			System.out.println(root.value);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public static TreeNode createTree(){
		TreeNode rootNode = new TreeNode(40);
		TreeNode node20=new TreeNode(20);  
		TreeNode node10=new TreeNode(10);  
		TreeNode node30=new TreeNode(30);  
		TreeNode node60=new TreeNode(60);  
		TreeNode node50=new TreeNode(50);  
		TreeNode node70=new TreeNode(70);  
		rootNode.left = node20;
		rootNode.right = node60;
		node20.left = node10;
		node20.right = node30;
		node60.left = node50;
		node60.right = node70;
		return rootNode;
	}

	public static void main(String[] args) {
		PreOrderTraversal pot = new PreOrderTraversal();
		TreeNode rootNode = createTree();
		pot.preOrder(rootNode);
		pot.createTree();
		
	}

}
