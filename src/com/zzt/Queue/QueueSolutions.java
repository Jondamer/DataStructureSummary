package com.zzt.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Java 库函数 队列
 * 
 * @author zhengzhentao
 *
 */
public class QueueSolutions {

	public QueueSolutions() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(1);// 添加队列元素
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println("队列q的长度:" + q.size());
		// 队列的第一个元素是
		System.out.println(q.peek()); //队列第一个元素
		System.out.println("遍历队列元素，队列元素不会减少");
		// 遍历队列元素方法一
		for (Integer integer : q) {
			System.out.println(integer);
		}
		System.out.println("队列q的长度:" + q.size());
		// 遍历队列元素方法2
		while (q.peek() != null) {
			System.out.println(q.poll());
		}
		System.out.println("队列q的长度:" + q.size());
	}

}
