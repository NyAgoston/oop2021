package feladat;

import java.util.Scanner;

public class szemelyfut {

	public static void main(String[] args) {
		Szemely sz1 = new Szemely();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kerem adja meg az adatokat: Nev, suly, magassag!");
		
		String inString = input.nextLine();
	    String[] strArray = inString.split(" ");
	        
	    sz1.setNev(strArray[0]);
	    sz1.setSuly(Integer.parseInt(strArray[1]));
	    sz1.setMagassag(Double.parseDouble(strArray[2]));
		
		input.close();
		
		System.out.println(sz1.getAdatok());
		
	}

}
