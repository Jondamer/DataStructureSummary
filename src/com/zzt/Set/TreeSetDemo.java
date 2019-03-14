package com.zzt.Set;

import java.util.TreeSet;

/**
 * java 容器类TreeSet的使用
 * 1.Set的基本属性，元素不能重复
 * 2.TreeSet的值是自动排序的，TreeSet支持两种排序方式，自然排序 和定制排序，其中自然排序为默认的排序方式。
 * 3.TreeSet的值不能是null
 * @author zhengzhentao
 *
 */
public class TreeSetDemo {

	public TreeSetDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeSet <String> treeSet =new TreeSet<>();
       treeSet.add("beijing");
       treeSet.add("Apple City");
       treeSet.add("chile");
       treeSet.add("desiney");
       treeSet.add("desiney");
//       treeSet.add(null);  添加的集合对象不能为null，因为没法对null值进行排序
       System.out.println(treeSet.toString());
       TreeSet <Integer> treeSet2 =new TreeSet<>();
       treeSet2.add(5);
       treeSet2.add(9);
       treeSet2.add(1);
       treeSet2.add(-12);
//       treeSet2.add(null);
       System.out.println(treeSet2.toString());
	}

}
