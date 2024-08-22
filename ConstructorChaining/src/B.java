
public class B{
	int a;
	String b;
	public B() {
		
		System.out.println("1");
	}
	public B(int a) {
		this("siva",10);
		System.out.println("2");
	}
	public B(String b) {
		this();
		System.out.println("3");
	}
	public B(int a,String b) {
		this(10);
		System.out.println("4");
	}
	public B(String b,int a) {
		this("s");
		System.out.println("5");
	}
}