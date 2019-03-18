package com.zzt.CollectionsLearning;

/**
 * 使用自定义的类作为Hashmap的key时，用户需要重写hashCode方法和equals方法
 * 重写hashCode方法时或者重写equals方法时候，是针对自定义类的某一个属性设置的，比如重写的时候按照 id 属性字段，hashCode和equals方法重写的时候都是根据id属性字段来进行重写的。
 * 当然也可以同时使用两个属性字段来进行重写equals方法和hashCode方法
 */
import java.util.HashMap;
import java.util.Map.Entry;

class Person {
	String name;
	String id;

	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return "id=" + id + ",name=" + name;
	}
	// 重写hashCode方法
	public int hashCode() {
		return (name + id).hashCode();
	}
	// 重写equals方法
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		if (p.name.equals(this.name) && p.id.equals(this.id))
			return true;
		else
			return false;

	}


}

public class HashMapDemo2 {

	public static void test() {
		System.out.println("使用相同的值作为key");
		Person p1 = new Person("xiaoming", "1");
		Person p2 = new Person("xiaoming", "1");
		Person p3 = new Person("xiaohong", "3");

		HashMap<Person, String> map1 = new HashMap<>();
		map1.put(p1, "name1");
		map1.put(p2, "name2");
		map1.put(p3, "name3");

		if (map1.containsKey(p3)) {
			map1.put(p3, "testtst");
		}

		for (Entry<Person, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}

}
