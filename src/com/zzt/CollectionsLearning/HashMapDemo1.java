package com.zzt.CollectionsLearning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * HashMap知识点总结 
 * HashMap 是无序的，并且是线程不安全的。如果更新图时不需要保持图中元素的顺序，就使用HashMap，
 * 如果需要保持图中元素的插入顺序或者访问顺序，就使用LinkedHashMap，
 * 如果需要使图按照键值排序，就使用TreeMap。
 * @author zhengzhentao
 *
 */
public class HashMapDemo1 {

	public HashMapDemo1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "hellopppppp");
		hm.put(null, null);
		hm.put(3, "world!");
		hm.put(5, "fighting");

		System.out.println(hm);
		System.out.println("键值对的数目是:"+hm.size());
	
		for(Entry<Integer, String> entry : hm.entrySet()) {
		    System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		  //第一种：普遍使用，二次取值
	      System.out.println("通过Map.keySet遍历key和value：");
	      for (Integer key : hm.keySet()) {
	       System.out.println("key= "+ key + " and value= " + hm.get(key));
	      }
	      
	      
	      
	      System.out.println("*********************************************");
			int[] array = { 1, 2, 3, 2, 2, 2, 5,5,5, 4 };  
	   // 使用hashMap来保存数组中的元素，其中map的key是 数组的元素，value 是key出现的次数
			HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
			int key, value = 1;
			// 遍历数组元素并添加到map中
			for (int i = 0; i < array.length; i++) {
				key = array[i];
				if (map.containsKey(key)) {
					System.out.println("this key  is  :"+key);
					value = map.get(key) + 1;
					map.put(key, value);
				} else {
					value=1;
					map.put(key, value);
				}
			}
			// 遍历map
			// 第一种：普遍使用，二次取值
			System.out.println("通过Map.keySet遍历key和value：");
			for (Integer key1 : map.keySet()) {
				System.out.println("key= " + key1 + " and value= " + map.get(key1));
			}
	      
	}	
	
	
	

}
