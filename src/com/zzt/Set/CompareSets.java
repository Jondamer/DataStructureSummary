package com.zzt.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * 对比分析HashSet与LinkedHashSet的性能： 1.迭代访问的性能 2.插入元素的性能
 * 当集合元素为2000000时，HashSet与LinkedHashSet的迭代访问性能和元素插入的迭代性能对比分析：
 * HashSet的插入性能比LinkedHashSet要好，插入性能相差比较大 但是HashSet的迭代访问性能不如LinkedHashSet.
 * HashSet的插入性能表现：124 LinkedHashSet的插入性能表现：1703 HashSet的迭代访问的运行时间：20ms
 * LinkedHashSet的迭代访问的运行时间：15ms 迭代访问的差异时间是：-5
 * 
 * @author zhengzhentao
 *
 */
public class CompareSets {

	public CompareSets() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 对比分析HashSet与LinkedHashSet在迭代访问的性能
	 * 
	 * @param hs
	 * @param linkedhs
	 * @return 
	 */
	public static long compareInInterator(HashSet<Integer> hs, LinkedHashSet<Integer> linkedhs) {
		// 迭代访问HashSet
		Iterator iterator = hs.iterator();
		long startTime = System.currentTimeMillis(); // 获取开始时间
		while (iterator.hasNext()) {
			Integer i = (Integer) iterator.next();
		}
		long endTime = System.currentTimeMillis(); // 获取结束时间

		// 迭代访问LinkedHashSet
		long startTime2 = System.currentTimeMillis(); // 获取开始时间
		Iterator iterator2 = linkedhs.iterator();
		while (iterator2.hasNext()) {
			Integer i = (Integer) iterator2.next();
		}
		long endTime2 = System.currentTimeMillis(); // 获取结束时间
		System.out.println("HashSet的迭代访问的运行时间：" + (endTime - startTime) + "ms"); // 输出程序运行时间
		System.out.println("LinkedHashSet的迭代访问的运行时间：" + (endTime2 - startTime2) + "ms"); // 输出程序运行时间
		long time = (endTime2 - startTime2) - (endTime - startTime);
		return time;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();
		LinkedHashSet<Integer> linkedhs = new LinkedHashSet<>();
		long startTime1 = System.currentTimeMillis(); // 获取开始时间
		for (int i = 0; i < 2000000; i++) {
			hs.add(i);
		}
		long endTime1 = System.currentTimeMillis(); // 获取结束时间
		long time1 = endTime1 - startTime1;
		System.out.println("HashSet的插入性能表现：" + time1);

		long startTime2 = System.currentTimeMillis(); // 获取开始时间
		for (int i = 0; i < 2000000; i++) {
			linkedhs.add(i);
		}
		long endTime2 = System.currentTimeMillis(); // 获取结束时间
		long time2 = endTime2 - startTime2;
		System.out.println("LinkedHashSet的插入性能表现：" + time2);

		long time = compareInInterator(hs, linkedhs);
		System.out.println("迭代访问的差异时间是：" + time);

	}

}
