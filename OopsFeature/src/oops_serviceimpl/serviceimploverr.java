package oops_serviceimpl;

public class serviceimploverr extends calculatorimpl 
{

	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		serviceimploverr sl = new serviceimploverr();
		sl.sum(20.0,8.4);
	}
	public int sum(double a, double b)
	 {
		System.out.println("child method is called" + ":" + "diffrence is = " +(a-b) );
		return (int)(a-b);
		
     }
}