import java.util.Scanner;
public class Decryption {

	
	
	public static void main (String [] args)
	
	{
	
		
		Scanner scnr = new Scanner(System.in);
		
		String decrypt_int;
		
		System.out.print("Please enter an integer with 4 digits to decrypt:");
		
		decrypt_int = scnr.next();
		
		int first_digit;
		int second_digit;
		int third_digit;
		int fourth_digit;
		

		first_digit = Integer.parseInt(encrypt_int.substring(0,1));
		second_digit = Integer.parseInt(encrypt_int.substring(1,2));
		third_digit = Integer.parseInt(encrypt_int.substring(2,3));
		fourth_digit = Integer.parseInt(encrypt_int.substring(3,4));
		
		
		first_digit = (first_digit + 3) % 10;		
		second_digit =(second_digit +3) % 10;
	    third_digit =(third_digit + 3) % 10;
	    fourth_digit =(fourth_digit + 3) % 10;
		
		int temp1 = 0;
		temp1 = first_digit;
		first_digit = third_digit;
		third_digit = temp1;
		
		int temp2 = 0;
		temp2 = second_digit;
		second_digit = fourth_digit;
		fourth_digit = temp2;
		
		System.out.printf(" Result of decyrption: %d%d%d%d", first_digit,second_digit,third_digit,fourth_digit);
	}
}
