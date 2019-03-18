package com.zzt.CollectionsLearning;

import java.util.TreeMap;
import java.util.Map.Entry;
/**
 * TreeMap 自动按照键的值进行排序
 * @author zhengzhentao
 *
 */
public class TreeMapDemo {

	public TreeMapDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Integer> treeMap =new TreeMap<>();
		treeMap.put(5, 5);
		treeMap.put(1, 1);	
		treeMap.put(2, 2);
		treeMap.put(3, 3);
		treeMap.put(4, 4);
//		遍历treeMap
		System.out.println(treeMap);
		System.out.println("键值对的数目是:"+treeMap.size());
		System.out.println("排序前输出结果：");	
		for(Entry<Integer, Integer> entry : treeMap.entrySet()) {
		    System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		treeMap.descendingKeySet();  // 进行排序

		System.out.println("排序后输出结果：");	
		for(Entry<Integer, Integer> entry : treeMap.entrySet()) {
		    System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
