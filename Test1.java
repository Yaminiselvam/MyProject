package staticpractice;
class TestLab {
	static int method(String a) {
		System.out.println("in static method of TestLab" + " Coming from " + a);
		System.out.println("b is " + b);
		return 6;	}
	static int a = method("Line 11");
	static int b = 7;
	TestLab() {
		System.out.println("Inside test lab constructor");	}
	static {
		System.out.println("In static block of TestLab");	}}
public class Test1 {
	public static void main(String[] args) {
		System.out.println("inside main method of Test 1");
		@SuppressWarnings("unused")
		int a = TestLab.method("Line 26");
	}	// static Test ref=new Test();
	Test1() {
		System.out.println("Default Constructor of Test1");}
	{
		System.out.println("In instance block of Test1");	}
	static int d = TestLab.method("Line 37");
	static int e = methodOfTest1();
	static {
		System.out.println("In Static Block of Test1");	}
	static int methodOfTest1() {
		System.out.println("inside static method:mehtodOfTest1()");
		return 3;
	}
}