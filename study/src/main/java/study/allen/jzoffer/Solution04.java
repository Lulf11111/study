package study.allen.jzoffer;

/**
 * 【重建二叉树】输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2
 * ,4,7,3, 5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * 
 * @author lulf
 * @date 2019年1月18日
 */
public class Solution04 {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		int prestart = 0;
		int preend = pre.length - 1;
		int instart = 0;
		int inend = in.length - 1;
		return rebuild(pre, prestart, preend, in, instart, inend);
	}

	public TreeNode rebuild(int[] pre, int prestart, int preend, int[] in, int instart, int inend) {
		if (prestart > preend || instart > inend) {
			return null;
		}
		TreeNode treenode = new TreeNode(pre[prestart]);
		for (int i = instart; i <= inend; i++) {
			if (in[i] == treenode.val) {
				treenode.left = rebuild(pre, prestart + 1, prestart + i - instart, in, instart, i - 1);
				treenode.right = rebuild(pre, prestart + i - instart + 1, preend, in, i + 1, inend);
			}

		}
		return treenode;
	}
}
