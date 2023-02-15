
public class Person {
	
	private static int a = 10; // 클래스 변수
	private int b = 5; //인스턴스 변수
	
	public static int getA() {
		return a;
	}
	public static void setA(int a) {
		Person.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
}
