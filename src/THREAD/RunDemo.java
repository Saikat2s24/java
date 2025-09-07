package THREAD;
class FirstThreads extends Thread
{
	public void run()
	{
		try
		{
		   for(int i=500;i<=600;i++)
		  {
			System.out.println("THREAD1:"+i);
			Thread.sleep(75);
		   }
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}
	class SecondThreads extends Thread
	{
		public void run()
		{
			try
			{
			   for(int i=600;i<=650;i++)
			  {
				System.out.println("THREAD2:"+i);
				Thread.sleep(100);
			  }
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
public class RunDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirstThreads ft=new FirstThreads();
SecondThreads sd=new SecondThreads();
ft.run();
sd.run();
	}

}