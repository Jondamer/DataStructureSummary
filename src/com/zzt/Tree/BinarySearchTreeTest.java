package com.zzt.Tree;

import java.util.ArrayList;

/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8） 中，按结点数值大小顺序第三小结点的值为4。
 * 
 * @author zhengzhentao
 *
 */
public class BinarySearchTreeTest {

	int index = 0; // 计数器

	TreeNode KthNode2(TreeNode root, int k) {  // 方法一
		if (root != null) { // 中序遍历寻找第k个
			TreeNode node = KthNode(root.left, k);
			if (node != null)
				return node;
			index++;
			if (index == k)
				return root;
			node = KthNode(root.right, k);
			if (node != null)
				return node;
		}
		return null;
	}

	// 中序遍历二叉树，并保存到列表中
	static ArrayList<TreeNode> al = new ArrayList<>();

	static TreeNode KthNode(TreeNode pRoot, int k) { // 方法二
		// 考虑二叉搜索树为空的情况
		if (pRoot == null)
			return pRoot;
		if (k == 0)
			return null;
		int size = GetTeeNodeNumbers(pRoot);
		if (k > size)
			return null;
		// 调用中序遍历二叉树的方法
		inOrder(pRoot);
		TreeNode KthNode = al.get(k - 1);
		System.out.println(KthNode.val + "-----");
		return KthNode;
	}

	static void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			al.add(root);
			inOrder(root.right);
		}

	}

	// 二叉树的结点数目
	static int GetTeeNodeNumbers(TreeNode root) {
		int num = 0;
		if (root == null) {
			return 0;
		}
		return GetTeeNodeNumbers(root.left) + GetTeeNodeNumbers(root.right) + 1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个树
		TreeNode root = new TreeNode(5);
		TreeNode A = new TreeNode(4);
		TreeNode A1 = new TreeNode(3);
		TreeNode A2 = new TreeNode(2);
		TreeNode A3 = new TreeNode(1);

		TreeNode B = new TreeNode(7);
		TreeNode A_L = new TreeNode(2);
		TreeNode A_R = new TreeNode(4);
		TreeNode B_L = new TreeNode(6);
		TreeNode B_R = new TreeNode(8);
		root.left = A;
		// root.right = B;
		// A.left = A_L;
		// A.right = A_R;
		// B.left = B_L;
		// B.right = B_R;
		A.left = A1;
		A1.left = A2;
		A2.left = A3;

		// 调用中序遍历
		// inOrder(root);
		TreeNode kthN = KthNode(root, 2);
	}

}
