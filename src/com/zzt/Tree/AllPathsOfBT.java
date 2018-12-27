package com.zzt.Tree;

/**
 * 保存二叉树所有的路径，路径定义是从根节点到叶节点
 */
import java.util.ArrayList;

public class AllPathsOfBT {

	public AllPathsOfBT() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个树
		TreeNode root = new TreeNode(1);
		TreeNode A = new TreeNode(3);
		TreeNode B = new TreeNode(4);
		TreeNode A_L = new TreeNode(5);
		TreeNode A_R = new TreeNode(6);
		TreeNode B_L = new TreeNode(7);
		TreeNode B_R = new TreeNode(8);
		root.left = A;
		root.right = B;
		A.left = A_L;
		A.right = A_R;
		B.left = B_L;
		B.right = B_R;
	}

}
