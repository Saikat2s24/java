package OOPS;
abstract class Shapes
{
	public abstract void  area(double r);
	
}
class Circles extends Shapes
{
	public void area(double r)
	{
		System.out.println(Math.PI*r*r);
	}
}
class Squares extends Shapes
{
	public void area(double r)
	{
		System.out.println(r*r);
	}
}
public class DynamicallyBiniding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Shapes sp1;//OBJECT REFERENCE
  Shapes sp2;
  Circles cr=new Circles();
  Squares sq=new Squares();
  sp1=cr;
  sp2=sq;
  sp1=sp2;//DYNAMIC BINDING 
  sp1.area(6.5);
  
	}

}