package com.excp;

import java.util.Scanner;

public class Exp1 {

	public static void main(String[] args) {
//		String str = "java";
//		
//		System.out.println(str.charAt(0));
//
//		int []arr = {12,33,44};
//		
//		System.out.println(arr[3]);
//		
//		System.out.println("Done.");
		
		try {
			System.out.println(10/5);
			
			String str = "java";
			
			System.out.println(str.charAt(1));
			
			int x = Integer.parseInt("11.00");
			
			System.out.println(x);
		}
		catch(ArithmeticException eq) {
			System.out.println("don't enter zero den");
		}
		catch(NullPointerException eqa){
			System.out.println("String input mandatory");
		}
		catch(StringIndexOutOfBoundsException eqae) {
			System.out.println("Check Array Length");
		}
		catch(Exception e) {
			System.err.println(e);
		}
		finally {
			//close the resources
			try (Scanner s = new Scanner(System.in)){
					
			}
			catch(Exception e){
				
			}
			finally {
				
			}
		}
	}

}
