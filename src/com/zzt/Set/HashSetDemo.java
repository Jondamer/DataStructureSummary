package com.zzt.Set;

import java.util.HashSet;

/**
 * java 容器类hashset的使用
 * 1.集合中的元素不能重复
 * 2.集合中的元素可以是null,但是只保留一个null.
 * 3.集合中的元素的顺序不能保证
 * @author zhengzhentao
 *
 */
public class HashSetDemo {

	public HashSetDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> hs=new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(3);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(null);
		hs.add(null);
		System.out.println(hs.size());
		System.out.println(hs.toString());
		HashSet <String> hs2=new HashSet<>();
		hs2.add("NY");
		hs2.add("beijing");
		hs2.add("hello,shanghai");
		hs2.add("hangzhou");
		System.out.println(hs2.toString());
	}

}
