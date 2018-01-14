package Test;
// Some comment
public class Reverse {

	public static void main(String... args) {
		// TODO Auto-generated method stub..
		
		System.out.println("Hello World");

		 //original number
        int number = 26541;
        int reversedNumber = 0;
        int temp = 0;
       
        while(number > 0){
               
                //use modulus operator to strip off the last digit
                temp = number%10;
               System.out.println(temp);
                //create the reversed number
                reversedNumber = reversedNumber * 10 + temp;
                number = number/10;
                System.out.print(number); 
        }
       
        //output the reversed number
        System.out.println("Reversed Number is: " + reversedNumber);
		
	}

}
