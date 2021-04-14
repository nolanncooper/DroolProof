import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DroolProofRunner {

	public static void main(String[] args) throws IOException{
		
//		String [] txt = new String[8];
//		Scanner file = new Scanner(new File("Input"));
//		for(int i = 0; i < txt.length; i++) {
//			txt [i] = file.nextLine();
//		}
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("Which Currency Do You Want To Use: ");
//		for(int r = 0; r< txt.length; r++) {
//			if(r = 0) {
//				System.out.println(r + ".  " + txt[r]);
//
//			}
//		}
//		int currIn = userInput.nextInt();
//		int [] currency = new int [8];
//		if(currIn == 1){
//			String str = txt[1];
//			String [] txtArray = str.split(" ");
//			for(int ii = 0; ii < currency.length; ii++) {
//				currency[ii] = Integer.parseInt(txtArray[ii]);
//			}
//			for(int y : currency) {
//				System.out.println(y);
//			}
//		}
//		if(currIn == 2) {
//			
//		}
//		if(currIn == 3) {
//			
//		}
//		
//		if(currIn == 4) {
//			
//		}
		
		Scanner userInput = new Scanner(System.in);
		Scanner intInput = new Scanner(System.in);
		Scanner txtFile = new Scanner(new File("Input"));
		ArrayList <String> steve = new ArrayList <String>();
		while(txtFile.hasNext()) {
			steve.add(txtFile.nextLine());
		}
		
		System.out.println("WHICH CURRENCY WOULD YOU LIKE TO USE? ");
		for(int i = 0; i < steve.size(); i +=2) {
			System.out.println(steve.get(i));
		}
		String currencyInput = userInput.nextLine();
		int currencyIndex = 0;
		for(String str : steve) {
			if(str.equals(currencyInput)) {
				break;
			}
			currencyIndex++;
		}
		int [] currency = new int [8];
		String tempStr = steve.get(currencyIndex+1);
		String [] temps = tempStr.split(" ");
		
		for(int i = 0; i < currency.length; i++) {
			currency[i] = Integer.parseInt(temps[i]);
		}
		
	
		System.out.println("Purchase: ");
		int purchase = intInput.nextInt();
		System.out.println("Payment: ");
		int payment = intInput.nextInt();
		int change = payment-purchase;
		System.out.println("Change: " + change);
		System.out.println();
		System.out.println("Breakdown");
		
		breakdown(change, currency);
		
		
		
		


//		String returnAmount = Integer.toString(change);
		
		
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
	
	public static ArrayList<String> readLines(String fileName) {
		String line = null;
		ArrayList<String> theLines = new ArrayList<String>();
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				theLines.add(line);
			}
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
		return theLines;
	}

}
