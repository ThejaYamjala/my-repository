
public class Driver {

	public static void main(String[] args) {
		/* 
		 * Declarartion: is where you actually declare a prticular vaiable
		 * Initialization:where you asssign some valueto that variable for the first time 
		 */ 
		
		//INTEGRAL TYPES
		byte myByte; //declaration
		myByte = 10; //intialization
		System.out.println(myByte);
		
		byte mySecondByte = 20;
		System .out.println("my Second byte : " +mySecondByte);
		
		myByte = 30;
		System.out.println(myByte);
		
		short myShort = 25_767;
		int myInt = 1_00_24_57; //_ is for readability, you cannot use , to separate digits
		long myLong = 2536476859l;
		long mySecondLong = 526387; //implicitly casted from int to long
		
		//type system.out and ctrl + space as shortcut
		System.out.println(myShort);
		System.out.println(myLong);
		System.out.println(myInt);
		System.out.println(mySecondLong);
		
		char c = 1000;
		System.out.println(c);
		
		//floating types
		float myFloat = 3.568f;
		double myDouble = 12.36773;
		System.out.println(myFloat);
		System.out.println(myDouble);
		
		//Character type
		c= 'A'; //note here ,that char literals are enclosed by single quotes ''.differenr from duble quotes.
				System.out.println(c);


		



		
		
	}

}
