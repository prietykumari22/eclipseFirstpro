package oops_serviceimpl;

import oops_service.Calculator;

public class calculatorimpl implements Calculator
{

	public static void main(String[] args) {
		calculatorimpl s = new calculatorimpl();
		s.sum();
		s.sum(4,5);
		s.sum(4.5f,5.0f);
		s.sum(8,27.5f);
		
	}
	public void sum() {
		System.out.println("default method is called");
		
	}
	public int sum(int a, int b){
		System.out.println("int int method is called" +":"+ "sum is = " +(a+b) );
	return a+b;
		
	}
	
		
	public float sum(float a, float b){
		System.out.println("float float method is called" +":"+"sum is = " +(a+b));
		return a+b;
		
	}
	
	public double sum( int a, float b) {
		System.out.println("int float method method is called" +":"+"sum is = " +(a+b));
		return a+b;
		
	}
	public int sum(double a, double b)
	 {
		System.out.println("parent method is called" +":"+"sum is = " +(int)(a+b) );
		return (int)(a+b);
		
    }
		
}

	
		// TODO Auto-generated method stub

	


