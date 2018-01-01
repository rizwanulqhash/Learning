package Test;

public class Splitstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I am rizwan";
		String[] x = s.split(" ");
		for(int i=0; i< x.length; i++){
			System.out.println(x[i]);
		}
		
		for(String a: x){
			System.out.println(a);
		}
		
		Splitstring ss = new Splitstring();
		ss.testMethod();
		
	}

	void testMethod() {
		// TODO Auto-generated method stub
		int i=8;
	}

}
