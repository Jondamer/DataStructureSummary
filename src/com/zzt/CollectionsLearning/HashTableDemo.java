package com.zzt.CollectionsLearning;
/**
 * hashTable容器中保存的键值对是有序的，key和value不能为空值
 */

import java.util.*;
import java.util.Map.Entry;

public class HashTableDemo {

	public HashTableDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> hashTable = new Hashtable<>();
		hashTable.put(1, 1);
		hashTable.put(2, 1);
		hashTable.put(6, 6);
		hashTable.put(5, 1);
		hashTable.put(4, 1);
		hashTable.put(3, 1);
		System.out.println(hashTable);
		System.out.println("键值对的数目是:" + hashTable.size());

		for (Entry<Integer, Integer> entry : hashTable.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

}
