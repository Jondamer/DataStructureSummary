package com.zzt.CollectionsLearning;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo1 {

	public LinkedHashMapDemo1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(1, "hellopppppp");
		lhm.put(7, "jiayou"); 
		lhm.put(7, "hahhahhah"); //会覆盖相同的key值
		lhm.put(null, null);
		lhm.put(null, null); // 可以出现多次空值键对，但是只保存最后一次的结果
		lhm.put(4, "world!");
		lhm.put(5, "fighting");
		lhm.put(6, null);

		


		System.out.println(lhm);
		System.out.println("键值对的数目是:"+lhm.size());
		
		
		for(Entry<Integer, String> entry : lhm.entrySet()) {
		    System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
