package com.zzt.Set;
/**
 * LinkedHashSet
 * 1.linkedHashSet保存元素的的顺序。
 * 2.LinkedHashSet在迭代访问Set中的全部元素时，性能比HashSet好，但是插入时性能稍微逊色于HashSet。
 * 
 */
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public LinkedHashSetDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedhs=new LinkedHashSet<>();
		linkedhs.add("ss");
		linkedhs.add("gg");
		linkedhs.add("ff");
		linkedhs.add("bb");
		linkedhs.add("cc");
		System.out.println(linkedhs.toString());

	}

}
