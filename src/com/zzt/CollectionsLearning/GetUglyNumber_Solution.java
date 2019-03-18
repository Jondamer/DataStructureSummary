package com.zzt.CollectionsLearning;

/**
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * 
 * @author zhengzhentao
 *
 */
public class GetUglyNumber_Solution {

	public GetUglyNumber_Solution() {
		// TODO Auto-generated constructor stub
	}

	public static int GetUglyNumber_Solution(int index) {
		int number = 1;
		int i = 1;
		while (i<index) {	
		    number++;
			if(isUglyNumber(number)){
			i++;
			}
			if (i == index) {
				return number;
			}
		}
		return number;
	}

	static boolean isUglyNumber(int n) {
		while (n % 2 == 0) 
			n = n / 2;
		while (n % 3 == 0)
			n = n / 3;
		while (n % 5 == 0)
			n = n / 5;
		return (n == 1) ? true : false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 18;
		System.out.println(isUglyNumber(n));
		// 测试函数
		int ugly = GetUglyNumber_Solution(1600);
		System.out.println(ugly);
	}

}
