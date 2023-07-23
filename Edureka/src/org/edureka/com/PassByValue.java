package org.edureka.com;

public class PassByValue {
	public Integer add(Integer arg1, Integer arg2)
	{
		arg1 = 100;
		Integer result = arg1+arg2;
		return result;
	}
	public static void main(String[] args) {
		PassByValue ps = new PassByValue();
		int arg1 = 10;
		int arg2 = 20;
		System.out.println("Printing arg1 before passing it by value"+arg1);
		Integer result = ps.add(arg1, arg2);
		System.out.println("Printing arg1 after passing it by value to add method"+arg1);
		System.out.println("Result of addition is " + result);
	}

}
