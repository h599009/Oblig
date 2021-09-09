package no.hvl.dat100;


import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

	public static void main(String[] args) {

		
		double tall	=	Integer.parseInt(showInputDialog("testet inn et heltall"));
		double	i	=	1;
		double	fakultet =	1;
		
		if	(tall < 0) {
			showMessageDialog(null, "ugldige tall"	+	"\n"	+	fakultet);
			
		}else{

		for (i= 1; i <= tall; i++) {
			fakultet = fakultet * i;
			
		}
		System.out.println("fakultet av  " + tall + "  er " + fakultet);
		
		}
	}

}
