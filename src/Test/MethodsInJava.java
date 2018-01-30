package Test;

public class MethodsInJava {

	public static void main(String[] args) {
		MethodsInJava obj= new MethodsInJava();
		obj.print();
		int d=obj.sum();
		System.out.println(d);
	}
	
	//does not return anything
	public void print(){
		System.out.println("Print Method--------------> does not return anything");
	}
	
	//No input, some output
	public int sum(){
		System.out.println("Sum Method--------------> retunrs Z");
		int x=10;
		int y=20;
		int z=x+y;
		return z;		
	}
	
	public float multiply(){
		System.out.println("multiply Method--------------> returns multiplication");
		float n1=(float) 5.2;
		int n2=2;
		float mul=(float) n1*n2;
		return mul;
	}
	
	public String abc(){
		System.out.println("abc Method--------------> returns String");
		String s="JavaSelenium";
		return s;
	}
	
	public String PrintNameAge(String s1, int p1){
		System.out.println("Method PrintNameAge");
		String NameAge= s1+p1;
		return NameAge;
		
	}
}
