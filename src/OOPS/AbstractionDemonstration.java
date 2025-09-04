package OOPS;
abstract class Shape
{
	public abstract void  area(double r);
	
}
class Circle extends Shape
{
	public void area(double r)
	{
		System.out.println(Math.PI*r*r);
	}
}
class Square extends Shape
{
	public void area(double r)
	{
		System.out.println(r*r);
	}
}
public class AbstractionDemonstration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
