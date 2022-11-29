package de.zerocode.util;

public class BufferExamples {
	public static void main(String[] args) {
		String name = "sujwal";
		name=name.replace('u', 'j');
		System.out.println(name.replace('u', 'j'));
		System.out.println(name);
		
		name.toLowerCase();
		StringBuffer one = new StringBuffer("sujwal");
		one.append(2.34); //float
		one.append(24); //int
		one.append('a'); // char
		one.append("good morning"); //string
		one.append(name); //
		one.append(true);//boolean
		System.out.println(one);
		one.reverse();
		System.out.println(one);
		System.out.println(one.length());
		System.out.println(one.capacity());
		System.out.println(one.replace(0, 6, "Hello"));
		System.out.println(one);
		System.out.println(one.insert(0, "h"));
		System.out.println(one.delete(0, 1));
		one.replace(1, 2, "j");
		one.delete(0, 10);
		one.reverse();
		System.out.println(one);
	}

}
