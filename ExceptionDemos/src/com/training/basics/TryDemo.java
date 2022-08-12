package com.training.basics;

public class TryDemo {

	public static void main(String[] args) {
try {
		 System.out.println("welcome");
		 String value=args[0];
		 System.out.println("value got");
		 int num =Integer.parseInt(value);
		 System.out.println("number is "+num);
		 int res=100/num;
		 System.out.println("result "+res);
	}
catch(Exception e)
{
	System.out.println(e);
	e.printStackTrace();
}
 System.out.println("Completed");
}

}
