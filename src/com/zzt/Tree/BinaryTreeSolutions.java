package com.zzt.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 总结整理二叉树的各种操作
 * 
 * @author zhengzhentao
 *
 */

public class BinaryTreeSolutions {

	public BinaryTreeSolutions() {
		// TODO Auto-generated constructor stub
	}

	// 定义二叉树的层次遍历的方法
	static ArrayList<Integer> levelOrder(TreeNode root) {
		// 定义一个队列
		ArrayList<Integer> al = new ArrayList<>();
		if (root == null)
			return null;
		Queue<TreeNode> q = new ArrayDeque<TreeNode>();
		q.add(root);
		TreeNode cur;
		while (!q.isEmpty()) {
			cur = q.peek();
			al.add(cur.val);
			System.out.print(cur.val + " ");
			if (cur.left != null)
				q.add(cur.left);
			if (cur.right != null)
				q.add(cur.right);
			q.poll();
		}
		return al;

	}

	// 定义二叉树的层次遍历的方法2.ArrayList<Integer>保存每层的二叉树节点
	static ArrayList<ArrayList<Integer>> levelOrder2(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (pRoot == null) {
			return result;
		}
		Queue<TreeNode> layer = new LinkedList<TreeNode>();
		ArrayList<Integer> layerList = new ArrayList<Integer>();
		layer.add(pRoot);
		int start = 0, end = 1;
		while (!layer.isEmpty()) {
			TreeNode cur = layer.remove();
			layerList.add(cur.val);
			start++;
			if (cur.left != null) {
				layer.add(cur.left);
			}
			if (cur.right != null) {
				layer.add(cur.right);
			}
			if (start == end) {
				end = layer.size();
				start = 0;
				result.add(layerList);
				layerList = new ArrayList<Integer>();
			}
		}
		return result;

	}

	/**
	 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的
	 * 
	 * 顺序打印，其他行以此类推。
	 * 
	 * @param root
	 */

	public static ArrayList<ArrayList<Integer>> PrintTree(TreeNode pRoot) {

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (pRoot == null) {
			return result;
		}
		Queue<TreeNode> layer = new LinkedList<TreeNode>();
		ArrayList<Integer> layerList = new ArrayList<Integer>();
		layer.add(pRoot);
		int start = 0, end = 1;
		while (!layer.isEmpty()) {
			TreeNode cur = layer.remove();
			layerList.add(cur.val);
			start++;
			if (cur.left != null) {
				layer.add(cur.left);
			}
			if (cur.right != null) {
				layer.add(cur.right);
			}

			if (start == end) {
				end = layer.size();
				start = 0;
				reverseList(layerList); // 偶数层逆序排列
				result.add(layerList);
				layerList = new ArrayList<Integer>();
			}

		}
		// 对result中的结果进行逆序排列
		for (int i = 0; i < result.size(); i++) {
			if ((i & 1) == 0) { // 偶数层进行逆序排列
				ArrayList<Integer> temp = result.get(i);
				// 调用逆序的方法
				reverseList(temp);
			}
		}
		return result;
	}

	// Arraylist中的元素逆序排序

	public static void reverseList(ArrayList<Integer> al) {

		// 临时数组
		int temp[] = new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			temp[i] = al.get(al.size() - 1 - i);
		}
		System.out.println("打印数组：");
		for (int i : temp) {
			System.out.print(i + "\t");
		}
		for (int j = 0; j < al.size(); j++) {
			al.set(j, temp[j]);
		}
		System.out.println("逆序后的链表：");
		// 逆序后的ArrayList
		for (Integer integer : al) {
			System.out.println(integer);
		}

	}

	// 前序遍历---递归版本
	static void preOrder(TreeNode root) {
		if (root != null) {
			System.out.println(root.val);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	// 中序遍历--递归版本
	static void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.val);
			inOrder(root.right);
		}
	}

	// 后序遍历--递归版本
	static void postOrder(TreeNode root) {
		if (root != null) {
			postOrder(root.right);
			postOrder(root.left);
			System.out.println(root.val);
		}

	}

	// 先序遍历二叉树，并把节点保存到ArrayList容器中
	static ArrayList<TreeNode> preOrder2(TreeNode pRoot) {
		ArrayList<TreeNode> result = new ArrayList<TreeNode>();
		if (pRoot == null) {
			return result;
		}
		if (pRoot != null) {
			result.add(pRoot);
			preOrder2(pRoot.left);
			preOrder2(pRoot.right);
		}
		return result;

	}

	// 求二叉树的镜像
	static TreeNode mirroOfBT(TreeNode root) {
		if (root == null)
			return null;
		// 声明一个临时交换的节点
		TreeNode temp = root.left;
		// 交换每个节点的左右孩子
		root.left = root.right;
		root.right = temp;
		mirroOfBT(root.left);
		mirroOfBT(root.right);
		return root;
	}
	// 判断两棵树是不是相同的

	static boolean isSameBT(TreeNode root1, TreeNode root2) {
		// 第一种情况是：两棵树都是空，则两棵树相同
		if (root1 == null && root2 == null)
			return true;

		// 第二种情况：一棵树为空，另一颗不为空个，则两棵树一定不相同
		if ((root1 == null && root2 != null) || (root1 != null && root2 == null))
			return false;
		if ((root1.val) != (root2.val))
			return false;
		// 第三种情况，两棵树都不为空
		return isSameBT(root1.left, root2.left) && isSameBT(root1.right, root2.right);

	}

	// 定义一个拷贝一颗二叉树的方法
	static TreeNode copyTree(TreeNode root) {
		if (root == null)
			return null;
		TreeNode t = new TreeNode(root.val);
		t.left = copyTree(root.left);
		t.right = copyTree(root.right);
		return t;
	}

	// 二叉树的深度
	int GetTreeDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = GetTreeDepth(root.left);
		int right = GetTreeDepth(root.right);
		return left >= right ? left + 1 : right + 1;

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

		ArrayList<Integer> aly = new ArrayList<>();
		aly.add(1);
		aly.add(2);
		aly.add(3);
		aly.add(4);
		reverseList(aly);
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
		// 再次创建一颗树 root2
		TreeNode root2 = new TreeNode(1);
		TreeNode A2 = new TreeNode(3);
		TreeNode B2 = new TreeNode(3);
		TreeNode A2_L = new TreeNode(6);
		TreeNode A2_R = new TreeNode(5);
		TreeNode B2_L = new TreeNode(5);
		TreeNode B2_R = new TreeNode(7);

		root2.left = A2;
		root2.right = B2;
		A2.left = A2_L;
		A2.right = A2_R;
		B2.left = B2_L;
		B2.right = B2_R;
		// 调用层次遍历的方法

		ArrayList<ArrayList<Integer>> als = new ArrayList<ArrayList<Integer>>();
		als = PrintTree(root);
		System.out.println("als的层数是：" + als.size() + "按照“之”字形状打印二叉树：");
		for (ArrayList<Integer> arrayList : als) {
			for (Integer integer : arrayList) {
				System.out.print(integer + "\t");
			}
			System.out.println();
		}

		System.out.println();

		ArrayList<Integer> al = levelOrder(root);
		System.out.println("层次遍历二叉树：");
		for (Integer integer : al) {
			System.out.print(integer + "\t");
		}
		System.out.println();
		// 调用前序遍历的方法
		// preOrder(root);
		// 调用中序遍历的方法
		// System.out.println("二叉树的中序遍历：");
		// inOrder(root);
		// 调用后序遍历的方法
		// postOrder(root);

		// 调用中序遍历的方法
		// System.out.println("二叉树的镜像的中序遍历");
		// 调用copy二叉树的方法
		TreeNode temproot = copyTree(root);
		System.out.println("调用求二叉树镜像的方法前，此时的原先的二叉树的中序遍历");
		System.out.println(temproot.val);
		System.out.println(temproot.left.val + "\t" + temproot.right.val);
		System.out.println(temproot.left.left.val + "\t" + temproot.left.right.val + "\t" + temproot.right.left.val
				+ "\t" + temproot.right.right.val);
		// 调用二叉树的镜像方法
		TreeNode mirrorTree = mirroOfBT(root);
		System.out.println("调用求二叉树镜像的方法后，此时的原先的二叉树的中序遍历");
		System.out.println(mirrorTree.val);
		System.out.println(mirrorTree.left.val + "\t" + mirrorTree.right.val);
		System.out.println(mirrorTree.left.left.val + "\t" + mirrorTree.left.right.val + "\t"
				+ mirrorTree.right.left.val + "\t" + mirrorTree.right.right.val);

		// 比较两棵树是不是相同
		Boolean b = isSameBT(temproot, mirrorTree); // 此时的root也编程了mirrorTree,怪不得一直是相等的
		System.out.println("is the same tree?----:" + b);

	}

}
