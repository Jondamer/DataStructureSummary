package com.zzt.CollectionsLearning;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo2 {

	public PriorityQueueDemo2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 优先队列自然排序示例
		Queue<Integer> integerPriorityQueue = new PriorityQueue<>(7);
		integerPriorityQueue.add(1);	
		integerPriorityQueue.add(3);
		integerPriorityQueue.add(5);
		integerPriorityQueue.add(2);
		integerPriorityQueue.add(6);
		for (int i = 0; i < integerPriorityQueue.size(); i++) {
			Integer in = integerPriorityQueue.poll();
			System.out.println("Processing Integer:" + in);
		}

		
	}

}
