package com.training.basics;

public class MultiCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 System.out.println("welcome");
			 String value=args[0];
			 System.out.println("value got");
			 int num =Integer.parseInt(value);
			 System.out.println("number is "+num);
			 int res=100/num;
			 System.out.println("result "+res);
			 int marks[]=null;
			 System.out.println(marks[10]);
		}
	catch(ArithmeticException ae)
	{
		System.out.println("please enter a number greater than zero");
		ae.printStackTrace();
	}
		catch(NumberFormatException  ne) {
			System.out.println();
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("please enter a number");
		}
		catch(NullPointerException npe)
		{
			System.out.println("please enter a number");
		}
	 System.out.println("Completed");
	}
	}


