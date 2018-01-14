import javax.swing.JOptionPane;

//Version 0.1b

public class Main {

	public static void main(String[] args) {
		int i = 0;
		char rechenart = 'ß';
		while(i == 0) {
			try {
		rechenart = JOptionPane.showInputDialog("Möchtest du '+' '-' '*' oder '/' rechnen").charAt(0);
		if(rechenart == '+' || rechenart == '-' || rechenart == '*' || rechenart == '/') i++; //NO Error
			}
			catch(IndexOutOfBoundsException e) {}
		}
		i = 0; //Reset i
		double wert1 = 0;
		while(i == 0) {
			try {
		String rawwert1 = JOptionPane.showInputDialog("Bitte gebe hier die erste Zahl ein");
		rawwert1 = rawwert1.replace(',', '.');
		wert1 = Double.parseDouble(rawwert1);
		i++; //NO Error
			}
			catch(Exception e){}
		}
		i = 0; //Reset i
		double wert2 = 0;
		while(i == 0) {
		try {
		String rawwert2 = JOptionPane.showInputDialog("Bitte gebe hier die zweite Zahl ein");
		rawwert2 = rawwert2.replace(',', '.');
		wert2 = Double.parseDouble(rawwert2);
		i++; //NO Error
		}
		catch(Exception e) {}
	}
		double ergebnis = 0;
		if(rechenart == '+') ergebnis = wert1 + wert2;
		if(rechenart == '-') ergebnis = wert1 - wert2;
		if(rechenart == '*') ergebnis = wert1 * wert2;
		if(rechenart == '/') ergebnis = wert1 / wert2;
		
		if(i == 1)JOptionPane.showMessageDialog(null, "Das Ergebnis der Rechnung ist " + ergebnis, "Wir haben über dein Ergebnis abgestimmt", JOptionPane.OK_OPTION);
	}

}