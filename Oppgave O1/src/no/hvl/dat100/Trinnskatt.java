package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Trinnskatt {

	public static void main(String[] args) {
				
		double a = Double.parseDouble(JOptionPane.showInputDialog("Tast inn bruttoinntekt din."));	
	
		if( a <= 164100 ) {
			a = a * 0;
		
		} else if  (a >= 164101 && a <=230950) {			
			a = a * 0.0095;	
			
		}	else if (a>= 230951 && a <=580650) {
			a = a * 0.00241;
			
		}   else if (a>= 580651 && a <=934050) {
			a = a * 0.115;
			
		}   else if (a >= 93451){	
			a = a * 0.1452;
			
		}
		
		System.out.println(a);
		JOptionPane.showMessageDialog(null, "Trinnskatt er " + a);
				
			}

}

