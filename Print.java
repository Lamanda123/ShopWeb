package com.northsoft.test;

import java.util.Arrays;
import java.util.Scanner;

public class Print {
	public static void main(String[] args) {
		// 1.计算阶乘
		System.out.println("请输入要计算阶乘的数字：");
		Scanner scanner1 = new Scanner(System.in);
		int num = scanner1.nextInt();
		factorial(num);
		// 2.打印正方形
		System.out.println("请输入正方形的周长：");
		Scanner scanner2 = new Scanner(System.in);
		int length1 = scanner2.nextInt();
		printSquare(length1);
		// 3.九九乘法表
		printTable();
		// 4.打印空心正方形
		System.out.println("请输入空心正方形的周长：");
		Scanner scanner3 = new Scanner(System.in);
		int length2 = scanner3.nextInt();
		printHollowSquare(length2);
		// 5. (扩展)打印房子
		int n = 5;
		printHouse(n);
		// 6.合并数组
		array();
		// 8.
		perfectNumber();
		// 9.小球问题
		rebound();
		// 10.
		acc();
		// 11.打印杨辉三角
		ytriangle();
		// 12.一百元钱买百鸡,公鸡每只五元，母鸡每只三元； 小鸡因小价钱低，三只小鸡是一元,公鸡母鸡和小鸡，请你算出有几种购买方法?
		chicken();
		// 13.生兔子问题
		System.out.println("13.生兔子问题");
		System.out.println("请输入月份");
		Scanner scanner5 = new Scanner(System.in);
		int month = scanner5.nextInt();
		for (int i = 1; i <= month; i++) {
			System.out.println("第" + i + "个月的兔子为：" + rabbit(i));
		}
		// 14
		// 选择排序
		int[] array1 = { 8, 2, 3, 7, 1 };
		array1 = selectionSort(array1);
		System.out.println(Arrays.toString(array1));
		// 冒泡排序
		int[] array2 = { 7, 8, 3, 2, 1 };
		array2 = bubbleSort(array2);
		System.out.println(Arrays.toString(array2));
		// 15.有n个人围成一圈,顺序排号,从第一个人开始报数(从1到3报数),凡报道3的人退出圈子,问最后留下的是原来第几号的那位
		System.out.println("请输入人数：");
		Scanner scanner4 = new Scanner(System.in);
		int n1 = scanner4.nextInt();
		person(n1);
		// 16.加密
		System.out.println("请输入密码：");
		Scanner scanner6 = new Scanner(System.in);
		int n2 = scanner6.nextInt();
		data(n2);
	}

	// 1.计算10的阶乘
	public static void factorial(int num) {
		System.out.println("1.计算阶乘");
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum *= i;
		}
		System.out.println(sum);
	}

	// 2.打印正方形
	public static void printSquare(int length1) {
		System.out.println("2.打印正方形");
		for (int i = 0; i < length1; i++) {
			for (int j = 0; j < length1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
	}

	// 3.打印九九乘法表
	public static void printTable() {
		System.out.println("3.打印九九乘法表：");
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + " ");

			}
			System.out.println("");
		}

	}

	// 4.打印空心正方形
	public static void printHollowSquare(int length2) {
		System.out.println("4.打印空心正方形");
		for (int i = 0; i < length2; i++) {
			for (int j = 0; j < length2; j++) {
				if (i == 0) {
					System.out.print("*" + " ");

				} else if (i == length2 - 1) {
					System.out.print("*" + " ");
				} else if (j == 0 || j == length2 - 1) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}

	}

	// 5. (扩展)打印房子

	public static void printHouse(int n) {
		System.out.println("5.打印房子");

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= 10; j++) {
				if (j == 5 - i + 1) {
					System.out.print("*****");
				} else if (j == 5 + i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 15; j++) {
				if (i == 0) {
					System.out.print("*");

				} else if (i == 6) {
					System.out.print("*");
				} else if (j == 0 || j == 14) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	// 6. 合并数组
	public static void array() {
		System.out.println("6.合并数组");
		int[] A = { 1, 7, 9, 11, 13, 15, 17, 19 };
		int[] B = { 2, 4, 6, 8, 10 };
		int[] C = new int[A.length + B.length];
		System.arraycopy(A, 0, C, 0, A.length);
		System.arraycopy(B, 0, C, A.length, B.length);
		System.out.println("排序前：");
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i] + " ");
		}
		System.out.println("");
		Arrays.parallelSort(C);
		System.out.println("升序后的数组：");

		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i] + " ");
		}
		System.out.println("");

	}

	// 7. 水仙花数
	public static void flowers() {
		System.out.println("7.水仙花数");
		int a = 0, b = 0, c = 0;
		for (int i = 100; i < 1000; i++) {
			a = i / 100;
			b = (i % 100) / 10;
			c = i % 10;
			if (i == Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) {
				System.out.println("水仙花数：" + i);
			}
		}

	}

	// 8.一个数如果恰好等于它的因子之和,这个数就成为"完数".例如6=1+2+3.编程:找出1000以内的所有完数

	public static void perfectNumber() {
		System.out.println("8.打印完数");
		int i, j;
		for (i = 0; i <= 1000; i++) {
			int sum = 0;
			for (j = 1; j <= i / 2; j++) {
				if (i % j == 0)
					sum = sum + j;
			}
			if (sum == i)
				System.out.print(i + " ");
		}
	}

	// 9.一个小球从100高度自由落下,每次落地后反跳回原高度的一半,再落下，求它在第十次落地时,共经过多少米?第10次反弹多高?
	public static void rebound() {
		System.out.println("9.小球反弹问题");
		double sum = 100, height = 100;
		for (int i = 1; i <= 9; i++)//
		{
			height = height / 2;
			sum = sum + height * 2;
		}
		height = height / 2;
		System.out.println("第十次落地时的高度是：" + height + "\n小球共经过：" + sum + "米");
	}

	// 10.求整数1~100的累加值，但要求跳过所有个位为3的数。（使用for循环实现）
	public static void acc() {
		System.out.println("10.求整数1~100的累加值，但要求跳过所有个位为3的数");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 10 != 3) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	// 11.题目：打印出杨辉三角形（要求打印出10行)
	public static void ytriangle() {
		System.out.println("杨辉三角");
		int triangle[][] = new int[10][];
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				if (i == 0 || j == 0 || j == i) {
					triangle[i][j] = 1;
				} else {
					triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];
				}
				System.out.print(triangle[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// 12.一百元钱买百鸡,公鸡每只五元，母鸡每只三元； 小鸡因小价钱低，三只小鸡是一元,公鸡母鸡和小鸡，请你算出有几种购买方法?
	public static void chicken() {
		System.out.println("12.买鸡");
		int cock = 5;
		int hen = 3;
		int choice = 0;
		for (int n = 20; n >= 0; n--) {
			for (int m = 33; m >= 0; m--) {
				for (int k = 0; k <= 100; k++) {
					if (n * cock + m * hen + k == 100) {
						choice++;
						System.out.println("公鸡" + n + "母鸡" + m + "小鸡" + (3 * k));
					}
				}
			}
		}
		System.out.println("购买方法一共有：" + choice + "种");

	}

	// 13.古典问题:有一对兔子,从出生后第三个月起每个月都生一对兔子,小兔子长到第三个月后每个月又生一对兔子,假如兔子都不死,问每个月的兔子总数为多少?

	public static int rabbit(int x) {

		if (x == 1 || x == 2)
			return 1;
		else
			return rabbit(x - 1) + rabbit(x - 2);
	}

	// 14.实现冒泡排序与选择排序
	// 选择排序
	public static int[] selectionSort(int[] array1) {
		System.out.println("选择排序");
		for (int i = 0; i < array1.length - 1; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] > array1[j]) {
					int temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}
		}
		return array1;
	}

	// 冒泡排序
	public static int[] bubbleSort(int[] array2) {
		System.out.println("冒泡排序");
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length - i - 1; j++) {
				if (array2[j] > array2[j + 1]) {
					int temp = array2[j];
					array2[j] = array2[j + 1];
					array2[j + 1] = temp;
				}
			}
		}
		return array2;
	}

	// 15.有n个人围成一圈,顺序排号,从第一个人开始报数(从1到3报数),凡报道3的人退出圈子,问最后留下的是原来第几号的那位
	public static void person(int n1) {
		System.out.println("15.留下的人是几号的问题");
		boolean[] arr = new boolean[n1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;

		}
		int t = 0, len = arr.length;
		while (len > 1) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]) {
					t++;
				}
				if (t == 3) {
					t = 0;
					arr[i] = false;
					len--;
				}
			}
		}

		System.out.println("最后的情况：" + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]) {
				System.out.println("最后留下的原来的位置：" + (i + 1));
			}
		}
	}

	// 16.
	// 题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
	public static void data(int n2) {
		System.out.println("16.加密");
		int[] d = new int[4];
		d[0] = n2 / 1000;
		d[1] = (n2 / 100) % 10;
		d[2] = (n2 / 10) % 100;
		d[3] = n2 % 10;
		int sum = 0;
		int num1 = 0;
		for (int i = 0; i < 4; i++) {
			d[i] += 5;
			sum += d[i];
			num1 = sum % 10;
		}
		d[0] = num1 / 1000;
		d[1] = (num1 / 100) % 10;
		d[2] = (num1 / 10) % 100;
		d[3] = num1 % 10;
		int temp1 = 0, temp2 = 0;
		temp1 = d[0];
		d[0] = d[3];
		d[3] = temp1;
		temp2 = d[2];
		d[2] = d[3];
		d[3] = temp2;
		System.out.println("加密后的数字是：" + Arrays.toString(d));
	}
}
