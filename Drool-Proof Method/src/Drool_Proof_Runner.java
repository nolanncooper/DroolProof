import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Drool_Proof_Runner {

	public static void main(String[] args) throws IOException{
		
		String [] txt = new String[6];
		Scanner file = new Scanner(new File("Input"));
		for(int i = 0; i < txt.length; i++) {
			txt [i] = file.nextLine();
		}
		Scanner userInput = new Scanner(System.in);
		System.out.println("Which Currency Do You Want To Use: ");
		for(int r = 0; r< txt.length; r+=2) {
			System.out.println(r + ".  " + txt[r]);
		}
		int currIn = userInput.nextInt();
		int [] currency = new int [8];
		if(currIn == 1){
			for(int ii = 0; ii < currency.length; ii++) {
				currency[ii] = 
			}
		}
		if(currIn == 2) {
			
		}
		if(currIn == 3) {
			
		}
		
	
		System.out.println("Purchase: ");
		int purchase = userInput.nextInt();
		System.out.println("Payment: ");
		int payment = userInput.nextInt();
		int change = payment-purchase;
		System.out.println("Change: " + change);
		System.out.println();
		System.out.println("Breakdown");
		
		
		
		
		
		


//		String returnAmount = Integer.toString(change);
		int [] currency = {1,5,10,25,50,100,500,1000};
		int [] currency2 = {1,7,14,35,70,140,700,1400};
		
		
//		String [] arrayReturn = returnAmount.split("");
//		String newString = "";
//		for(int i = 0; i < arrayReturn.length-3; i++) {
//			newString += arrayReturn[i];
//		}
//		for(int i = arrayReturn.length-2; i < arrayReturn.length;i++) {
//			newString += arrayReturn[i];
//		}
//		int returnInt = Integer.parseInt(newString);
//		System.out.println(returnInt);
//		breakdown(change, currency2);
		
	

		
		

	}
	public static void breakdown(int n, int [] currency) {
		
			int update = n;
			if(update == 0) {
				
			}
			else {
				if(n/currency[currency.length-1] != 0) {
					System.out.println(currency[currency.length-1] +": " + n/currency[currency.length-1]);
					update = n%currency[currency.length-1];
					breakdown(update, remove(currency));
				}
				
				if(n/currency[currency.length-1] == 0) {
					System.out.println(currency[currency.length-1] + ": " + 0);
					breakdown(update, remove(currency));
				}
			}
				
	}
	
	public static int [] remove(int [] n) {
		int [] newArray = new int [n.length-1];
		for(int i = 0; i < n.length-1; i++) {
			newArray[i] = n[i];
		}
		return newArray;
	}

}
