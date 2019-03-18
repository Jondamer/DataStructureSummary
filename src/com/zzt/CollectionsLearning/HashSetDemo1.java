package com.zzt.CollectionsLearning;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet的学习使用
 * hashSet的使用场景
 * HashSet 的应用场景
排重：如果对排重后的元素没有顺序要求，则 HashSet 可以方便地用于排除重复数据。
保存特殊值：Set 可以用于保存各种特殊值，程序处理用户请求或数据记录时，根据是否为特殊值判断是否进行特殊处理，比如保存IP地址的黑名单或白名单。
集合运算：使用 Set 可以方便地进行数学集合中的运算，如交集、并集等运算，这些运算有一些很现实的意义。
比如，用户标签计算，每个用户都有一些标签，两个用户的标签交集就表示他们的共同特征，交集大小除以并集大小可以表示他们的相似程度。
 * @author zhengzhentao
 *
 */

public class HashSetDemo1 {

	public HashSetDemo1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();
		// 添加元素
		hs.add(null); // 
		hs.add(null);
		hs.add(1);
		hs.add(2);
		hs.add(2);
		hs.add(3);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		// 遍历元素
		for (Integer integer : hs) {
			System.out.println(integer);
		}
		boolean b = hs.contains(2);
		System.out.println(b);
		// 删除某个元素
		hs.remove(2);
		// 遍历元素
		for (Integer integer : hs) {
			System.out.println(integer);
		}	
		int  n = hs.size();
		System.out.println("集合中元素的数目是:"+n);
//		使用Iterator迭代器循环遍历hashSet中元素
		Iterator iterator = hs.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());			
		}
		
//		转变成数组
//	System.out.println("转变成数组"+hs.toArray().toString());	
	
	 Object[] array =  hs.toArray();
	 System.out.println("转变成数组后的长度是："+array.length);
	 
	 
	 
	}

}
