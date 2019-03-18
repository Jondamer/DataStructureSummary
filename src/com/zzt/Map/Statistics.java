package com.zzt.Map;

import java.util.HashMap;
import java.util.Random;
/**
 * 使用Map集合测试随机数生成类random的数据分布十分均匀
 * @author zhengzhentao
 *
 */
public class Statistics {

	public Statistics() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(45);
		HashMap<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < 10000; i++) {
			int r = rand.nextInt(10);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1 : freq + 1);
		}
		System.out.println(m);

	}

}
