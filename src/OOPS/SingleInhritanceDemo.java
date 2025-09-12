package OOPS;
class parent{
	public int x = 25;
}
class child extends parent{
	public int y = 60;
	public void add() {
		System.out.println(x+y);
	}
}
public class SingleInhritanceDemo {
	public static void main(String[] args) {
		child c = new child();
		c.add();
	}
}
