package OOPS;


class Cake {
public Cake() {
	System.out.println("Happy brithday");
}
public Cake(String msg,String shape) {
	System.out.println(msg);
	System.out.println(shape);	
}
public Cake(String msg,String shape,double price) {
	System.out.println(msg);
	System.out.println(shape);
	System.out.println(price);
}
	}
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cake c1 = new Cake();
		Cake c2 = new Cake("Happy birthday", "Circle");
		Cake c3 = new Cake("Happy Birthday", "Circle", 1000.00);
	}

}
