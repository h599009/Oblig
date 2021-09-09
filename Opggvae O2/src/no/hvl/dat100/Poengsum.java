package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Poengsum {

	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Tast inn gjennomsnitten  din."));	
		String  karakter = " " ;
				if( a >= 0 && a<=39 ) {
			System.out.println("F");
			karakter = "F";
		
		} else if  (a >= 40 && a <=49) {			
			System.out.println("E");
			karakter = "E";
		}	else if (a>= 50 && a <=59) {
			System.out.println("D");
			karakter = "D";
		}   else if (a>= 60 && a <=79) {
			System.out.println("C");
			karakter = "C";
		}   else if (a>= 80 && a <=89) {
			System.out.println("B");
			karakter = "B";
		}   else if (a>= 90 && a <=100) {
			System.out.println("A");
			karakter = "A";
		}   else {
			System.out.println("du har testet inn feil nummer");
			karakter = "Feil";
		}  
			
		
		System.out.println(a);
		JOptionPane.showMessageDialog(null, "din karakter er "  + karakter);
				
	}

}
