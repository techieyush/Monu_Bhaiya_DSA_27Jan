package Lec_46;

public class Diameter_of_Binary_Tree_Opt {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).dt;
		}

		public DiaPair diameter(TreeNode root) {
			if (root == null) {
				return new DiaPair();
			}

			DiaPair ldp = diameter(root.left);// (d,h)
			DiaPair rdp = diameter(root.right);// (d,h)
			DiaPair sdp = new DiaPair();
			int sd = ldp.ht + rdp.ht + 2;
			sdp.dt = Math.max(sd, Math.max(ldp.dt, rdp.dt));
			sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
			return sdp;

		}

		class DiaPair {
			int dt = 0;
			int ht = -1;
		}
	}

}
