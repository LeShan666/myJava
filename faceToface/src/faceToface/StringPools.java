package faceToface;

/**
 * 问题：请问什么是字符串常量池？
 * 	1、字符串常量池的设计意图是什么？
 * 	2、字符串常量池在哪里？
 * 		JVM内存区域分为线程共享区和线程独占区；
 * 			线程共享区包括堆和方法区；
 * 			线程独占区包括java虚拟机栈、本地方法和程序计数器
 *		堆：
 *			1、功能单一，就是存储对象的实例
 *			2、并不是所有的对象实例都会分配到堆上去，java虚拟机栈也会分配。堆很容易出现
 *				OutOfMemoryError错误，内存溢出
 *		方法区：
 *			1、存放加载的类信息、常量、静态变量，静态代码块等信息
 *			2、类信息包括类的版本、字段、方法、接口等，方法区也称为永久代
 * 	3、如何操作字符串常量池？
 * 		通过new 操作符创建的字符串对象不指向字符串池中的任何对象，但是通过String.intern()方法指向其中的某一个
 *
 */

public class StringPools {

	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "hello";// 字符串常量池中已经存在了   所以等于是引用  
		System.out.println("str == str2"+(str1==str2));// true
		
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = s2.intern();
		System.out.println("s1==s3"+(s1==s3));  // true
	}
}
