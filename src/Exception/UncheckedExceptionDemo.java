package Exception;
class Calc
{
	public int x=25;
	public int y=5;
	public void result()
	{
		try
		{
		  int res;
		   res=x/y;
		   System.out.println("RESULT IS:"+res);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();//EXCEPTION HANDLE HERE
		    System.out.println(ae);
		  	System.out.println(ae.getMessage());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println(ex);
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("ALWAYS EXECUTED");
		}
		
	}
	public void show()
	{
		System.out.println("X:"+x);
	}
}
public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Calc c=new Calc();
  c.result();
  c.show();
	}

}