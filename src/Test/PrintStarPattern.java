package Test;

public class PrintStarPattern {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++)
		{
			for (int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println("");
//			for (int k=j; k>0; k--){
//		}

	}
	
		String demo="hello";
		demo.concat("World");
		System.out.println(demo);
		
		StringBuffer demo1= new StringBuffer("hello");
		demo1.append("World");
		demo1.reverse();
		System.out.println(demo1);
	}
}
