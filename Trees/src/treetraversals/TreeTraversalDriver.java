package treetraversals;

public class TreeTraversalDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root=new TreeNode(23);
		TreeNode left=new TreeNode(20);
		TreeNode right=new TreeNode(27);
		TreeNode leftleft=new TreeNode(18);
		TreeNode leftright=new TreeNode(22);
		TreeNode rightleft=new TreeNode(26);
		TreeNode rightright=new TreeNode(29);
		TreeNode leftleftleft=new TreeNode(16);
		
		//linking root and subtrees
		root.leftlink=left; root.rightlink=right;
		left.leftlink=leftleft; left.rightlink=leftright;
		right.leftlink=rightleft; right.rightlink=rightright;
		leftleft.leftlink=leftleftleft;
		
		inorder(root);
		
	}
	
	public static void inorder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.leftlink);
		System.out.print(" "+root.val+" ");
		inorder(root.rightlink);
	}

}
